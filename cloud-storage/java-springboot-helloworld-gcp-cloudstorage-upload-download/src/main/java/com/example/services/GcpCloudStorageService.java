package com.example.services;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

@Service
public class GcpCloudStorageService {
	
	private static Storage storage = StorageOptions.getDefaultInstance().getService(); 
	
	public List<Bucket> getBucketList() {
		
		List<Bucket> bucketList = new ArrayList<Bucket>();
		
		for (Bucket bucket : storage.list().iterateAll()) {
			bucketList.add(bucket);
		}
		
		return bucketList;
		
	}
	
	public void uploadFile(File file, String bucketName) throws IOException {
		
		BlobId blobId = BlobId.of(bucketName, file.getName());		
		BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
		storage.create(blobInfo, Files.readAllBytes(file.toPath()));
		
  	}
	
	public void updateFile(File file, String bucketName) throws IOException {
		
		BlobId blobId = BlobId.of(bucketName, file.getName());	
		Blob blob = storage.get(blobId);
		WritableByteChannel channel = blob.writer();
		channel.write(ByteBuffer.wrap(Files.readAllBytes(file.toPath())));
		channel.close();
		
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
