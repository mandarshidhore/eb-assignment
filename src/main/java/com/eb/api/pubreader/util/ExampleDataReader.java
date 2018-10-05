package com.eb.api.pubreader.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.eb.api.pubreader.model.PublishList;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ExampleDataReader {

	static {
		try {
			File file = new File("simple_bean.xml");
			XmlMapper xmlMapper = new XmlMapper();
			String xml = inputStreamToString(new FileInputStream(file));
			PublishList value = xmlMapper.readValue(xml, PublishList.class);
		} catch (Exception e) {
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
