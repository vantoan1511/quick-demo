package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("api/hello")
public class HelloController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        return Response.ok("Hello world!").build();
    }
}
