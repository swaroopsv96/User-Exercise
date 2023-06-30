Tools used:-
1. IntelliJ editor for java programming.
2. SpringBoot framework for creating API.
3. MySQL server is used for creating given schemas.
4. Postman is used to make a request to API.

System Design:
1. Database:-
a. Created three tables (User, UserSummary and UserAddress) in a database, with
the format given in schemas.
b. Inserted values into it manually.
c. For ease of understanding, created separate table for UserSummary.
d. ID is set as Primary key and not given auto increment, for allowing user specific
id.
2. REST API’s:
a. Created a separate entity for each table to fetch data from the table
correspondingly.
b. Entities - User, UserSummary, UserAddress
c. Controller :-
i. UserController – controls user entity
ii. SummaryController – controls user summary entity
iii. AddressController – controls user address entity
d. Repository :-
i. UserRepository – interface which holds user entity methods.
ii. SummaryRepository – interface which holds user summary entity
methods.
iii. AddressRepsitory – interface which holds user address entity
methods.
e. Service :-
i. UserService – points to the user-service API

ii. SummaryService – this API points to user-service getUserSummary
method
iii. AddressService – points to user-address-service API.

3. Application Properties :-
a. Configured the file to connect the MySQL server, with username, password and
jdbc driver.
b. Please change the configurations(username, password) according to your MYSQL
server

4. Spring Intializer:
a. Visited https://start.spring.io/ and with Spring Webservices, Spring data JPA and
Spring MySQL, selected Java 18 and Jar, with maven project.

Requirements to execute:
1. Latest Java version installed in the system.
2. MYSQL version 8.0.29
3. Install postman version 9.24.2 to send the request to API.
4. Install JDBC driver to access MySQL server from java program.
