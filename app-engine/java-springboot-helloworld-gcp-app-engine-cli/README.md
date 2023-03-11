USAGE
-----

> **NOTE** This usage assumes that user possesses **Google Account** with existing **GCP Project**. User has also installed following tools: **GCP Cloud Cli**.

Steps:
1. (Optional) Connect with GCP Account and Project with `gcloud init`
1. Deploy application with `gcloud app deploy pom.xml --appyaml app.yaml`
1. Display result in browser with `gcloud app browse`
1. Clean up
     * It's not possible to delete only GCP App Engine. You have to remove whole GCP Project. How to do it you can find here: `https://github.com/wisniewskikr/chrisblog-it-gcp/tree/main/other/gcp-project-console` 


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to install **Java Spring Boot** application on **GCP App Engine** using **GCP Cloud Cli** tool. 

> **NOTE** Please be aware that it's possible to have only one GCP App Engine on one GCP Project.

##### Terminology
Terminology explanation:
* **GCP**: it means Google Cloud Platform (GCP) and it provides compute services via Internet
* **Cloud Cli**: tool which enables managing GCP Resources via command lines
* **GCP App Engine**: it's GCP service which enables deploying web applications on Google Cloud
* **Java Spring Boot application**: it's application in Java programming language which uses Spring Boot framework. This application displays "Hello World" message, port and uuid in JSON format 

##### Flow
The following flow takes place in this project:
1. User deploys application on GCP App Engine
1. User opens application URL in browser
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
* Installed **GCP Cloud Cli** (tested on version 421.0.0)

##### Preconditions - Actions
* Created **Google Account**
* Created **GCP Project**: `https://github.com/wisniewskikr/chrisblog-it-gcp/tree/main/other/gcp-project-console`