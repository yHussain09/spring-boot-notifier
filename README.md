# Spring Boot Notifier

Spring Boot project with demonstration of sending SMS, WhatsApp Message, Email and make a call with the help of **Twilio** Trail Number.
For Email, we are using **spring-boot-starter-mail** dependency.
## Configure the project
1. Setup your **Twilio** account to get **Account SID**, **Auth Token** and your **Trail Phone Number**.
2. Put these details into **application.properties** file.
3. Setup **App Password** for your gmail account and put this into **application.properties** file.

## Running the project
1. Open terminal and navigate to your project
2. Type command **mvn install**
3. Type command **mvn spring-boot:run**

## Check application running state
Route: **http://localhost:8080/**

## Packaging for production
1. **mvn clean**
2. **mvn package**

## Author
Yasir Hussain  
Senior Software Engineer at Clinical Computing(Constellation Kidney Group).
<br>
**About me**: https://yhussain09.github.io/