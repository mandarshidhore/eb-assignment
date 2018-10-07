package com.eb.api.pubreader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;
import com.eb.api.pubreader.util.SampleDataReader;

@Service
public class PubreaderService {

	@Autowired
	SampleDataReader sampleReader;

	public URLPublish getURLPublishRecord(String topicid) {
		return sampleReader.getURLPublishRecord(topicid);
	}

	public PublishList getAllURLPublishRecords() {
		return sampleReader.getAllURLPublishRecords();
	}

	public List<String> getTopicIDsByClassName(String classname) {
		return sampleReader.getTopicIDsByClassName(classname);
	}

}
