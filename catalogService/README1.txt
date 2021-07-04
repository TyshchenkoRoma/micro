docker script:
docker run --name mysql3 -e
MYSQL_ROOT_PASSWORD=rootpasswd
MYSQL_USER=root -e
MYSQL_PASSWORD=root -e
MYSQL_DATABASE=homedb -p
3306:3306 -d mysql/mysql-server:8.0


Capstone project: Microservices on Spring Boot
Objective
Getting practical skills in development of a microservices application using Spring Boot and Netflix OSS.

Prerequisites
Spring Boot, Spring Cloud
Java
Netflix OSS (basic)
Scope of the project
Download sample product data set https://www.kaggle.com/PromptCloudHQ/all-jc-penny-products
Create the following Spring Boot applications:
Catalog application: holds online store product data in-memory from the product data set above. The application exposes REST API for retrieving products by ‘uniq_id’ and list of products by ‘sku’.
Invetory application: holds online store product availability data. Generate random availability status for each product from the product data set above and keep it in an in-memory data structure. The application exposes REST API for retrieving product availability by a list of ‘uniq_id’.
Product application: returns product data to end-clients. The application exposes REST API for
 retrieving available products data by ‘uniq_id’ and by ‘sku’ (multiple products are returned).
 The REST service makes REST call to catalog application to get product data by ‘uniq_id’
 or by ‘sku’, and make a call to the inventory application to get product availability
 and filter out only available product before returning.
Use Netflix Eureka for registering applications and discovering them for inter-component REST calls.
Use Netflix Hystrix for protecting inter-component REST calls from the product application. The fallback behavior is supposed to result in ‘503 service unavailable’ in case of unavailability of any dependant services. Use synthetic delays (sleep time) in the inventory and catalog applications to increase response latency. Play with ‘execution.isolation.thread.timeoutInMilliseconds’, ‘coreSize’, ‘circuitBreaker.requestVolumeThreshold’ and ‘circuitBreaker.sleepWindowInMilliseconds’ to simulate circuit breaker behavior.
Use request tracing through the inter-component REST calls and the Zipkin server for monitoring request flow and latency.
Project assessment
Walk through application testing scenario and make sure they pass correctly (items #3-5).
Make code review to ensure implementation quality within the scope of the project.
Questions on implementation to make sure that trainee understands how Eureka, Hystrix and request tracing works in the capstone application.
