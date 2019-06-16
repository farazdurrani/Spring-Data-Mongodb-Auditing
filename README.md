# Spring-Data-Mongodb-Auditing
Testing how auditing feature works in Spring Data.

Cloned a based copy of working Spring boot application from https://spring.io/guides/gs/accessing-data-mongodb/. 

This application tests how Auditing works with Spring Data. It works by adding 3 things:

1) @EnableMongoAuditing, 2) By creating a bean that returns the implementation of AuditorAware interface, 3) By adding @CreatedBy, @LastModifiedBy, @CreatedDate and @LastModifiedDate to capture when the change happened. The annotations can be applied selectively, depending on which information you want to capture.


Note about AuditorAware interface: Usually, you would want to get the current Principal (User) who is making changes. I just hardcoded it for now as I am not using Spring Security. 

Spring Boot will handle those repositories automatically as long as they are included in the same package (or a sub-package) of your @SpringBootApplication class.

MongoDB stores data in collections. Spring Data MongoDB will map the class Customer into a collection called customer. If you want to change the name of the collection, you can use Spring Data MongoDB’s @Document annotation on the class.

What makes Spring Data MongoDB so useful is the fact that you don’t have to create this implementation. Spring Data MongoDB creates it on the fly when you run the application.

Spring Data MongoDB uses the MongoTemplate to execute the queries.

Application includes a main() method that autowires an instance of CustomerRepository: Spring Data MongoDB dynamically creates a proxy and injects it there. 

Spring Boot by default attempts to connect to a locally hosted instance of MongoDB. But I have embedded mongodb in the application so it will connect to it automatically. 

Since 'spring-boot-starter-data-mongodb' is on classpath, mongoTemplate bean will be created and injected automatically in CustomerRepository. 
