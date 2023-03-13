package com.example.services;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

import java.nio.ByteBuffer;

import com.google.cloud.ReadChannel;

@Service
public class GcpCloudStorageService {
	
	private static Storage storage = StorageOptions.getDefaultInstance().getService(); 
	
	public String uploadFile(File file, String bucketName) throws IOException {
		
		String result = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);			
			BlobInfo blobInfo = storage.create(
				BlobInfo.newBuilder(bucketName, file.getName()).build(),
				fis.readAllBytes()
			);
			
			result = blobInfo.getMediaLink();
			
		}catch(IllegalStateException e){
			throw new RuntimeException(e);
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
		
		return result;
		
  	}
	
	public ByteArrayOutputStream downloadFile(String fileName, String bucketName) {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		try (ReadChannel channel = storage.reader(bucketName, fileName)) {
			ByteBuffer bytes = ByteBuffer.allocate(64 * 1024);
			while (channel.read(bytes) > 0) {
				bytes.flip();
				baos.writeBytes(bytes.array());
				bytes.clear();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return baos;
		
	}

}
