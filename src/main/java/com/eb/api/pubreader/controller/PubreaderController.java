package com.eb.api.pubreader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	/**
	 * Retrieves all topic for a given clas sname
	 * 
	 * @return PublishList
	 */
	@GetMapping("/eb/class/{class-name}")
	public List<String> getTopicIDsByClassName(@PathVariable("class-name") String classname) {
		return readerService.getTopicIDsByClassName(classname);
	}
	
	@GetMapping("/eb/getclass/{class}")
	public List<URLPublish> getURLPublishRecordsByClassName(@PathVariable("class") String cname) {
		return readerService.getURLPublihRecordsByClassName(cname);
	}
	
	@PostMapping("/eb/addtopic")
	public void insertTopic(@RequestBody URLPublish urlPublish) {
		readerService.addTopic(urlPublish);
	}

}
