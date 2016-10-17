package com.ibm.cpo.swarm;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author myfear
 */
@Path("helloworld")
public class HelloWorldService 
{
    @Context
    UriInfo context;

    /**
     * Creates a new instance of Service
     */
    public HelloWorldService() 
    {
    }

    /**
     * Simple example to output request URI and hostname
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() 
    {
        String text = "Hello from: " + context.getBaseUri() + " - Hostname: " + System.getenv().get("HOSTNAME") + "";
        return "{\"text\":\"" + text + "\"}";
    }
}
