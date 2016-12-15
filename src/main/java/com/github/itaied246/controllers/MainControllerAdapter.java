package com.github.itaied246.controllers;

import com.github.itaied246.http.Request;
import com.github.itaied246.http.Response;

import io.vertx.ext.web.RoutingContext;

public class MainControllerAdapter {

	private MainController mainController = new MainController();

	public void handle(RoutingContext routingContext) {
		mainController.handle(Request.create(routingContext.request()),
				Response.create(routingContext.response()));
	}

}
