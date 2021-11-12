# Sporty Shoes (A company that manufactures and sells sports shoes) Web App in JAVA using Spring Boot

## Table of contents
* [Using the application](#using-the-application)
* [Technologies Used](#technologies-used)
* [Demo](#demo)
* [Setup](#setup)

## Using the application
Homepage displays the application name (Sport Shoes) and four options - Login, Register, Admin, Cart.

<img width="720" alt="sportyshoes-screenshot-homepage" src="https://raw.githubusercontent.com/Niks4u2/SportyShoes/main/Screenshots/Homepage.PNG">

<b>Sport Shoes</b>  - <br>
A query is sent to the remote database that is hosted on AWS RDS for MySQL to fetch all the products and displayed to the user's homepage.
The user can add products displayed on homepage to their cart. 
The User enters the billing details and proceeds to the Test API of Paytm payment gateway to pay the total amount, after payment
they are shown with a confirmation page along with the details of the purchase.
<br><br>
<b>Admin</b>  - <br>
Admin dashboard is accessed using Admin Login Credentials.
Admin can see, add, edit and delete all entries of products in database table.
Admin can also see the purchase history and registered users list. 

## Technologies Used
<b>Frontend</b> - HTML, CSS, Bootstrap and Thymeleaf <br>
<b>Backend</b> - Spring Boot, Spring Security, Spring Data JPA and Hibernate for Object Mapping <br>
<b>Database</b> - MySQL - Hosted on a remote server at [AWS RDS](https://aws.amazon.com/rds/mysql/) <br>
<b>Application Server</b>  - Java 8 running on 64bit Amazon Linux on AWS Elastic Beanstalk <br>

## Demo
Application is hosted [here](http://sportyshoesapplication-env.eba-pk5qivsc.ap-south-1.elasticbeanstalk.com/) on AWS Elastic Beanstalk.
## Setup
To run in your localhost - Clone the project into your local directory. Edit the credentials in `application.properties` file such as username, password, Driver Class Name and Connection URL. Then run the project on Apache Tomcat server 9.0.*
<br><br>
To deploy on a server use `sporty-shoes-application.war` file.
