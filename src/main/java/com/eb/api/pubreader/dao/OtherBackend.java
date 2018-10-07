package com.eb.api.pubreader.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	private static final Logger LOGGER = LoggerFactory.getLogger(OtherBackend.class);

	// for demo purpose
	static {
		LOGGER.info("\n============================\n");
		LOGGER.info("\n	>> Loading Other Backend...	");
		LOGGER.info("\n============================\n");
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
