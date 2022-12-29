# Spring Config Server with Cloud Bus Support

This is a demo project which demonstrates an example Spring Config Server with Spring Cloud Bus integration.
The application runs on port `8888` and employs RabbitMQ as its event bus. 


### Running RabbitMq locally
Please make sure Docker is installed and running in your local.

> docker pull rabbitmq:3-management

> docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

#### Local RabbitMq UI: 
> http://localhost:15672/

> password/username: guest

### Build And Run the Config Server
To build the application: `./mvnw clean install`
To run the application from the project's root: `java -jar demo-spring-cloud-config-server/target/cloud-config-server-demo-0.0.1-SNAPSHOT.jar`


### SSH Tunnel
To be able to call local service from GitHub Service, one can create an SSH tunnel with the following command:

> ssh -R 80:localhost:8888 localhost.run

### Changing GitHub Repository for Config Management
You may change the following application configuration to any other Git repository or a local file to be able to discover the demo with your conditions.
> spring.cloud.config.server.git.uri=https://github.com/UgurYeter/config-repository

### References
1) https://www.baeldung.com/spring-cloud-bus