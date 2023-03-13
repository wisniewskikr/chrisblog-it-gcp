USAGE
-----

> **NOTE** This usage assumes that user possesses **Google Account** with existing **GCP Project**. It also assumes that JSON file **src/main/resources/gcp-credentials.json** is updated with private key of Service Account with role **Storage Object Admin**. 

Steps:
1. Create GCP Cloud Storage. Please check section **CREATE GCP CLOUD STORAGE**
1. Update file **src/main/resources/application.properties** with properties:
     * spring.cloud.gcp.credentials.location : location to JSON file with GCP credentials to Service Account with role **Storage Object Admin**
1. Start application with `mvn spring-boot:run`
1. Visit `http://localhost:8080`
1. Delete GCP Cloud Storage. Please check section **DELETE GCP CLOUD STORAGE**


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to upload and download files from and to service **GCP Cloud Storgae** using **Java Spring Boot** application. Service is created via **GCP Console**.

##### Terminology
Terminology explanation:
* **GCP**: it means Google Cloud Platform (GCP). There are compute services provided by Google via Internet
* **GCP Cloud Storage**: it's GCP service which enables storing files
* **GCP Console**: it's web application which enables working with Google Cloud Platform (GCP) via internet's browser
* **Java Spring Boot application**: it's application in Java programming language which uses Spring Boot framework. This application displays "Hello World" message which is first stored in storage and then read from storage

##### Flow
The following flow takes place in this project:
1. User creates Service Account with role **Storage Object Admin**
1. User downloads private key of above Service Account
1. User creates GCP Cloud Storage
1. User updates file **src/main/resources/application.properties** with private key of above Service Account
1. User runs application
1. User via any browser sends request to application for a content
1. Application HelloWorld returns response with message which was first stored and then read from storage. This response is presented to User via browser
1. User cleans up

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Java**: `https://docs.google.com/document/d/119VYxF8JIZIUSk7JjwEPNX1RVjHBGbXHBKuK_1ytJg4/edit?usp=sharing`
* **Maven**: `https://docs.google.com/document/d/1cfIMcqkWlobUfVfTLQp7ixqEcOtoTR8X6OGo3cU4maw/edit?usp=sharing`
* **Git**: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`
* **Spring Boot**: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`
* **GCP**: `https://docs.google.com/document/d/1uXYLLTgD9b3RPs83S57WAsfCnuOrR9RdTJ7HLcaRzNY/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)

##### Preconditions - Actions
* Created **Google Account**
* Created **GCP Project**: `https://github.com/wisniewskikr/chrisblog-it-gcp/tree/main/other/gcp-project-console`
* Created **Service Account** with role **Storage Object Admin**. Private key of this account is downloaded: `https://github.com/wisniewskikr/chrisblog-it-gcp/tree/main/other/gcp-iam-service-account`


CREATE GCP CLOUD STORAGE
------------------------

Link:
* https://console.cloud.google.com/

![My Image](readme-images/create-cloud-storage-01.png)

![My Image](readme-images/create-cloud-storage-02.png)

![My Image](readme-images/create-cloud-storage-03.png)

![My Image](readme-images/create-cloud-storage-04.png)

![My Image](readme-images/create-cloud-storage-05.png)


DELETE GCP CLOUD STORAGE
------------------------

Link:
* https://console.cloud.google.com/

![My Image](readme-images/delete-cloud-storage-01.png)

![My Image](readme-images/delete-cloud-storage-02.png)

![My Image](readme-images/delete-cloud-storage-03.png)

![My Image](readme-images/delete-cloud-storage-04.png)