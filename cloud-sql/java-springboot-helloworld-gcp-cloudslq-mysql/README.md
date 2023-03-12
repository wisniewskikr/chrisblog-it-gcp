USAGE
-----

> **NOTE** This usage assumes that user possesses **Google Account** with existing **GCP Project**.

Steps:
1. Create GCP Cloud SQL. Please check section **CREATE GCP CLOUD SLQ**
1. Update file **src/main/resources/application.properties** with data
     * URL
     * DB
     * username
     * password
1. Start application with `mvn spring-boot:run`
1. Visit `http://localhost:8080`
1. Delete GCP Cloud SQL. Please check section **DELETE GCP CLOUD SQL**


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to connect **Java Spring Boot** application with database type **MySQL** from **GCP Cloud SQL**. This database was configured via **GCP Console**.

##### Terminology
Terminology explanation:
* **GCP**: it means Google Cloud Platform (GCP). There are compute services provided by Google via Internet
* **GCP Cloud SQL**: it's GCP service which enables creating databases
* **GCP Console**: it's web application which enables working with Google Cloud Platform (GCP) via internet's browser
* **Java Spring Boot application**: it's application in Java programming language which uses Spring Boot framework. This application displays "Hello World" message which is first stored in database and then read from database

##### Flow
The following flow takes place in this project:
1. User creates GCP Cloud SQL
1. User updates file **src/main/resources/application.properties** with data from GCP Cloud SQL
1. User runs application
1. User via any browser sends request to application for a content
1. Application HelloWorld returns response with message which was first stored and then read from database. This response is presented to User via browser
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


CREATE GCP CLOUD SLQ
--------------------

Link:
* https://console.cloud.google.com/

![My Image](readme-images/create-cloud-sql-01.png)

![My Image](readme-images/create-cloud-sql-02.png)

![My Image](readme-images/create-cloud-sql-03.png)

![My Image](readme-images/create-cloud-sql-04.png)

![My Image](readme-images/create-cloud-sql-05.png)

![My Image](readme-images/create-cloud-sql-06.png)

![My Image](readme-images/create-cloud-sql-07.png)

![My Image](readme-images/create-cloud-sql-08.png)

![My Image](readme-images/create-cloud-sql-09.png)

![My Image](readme-images/create-cloud-sql-10.png)

![My Image](readme-images/create-cloud-sql-11.png)

![My Image](readme-images/create-cloud-sql-12.png)

![My Image](readme-images/create-cloud-sql-13.png)


DELETE GCP CLOUD SLQ
--------------------

Link:
* https://console.cloud.google.com/

![My Image](readme-images/delete-cloud-sql-01.png)

![My Image](readme-images/delete-cloud-sql-02.png)

![My Image](readme-images/delete-cloud-sql-03.png)

![My Image](readme-images/delete-cloud-sql-04.png)

![My Image](readme-images/delete-cloud-sql-05.png)

![My Image](readme-images/delete-cloud-sql-06.png)