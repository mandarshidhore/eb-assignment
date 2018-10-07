package com.eb.api.pubreader.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "publish-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class PublishList {

	@XmlElement(name = "url-publish")
	private List<URLPublish> urlPublish;

	public List<URLPublish> getUrlPublish() {
		return urlPublish;
	}

	public void setUrlPublish(List<URLPublish> urlPublish) {
		this.urlPublish = urlPublish;
	}

}
