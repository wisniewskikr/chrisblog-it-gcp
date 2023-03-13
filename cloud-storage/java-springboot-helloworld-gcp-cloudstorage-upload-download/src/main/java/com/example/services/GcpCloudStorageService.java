package com.example.services;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

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
	
	public ByteArrayOutputStream downloadFile(String fileName, String bucketName) throws IOException {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		BlobId blobId = BlobId.of(bucketName, fileName);
		byte[] content = storage.readAllBytes(blobId);
		baos.write(content);
		return baos;
		
	}
	
	public void deleteFile(String fileName, String bucketName) {
		
		BlobId blobId = BlobId.of(bucketName, fileName);
		storage.delete(blobId);
		
	}

}
