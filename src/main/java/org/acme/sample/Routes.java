package org.acme.sample;

import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("netty-http:http://0.0.0.0:8080")
            .transform().constant("Hello from my forked Fuse F2F!");
    }

}
