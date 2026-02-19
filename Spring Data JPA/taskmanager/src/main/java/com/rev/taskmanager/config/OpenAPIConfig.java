package com.rev.taskmanager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.setDescription("Development Server");

        Contact contact = new Contact();
        contact.setName("Task Manager Team");
        contact.setEmail("support@taskmanager.com");

        Info info = new Info();
        info.setTitle("Task Manager API");
        info.setVersion("1.0");
        info.setDescription("This API provides endpoints for managing tasks.");
        info.setContact(contact);

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer));
    }
}
