package org.example.corelifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreLifeCycleApplication {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();

        for (int i = 1; i <= 5; i++) {
            EmailService service = context.getBean("email" + i, EmailService.class);

/*
        This line calls the toString() method of your EmailService
        class to print all variable values (host, port, etc.) to the console.
*/

            System.out.println("Service " + i + " : " + service);
        }
    }
}

/*
The output logic follows these steps  -----

-->--   Init Method : The Spring container reads beans.xml and creates 5 objects; as each object is created, its init() method is called and its email is printed.
-->--   Services List : The loop in your main method requests those 5 objects from the container and prints their details using toString().
-->--   Destroy Method : When the program ends, registerShutdownHook() closes the container; Spring deletes objects in reverse order (LIFO), which is why the last bean is destroyed first.
*/

