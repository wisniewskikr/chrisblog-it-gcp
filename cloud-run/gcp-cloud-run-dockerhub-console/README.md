USAGE
-----

> **NOTE** This usage assumes that user possesses **Google Account** with existing **GCP Project**. It also assumes that application's **Docker Image** is stored on public **Docker Hub** repository.

Steps:
1. Create GCP Cloud Run. Please check section **CREATE GCP CLOUD RUN**
1. Delete GCP Cloud Run. Please check section **DELETE GCP CLOUD RUN**


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to deploy application **Docker Image** on **GCP Cloud Run** using **GCP Console**. This Docker Image is stored on public **Docker Hub** repository and it's image of **Java Spring Boot** application.

##### Terminology
Terminology explanation:
* **GCP**: it means Google Cloud Platform (GCP). There are compute services provided by Google via Internet
* **GCP Cloud Run**: it's GCP service which enables deploying of Docker Images on Google Cloud
* **GCP Console**: it's web application which enables working with Google Cloud Platform (GCP) via internet's browser
* **Docker Hub**: it's repository where Docker Images are stored
* **Java Spring Boot application**: it's application in Java programming language which uses Spring Boot framework. This application displays "Hello World" message, port and uuid in JSON format 

##### Flow
The following flow takes place in this project:
1. User creates GCP Cloud Run
1. User opens deployed application URL in browser
1. User via any browser sends request to application for a content
1. Application HelloWorld returns response with JSON containing message, port and UUID. This response is presented to User via browser
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
* Prepared **Source Code** of application: `https://github.com/wisniewskikr/java-springboot-helloworld`
* Prepared **Docker Image** of application: `https://hub.docker.com/repository/docker/wisniewskikr/java-springboot-helloworld/general`


CREATE GCP CLOUD RUN
--------------------

Link:
* https://console.cloud.google.com/

![My Image](readme-images/create-cloudrun-01.png)

![My Image](readme-images/create-cloudrun-02.png)

![My Image](readme-images/create-cloudrun-03.png)

![My Image](readme-images/create-cloudrun-04.png)

![My Image](readme-images/create-cloudrun-05.png)

![My Image](readme-images/create-cloudrun-06.png)


DELETE GCP CLOUD RUN
--------------------

Link:
* https://console.cloud.google.com/

![My Image](readme-images/delete-cloudrun-01.png)

![My Image](readme-images/delete-cloudrun-02.png)

![My Image](readme-images/delete-cloudrun-03.png)

![My Image](readme-images/delete-cloudrun-04.png)