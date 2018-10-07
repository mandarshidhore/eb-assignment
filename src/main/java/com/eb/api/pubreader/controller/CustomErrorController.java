package com.eb.api.pubreader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handlers error - in this particular scenario, it is returning a custom
 * message for HTTP status code 404
 * 
 * @author Mandar.Shidhore
 *
 */
@RestController
public class CustomErrorController implements ErrorController {

	private static final String PATH = "/error";

	@RequestMapping(value = "/error")
	public ResponseEntity error(HttpServletRequest request, HttpServletResponse response) {
		return ResponseEntity.status(response.getStatus()).body("HTTP 404 \n--------\nNot Found -> Invalid URL");
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}
