package com.github.itaied246.http;

import io.vertx.core.http.HttpServerResponse;

public class Response {

	private HttpServerResponse response;

	public static Response create(HttpServerResponse response){
		return new Response(response);
	}
	
	private Response(HttpServerResponse response) {
		this.response = response;
	}

	public void end(String message) {
		this.response.end(message);
	}

	public void end() {
		this.response.end();
	}

}
