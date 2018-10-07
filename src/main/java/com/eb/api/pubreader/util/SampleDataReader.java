package com.eb.api.pubreader.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;

@Component
public class SampleDataReader {

	private static Map<String, URLPublish> dataMap = new HashMap<>();
	private static PublishList pubList;

	// load sample data
	static {
		try {
			File file = ResourceUtils.getFile("src/main/resources/exampledata/britannica_topics.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PublishList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			pubList = (PublishList) jaxbUnmarshaller.unmarshal(file);
			pubList.getUrlPublish().forEach(urlPubRecord -> {
				dataMap.put(urlPubRecord.getTopicid(), urlPubRecord);
			});
			System.out.println(dataMap);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}

	public URLPublish getURLPublishRecord(String topicID) {
		return dataMap.get(topicID) != null ? dataMap.get(topicID)
				: new URLPublish(topicID, "URL Not Found", "topic " + topicID + " not in database");
	}

	public PublishList getAllURLPublishRecords() {
		return pubList;
	}

}
