package com.YarlMakket.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "FeedBack")
public class FeedBack {
	
	@Id
	private String id;
	private String feedBack;
	private String eMail;
	
	public FeedBack(String feedBack, String eMail) {
		super();
		this.feedBack = feedBack;
		this.eMail = eMail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
}
