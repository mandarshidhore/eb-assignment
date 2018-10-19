package com.eb.api.pubreader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eb.api.pubreader.model.URLPublish;
import com.eb.api.pubreader.service.PubreaderService;

@Controller
public class PubreaderMVCController {

	@Autowired
	PubreaderService readerService;
	
	@RequestMapping("/home")
	public String welcome() {
		System.out.println(">> welcome here");
		return "landing";
	}

	@RequestMapping("/eb/mvc/addTopic")
	public String addTopicLandingPage() {
		// ModelAndView mav = new ModelAndView();
		return "landing";
	}

	@RequestMapping("/insertTopic")
	public String insertTopic(@RequestParam String topicid, @RequestParam String urltitle, @RequestParam String urlclass) {
		System.out.println("QUERY PARAMS = "+ topicid + urltitle + urlclass);
		URLPublish urlPub = new URLPublish(topicid, urltitle, urlclass);
		readerService.addMVCTopic(urlPub);
		return "redirect:/eb/getclass/" + urlclass;
	}

}
