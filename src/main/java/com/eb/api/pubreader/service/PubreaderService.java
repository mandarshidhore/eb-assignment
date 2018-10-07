package com.eb.api.pubreader.service;

import org.springframework.stereotype.Service;

import com.eb.api.pubreader.model.URLPublish;

@Service
public class PubreaderService {
	
	public URLPublish getURLPublishRecord() {
		return new URLPublish();
	}

}
