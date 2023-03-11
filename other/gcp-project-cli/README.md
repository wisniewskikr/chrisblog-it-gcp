USAGE
-----

> **NOTE** This usage assumes that user possesses **Google Account**. User has also installed following tools: **GCP Cloud Cli**.

Steps:
1. Create GCP Project with `gcloud projects create hello-world-wisniewskikr-1 --name="Hello World project" --labels=type=helloworld`
1. Switch to GCP Project with `gcloud config set project hello-world-wisniewskikr-1`
1. Clean up
     * Delete GCP Project with `gcloud projects delete hello-world-wisniewskir-1`


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create and delete **GCP Project** using **GCP Cloud Cli** tool.

##### Terminology
Terminology explanation:
* **GCP**: it means Google Cloud Platform (GCP) and it provides compute services via Internet
* **Cloud Cli**: tool which enables managing GCP Resources via command lines
* **GCP Project**: it's Project of Google Cloud Platform (GCP) which contains GCP Resources. GCP Resources are services provided by Google for cloud computing. And every Resouce has to be stored in some Project

##### Flow
The following flow takes place in this project:
1. User creates GCP Project
1. User switches to GCP Project
1. User deletes GCP Project

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **GCP**: `https://docs.google.com/document/d/1uXYLLTgD9b3RPs83S57WAsfCnuOrR9RdTJ7HLcaRzNY/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)

##### Preconditions - Actions
* Created Google Account