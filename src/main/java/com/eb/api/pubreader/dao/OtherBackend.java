package com.eb.api.pubreader.dao;

import java.util.List;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;

/**
 * This class is for demonstration purpose only - if this backend is loaded at
 * runtime, we return null for any given URL request
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
