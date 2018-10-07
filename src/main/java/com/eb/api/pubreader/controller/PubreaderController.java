package com.eb.api.pubreader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;
import com.eb.api.pubreader.service.PubreaderService;

@RestController
public class PubreaderController {

	@Autowired
	PubreaderService readerService;

	/**
	 * Retrieve topic by identifier
	 * 
	 * @param topicid topic identifier
	 * @return URLPublish
	 */
	@GetMapping("/eb/topic/{topicid}")
	public URLPublish getURLPublishRecord(@PathVariable String topicid) {
		return readerService.getURLPublishRecord(topicid);
	}

	/**
	 * Retrieves all topic
	 * 
	 * @return PublishList
	 */
	@GetMapping("/eb/all/topic")
	public PublishList getAllURLPublishRecords() {
		return readerService.getAllURLPublishRecords();
	}

}
