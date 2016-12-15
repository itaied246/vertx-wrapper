package com.github.itaied246.main;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

public class WebServer extends AbstractVerticle{

	public void start(){
		HttpServer server = vertx.createHttpServer();

		Router router = Router.router(vertx);

		router.route().handler(routingContext -> {

		  // This handler will be called for every request
		  HttpServerResponse response = routingContext.response();
		  response.putHeader("content-type", "text/plain");

		  // Write to the response and end it
		  response.end("Hello World from Vert.x-Web!");
		});
		
		
		server.requestHandler(router::accept).listen(8080);
	}
	
}
