package com.example.controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.HelloWorldJson;
import com.example.services.GcpCloudStorageService;

@RestController
public class HelloWorldController {
	
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Value("${file.name}")
	private String fileName;
	
	@Value("${bucket.name}")
	private String bucketName;
	
	private GcpCloudStorageService gcpCloudStorageService;

	@Autowired
	public HelloWorldController(GcpCloudStorageService gcpCloudStorageService) {
		this.gcpCloudStorageService = gcpCloudStorageService;
	}



	@RequestMapping(value="/")
	public HelloWorldJson helloWorld() throws IOException {
		
		String message = uploadDownloadAndGetMessageFromGcp();
		
		logger.info("Application was called with message: {}", message);
		
		return new HelloWorldJson(message);
		
	}
	
	private String uploadDownloadAndGetMessageFromGcp() throws IOException {
		
		String message = null;
		
		File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
		gcpCloudStorageService.uploadFile(file, bucketName);
		ByteArrayOutputStream baos = gcpCloudStorageService.downloadFile(file.getName(), bucketName);
		message = new String(baos.toString());
		gcpCloudStorageService.deleteFile(file.getName(), bucketName);
		
		return message;
		
	}
	
}
