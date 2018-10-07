package com.eb.api.pubreader.dao;

import java.util.List;

import com.eb.api.pubreader.model.PublishList;
import com.eb.api.pubreader.model.URLPublish;

public interface UserDAO {
	
	public URLPublish getURLPublishRecord(String topicID);
	
	public PublishList getAllURLPublishRecords();
	
	public List<String> getTopicIDsByClassName(String classname);

}
