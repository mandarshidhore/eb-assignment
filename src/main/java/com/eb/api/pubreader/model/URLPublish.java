package com.eb.api.pubreader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class URLPublish {

	@XmlElement(name = "topicid")
	private String topicId;

	@XmlElement(name = "urltitle")
	private String urlTitle;

	@XmlElement(name = "urlclass")
	private String urlClass;

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getUrlTitle() {
		return urlTitle;
	}

	public void setUrlTitle(String urlTitle) {
		this.urlTitle = urlTitle;
	}

	public String getUrlClass() {
		return urlClass;
	}

	public void setUrlClass(String urlClass) {
		this.urlClass = urlClass;
	}

}
