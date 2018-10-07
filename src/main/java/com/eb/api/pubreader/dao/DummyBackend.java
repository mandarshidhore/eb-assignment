package com.eb.api.pubreader.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ResourceUtils;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;

public class DummyBackend implements UserDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(DummyBackend.class);
	private static Map<String, URLPublish> dataMap = new HashMap<>();
	private static PublishList pubList;

	// load sample data
	static {
		try {
			LOGGER.info("\n========================");
			LOGGER.info("\n>> Loading dummy data...");
			LOGGER.info("\n========================");
			File file = ResourceUtils.getFile("src/main/resources/exampledata/britannica_topics.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PublishList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			pubList = (PublishList) jaxbUnmarshaller.unmarshal(file);
			pubList.getUrlPublish().forEach(urlPubRecord -> {
				dataMap.put(urlPubRecord.getTopicid(), urlPubRecord);
			});
		} catch (FileNotFoundException | JAXBException e) {
			// right now, just simply logging exception - in real world application, this
			// would be handled differently
			LOGGER.error("++++ Error while loading dummy data ++++");
		}
	}

	public URLPublish getURLPublishRecord(String topicID) {
		return dataMap.get(topicID) != null ? dataMap.get(topicID)
				: new URLPublish(topicID, "URL Not Found", "topic " + topicID + " not in database");
	}

	public PublishList getAllURLPublishRecords() {
		return pubList;
	}

	/**
	 * Returns all topic IDs (by class name) as a list of Strings otherwise return
	 * null.
	 * 
	 * @param classname
	 * @return
	 */
	public List<String> getTopicIDsByClassName(String classname) {
		List<String> topicIDsList = pubList.getUrlPublish().stream()
				.filter(urlPublish -> urlPublish.getUrlclass().equals(classname)).map(URLPublish::getTopicid)
				.collect(Collectors.toList());
		// we could add a validation error - if required to return an error message
		// informing the user that the class name is not one of the valid ones - if
		// that's the use case in future, I'll create a Validator class under .util
		// package and write my validations there.
		return CollectionUtils.isEmpty(topicIDsList) ? null : topicIDsList;
	}

}
