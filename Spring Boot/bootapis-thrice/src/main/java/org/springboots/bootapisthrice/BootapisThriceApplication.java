package org.springboots.bootapisthrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootapisThriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootapisThriceApplication.class, args);
    }
}

/*


Add Book , POST                |     http://localhost:8080/books/add
Get All Books , GET            |     http://localhost:8080/books/all
Get Specific (ID: 3) , GET     |     http://localhost:8080/books/3,No
Update (ID: 3) , PUT           |     http://localhost:8080/books/3,Yes
Delete (ID: 3) , DELETE        |     http://localhost:8080/books/3,No

*/

