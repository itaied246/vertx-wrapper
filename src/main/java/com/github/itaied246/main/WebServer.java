package com.github.itaied246.main;

import com.github.itaied246.controllers.MainControllerAdapter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class WebServer extends AbstractVerticle {

	public void start() {
		HttpServer server = vertx.createHttpServer();

		Router router = Router.router(vertx);

		MainControllerAdapter mainController = new MainControllerAdapter();

		router.route().handler(mainController::handle);
		server.requestHandler(router::accept).listen(8080);
	}

}
