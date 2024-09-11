package org.api;


import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;


@ApplicationPath("/myapp")
public class ApiTest extends Application {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUsers() {
        return "hello";
    }

}
