package org.api.controller;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class Users {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUsers() {
        return "hello";
    }
}
