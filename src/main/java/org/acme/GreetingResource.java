package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;


@Path("/hello")
public class GreetingResource {

        @Inject
        Logger logger;

        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String hello() {
            logger.info("Handling request in /hello");
            logger.info("Handling request in /hello 2");
            return "Hello from Quarkus REST";
        }
}
