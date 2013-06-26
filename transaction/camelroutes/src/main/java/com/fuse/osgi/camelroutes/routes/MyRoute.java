package com.fuse.osgi.camelroutes.routes;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("start").onException(Exception.class).transacted().convertBodyTo(String.class).to("");
	}

}
