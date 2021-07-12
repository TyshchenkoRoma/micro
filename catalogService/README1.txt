docker script:
docker run --name mysqlInventory1 -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_DATABASE=inventorydb1 -p 3307:3306 -d mysql/mysql-server:8.0


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

Catalog application: holds online store product data in-memory from the product data set above.
The application exposes REST API for retrieving products by ‘uniq_id’ and list of products by ‘sku’.

Invetory application: holds online store product availability data.
 Generate random availability status for each product from the product data set above
  and keep it in an in-memory data structure.
  The application exposes REST API for retrieving product availability by a list of ‘uniq_id’.

Product application: returns product data to end-clients. The application exposes REST API for
 retrieving available products data by ‘uniq_id’ and by ‘sku’ (multiple products are returned).
 The REST service makes REST call to catalog application to get product data by ‘uniq_id’
 or by ‘sku’, and make a call to the inventory application to get product availability
 and filter out only available product before returning.

Use Netflix Eureka for registering applications and discovering them for inter-component REST calls.
Use Netflix Hystrix for protecting inter-component REST calls from the product application.
 The fallback behavior is supposed to result in ‘503 service unavailable’ in case of unavailability of any dependant services.
  Use synthetic delays (sleep time) in the inventory and catalog applications to increase response latency.
   Play with ‘execution.isolation.thread.timeoutInMilliseconds’, ‘coreSize’, ‘circuitBreaker.requestVolumeThreshold’
   and ‘circuitBreaker.sleepWindowInMilliseconds’ to simulate circuit breaker behavior.
Use request tracing through the inter-component REST calls and the Zipkin server for monitoring request flow and latency.
Project assessment
Walk through application testing scenario and make sure they pass correctly (items #3-5).
Make code review to ensure implementation quality within the scope of the project.
Questions on implementation to make sure that trainee understands how Eureka, Hystrix and request tracing works in the capstone application.

insert product( id, uniq_id, sku, name_title, description, list_price,
               sale_price, category, category_tree, average_product_rating, product_url,
               product_image_urls, brand, total_number_reviews, reviews)
VALUES (13,
        '72f8aa81a2364e6cd5bff45979aefc33',
        'pp5006790242',
        'Alfred Dunner® Feels Like Spring Capris',
        'Pull on a pair of our casual capris and be footloose and fancy-free. ',
        58.01,
        34.18,
        'capris & crops',
        'jcpenney|women|alfred dunner',
        '4.6 out of 5',
        'http://www.jcpenney.com/alfred-dunner-essential-pull-on-capri-pant/prod.jump',
        'http://s7d9.scene7.com/is/image/JCPenney/DP1228201517142050M.tif?hei=380&amp;wid=380&op_usm=.4,.8,0,0&resmode=sharp2&op_usm=1.5,.8,0,0&resmode=sharp',
        'Alfred Dunner',
        5,
        '{\"review\"=>[{\"review_1\"=>\"You never have to worry about the fit...Alfred Dunner clothing sizes are true to size and fits perfectly. Great value for the money.\"}');



1,'b6c0b6bea69c722939585baeac73c13d','pp5006380337'
2,93e5272c51d8cce02597e3ce67b7ad0a,pp5006380337
3,72f8aa81a2364e6cd5bff45979aefc34,pp5006790242
4,505e6633d81f2cb7400c0cfa0394c427,pp5006380337
5,d969a8542122e1331e304b09f81a83f6,pp5006380337
6,5abf9d28e9e0404369ece10807d99d0e,pp5006790242
7,82d8a9a627e55ba97a1051068c9823e7,pp5006790242
8,7b16da6eaeca0ae2d107e712cfe5141d,pp5006790242
9,dc414a69fee993fd20d74a979dfea23d,pp5006790242
10,3c291110238ee460390c7002e4622ade,pp5006790242
11,5d8646dbb6d4561dd5f9176f2632edc3,pp5006790242
12,ca61adb53a4b26f605f10fab385bea09,pp5006790242
13,72f8aa81a2364e6cd5bff45979aefc33,pp5006790242


insert product( id, uniq_id, sku)
VALUES (1,b6c0b6bea69c722939585baeac73c13d,pp5006380337);


localhost:8083/product/avprodbyid?uniqIdList=b6c0b6bea69c722939585baeac73c13d, 93e5272c51d8cce02597e3ce67b7ad0a, ca61adb53a4b26f605f10fab385bea09, 72f8aa81a2364e6cd5bff45979aefc34, 505e6633d81f2cb7400c0cfa0394c427, d969a8542122e1331e304b09f81a83f6, 5abf9d28e9e0404369ece10807d99d0e, 82d8a9a627e55ba97a1051068c9823e7, 7b16da6eaeca0ae2d107e712cfe5141d, dc414a69fee993fd20d74a979dfea23d, 3c291110238ee460390c7002e4622ade, 5d8646dbb6d4561dd5f9176f2632edc3