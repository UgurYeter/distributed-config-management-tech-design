# Demo for Spring Config Client

The application runs on port `8080` and requires local RabbitMQ running locally in
addition to Spring Cloud Config Server presence on port `8888`. Steps to have RabbitMQ and Spring Cloud Server running
can be found on the README.md file of [Demo Spring Cloud Config Server README.md](./../demo-spring-cloud-config-server/README.md).

### Build And Run the Config Client
To build the application from the project's `./demo-spring-cloud-config-client`: `./mvnw clean install`
To run the application from the project's root: `java -jar demo-spring-cloud-config-client/target/cloud-config-client-0.0.1-SNAPSHOT.jar
`

