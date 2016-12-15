package com.github.itaied246.http;

import io.vertx.core.http.HttpServerRequest;

public class Request {

	private HttpServerRequest request;
	
	public static Request create(HttpServerRequest request){
		return new Request(request);
	}

	private Request(HttpServerRequest request) {
		this.request = request;
	}

}
