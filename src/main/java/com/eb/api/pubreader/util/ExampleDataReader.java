package com.eb.api.pubreader.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.util.ResourceUtils;

import com.eb.api.pubreader.model.PublishList;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ExampleDataReader {

	public static void main(String[] args) {
		new ExampleDataReader();
	}

	static {
		try {		
			File file = ResourceUtils.getFile("src/main/resources/exampledata/britannica_topics2.xml");
			String content = inputStreamToString(new FileInputStream(file));
			JAXBContext jaxbContext = JAXBContext.newInstance(PublishList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PublishList pubList = (PublishList) jaxbUnmarshaller.unmarshal(file);
			System.out.println(pubList);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}

	public static String inputStreamToString(InputStream is) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		return sb.toString();
	}

}
