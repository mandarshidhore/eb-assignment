package com.eb.api.pubreader.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.eb.api.pubreader.model.PublishList;

@Component
public class ExampleDataReader {

	static {
		try {
			File file = ResourceUtils.getFile("src/main/resources/exampledata/britannica_topics.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PublishList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PublishList pubList = (PublishList) jaxbUnmarshaller.unmarshal(file);
			System.out.println(pubList);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}

}
