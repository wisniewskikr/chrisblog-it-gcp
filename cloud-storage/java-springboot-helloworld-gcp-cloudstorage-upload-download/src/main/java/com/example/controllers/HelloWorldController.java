package com.example.controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.HelloWorldJson;
import com.example.services.AzureStorageAccountService;
import com.example.services.GcpCloudStorageService;

@RestController
public class HelloWorldController {
	
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Value("${file.name}")
	private String fileName;
	
	private GcpCloudStorageService gcpCloudStorageService;

	@Autowired
	public HelloWorldController(GcpCloudStorageService gcpCloudStorageService) {
		this.gcpCloudStorageService = gcpCloudStorageService;
	}



	@RequestMapping(value="/")
	public HelloWorldJson helloWorld() throws IOException {
		
		File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
		gcpCloudStorageService.upload(file);
		
		String message = "Hello World";
		
		logger.info("Application was called with message: {}", message);
		
		return new HelloWorldJson(message);
		
	}
	
//	private String uploadDownloadAndGetMessageFromAzzure() throws FileNotFoundException {
//		
//		String message = null;
//		
//		File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
//		azureStorageAccountService.uploadFile(file.getName(), new FileInputStream(file), file.length());
//		ByteArrayOutputStream baos = azureStorageAccountService.downloadFile(file.getName());
//		message = new String(baos.toString());
//		azureStorageAccountService.deleteFile(fileName);
//		
//		return message;
//		
//	}
	
}
