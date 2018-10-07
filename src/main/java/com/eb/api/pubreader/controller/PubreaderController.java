package com.eb.api.pubreader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eb.api.pubreader.model.URLPublish;
import com.eb.api.pubreader.service.PubreaderService;

@RestController
public class PubreaderController {
	
	@Autowired
	PubreaderService readerService;
	
	@GetMapping()
	public URLPublish getURLPublishRecord() {
		return readerService.getURLPublishRecord();
	}

}
