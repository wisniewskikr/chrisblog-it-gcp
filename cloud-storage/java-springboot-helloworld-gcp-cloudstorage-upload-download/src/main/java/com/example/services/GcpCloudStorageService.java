package com.example.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.Storage.BlobTargetOption;
import com.google.cloud.storage.Storage.PredefinedAcl;
import com.google.cloud.storage.StorageOptions;

@Service
public class GcpCloudStorageService {
	
	private static Storage storage = StorageOptions.getDefaultInstance().getService(); 
	
	public String upload(File file) throws IOException {
		
		try {			
			BlobInfo blobInfo = storage.create(
				BlobInfo.newBuilder("helloworld-wisniewskir-bucket", file.getName()).build(),
				new FileInputStream(file).readAllBytes(),
				BlobTargetOption.predefinedAcl(PredefinedAcl.PUBLIC_READ)
			);
			
			return blobInfo.getMediaLink();
			
		}catch(IllegalStateException e){
			throw new RuntimeException(e);
		}
		
  	}

}
