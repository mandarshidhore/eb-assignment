package com.eb.api.pubreader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.api.pubreader.dao.UserDAO;
import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;

@Service
public class PubreaderService {

	@Autowired
	UserDAO dao;

	public URLPublish getURLPublishRecord(String topicid) {
		return dao.getURLPublishRecord(topicid);
	}

	public PublishList getAllURLPublishRecords() {
		return dao.getAllURLPublishRecords();
	}

	public List<String> getTopicIDsByClassName(String classname) {
		return dao.getTopicIDsByClassName(classname);
	}

}
