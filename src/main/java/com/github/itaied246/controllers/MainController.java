package com.github.itaied246.controllers;

import com.github.itaied246.http.Request;
import com.github.itaied246.http.Response;

public class MainController {

	public void handle(Request request, Response response) {
		response.end("Hello world!");
	}

}
