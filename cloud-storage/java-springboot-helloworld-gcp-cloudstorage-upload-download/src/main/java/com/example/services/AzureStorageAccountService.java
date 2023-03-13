package com.example.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class AzureStorageAccountService {
	
	@Value("${azure.blob.connection}")
	private String azureBlobConnection;
	
	@Value("${azure.blob.container}")
	private String azureBlobContainer;
	
	private BlobContainerClient containerClient() {
		
        BlobServiceClient serviceClient = new BlobServiceClientBuilder()
                .connectionString(azureBlobConnection).buildClient();
        BlobContainerClient container = serviceClient.getBlobContainerClient(azureBlobContainer);
        return container;
        
    }
	
	public List<String> listFiles() {

        BlobContainerClient container = containerClient();
        List<String> list = new ArrayList<String>();
        for (BlobItem blobItem : container.listBlobs()) {
            list.add(blobItem.getName());
        }
 
        return list;
        
    }
	
	public void uploadFile(String fileName, InputStream is, long length) {
		
        BlobClient client = containerClient().getBlobClient(fileName);
        client.upload(is, length, true);

    }
	
	public ByteArrayOutputStream downloadFile(String fileName) {
		
        BlobContainerClient containerClient = containerClient();
        BlobClient blobClient = containerClient.getBlobClient(fileName);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        blobClient.downloadStream(os);
        return os;
        
    }
	
	public void deleteFile(String fileName) {
		
        BlobClient client = containerClient().getBlobClient(fileName);
        client.deleteIfExists();

    }

}
