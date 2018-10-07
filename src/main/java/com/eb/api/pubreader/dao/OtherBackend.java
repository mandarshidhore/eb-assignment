package com.eb.api.pubreader.dao;

import java.util.List;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;

/**
 * This could be a class for either relational or NoSQL db - this is for demo
 * purpose only - right now, it returns null for any given URL request if this
 * backend is loaded at runtime
 * 
 * @author Mandar.Shidhore
 *
 */
public class OtherBackend implements UserDAO {

	// for demo purpose
	static {
		System.out.println("Loading Other Backend...");
	}

	@Override
	public URLPublish getURLPublishRecord(String topicID) {
		return null;
	}

	@Override
	public PublishList getAllURLPublishRecords() {
		return null;
	}

	@Override
	public List<String> getTopicIDsByClassName(String classname) {
		return null;
	}

}
