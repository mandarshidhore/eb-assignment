package com.eb.api.pubreader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "url-publish")
public class URLPublish {

	@XmlElement(name = "topicid")
	private String topicid;

	@XmlElement(name = "urltitle")
	private String urltitle;

	@XmlElement(name = "urlclass")
	private String urlclass;

	public URLPublish() {

	}

	public URLPublish(String topicid, String urltitle, String urlclass) {
		this.topicid = topicid;
		this.urltitle = urltitle;
		this.urlclass = urlclass;
	}

	public String getTopicid() {
		return topicid;
	}

	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}

	public String getUrltitle() {
		return urltitle;
	}

	public void setUrltitle(String urltitle) {
		this.urltitle = urltitle;
	}

	public String getUrlclass() {
		return urlclass;
	}

	public void setUrlclass(String urlclass) {
		this.urlclass = urlclass;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof URLPublish) {
			URLPublish urlPublish = URLPublish.class.cast(obj);
			if (this.topicid.equals(urlPublish.getTopicid()) && this.urltitle.equals(urlPublish.getUrltitle())
					&& this.urlclass.equals(urlPublish.getUrlclass())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
