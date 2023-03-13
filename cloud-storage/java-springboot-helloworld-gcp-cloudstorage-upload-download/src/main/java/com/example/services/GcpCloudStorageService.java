package com.example.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

@Service
public class GcpCloudStorageService {
	
	private static Storage storage = StorageOptions.getDefaultInstance().getService(); 
	
	public String upload(File file, String bucketName) throws IOException {
		
		try {			
			BlobInfo blobInfo = storage.create(
				BlobInfo.newBuilder(bucketName, file.getName()).build(),
				new FileInputStream(file).readAllBytes()
			);
			
			return blobInfo.getMediaLink();
			
		}catch(IllegalStateException e){
			throw new RuntimeException(e);
		}
		
  	}

}
