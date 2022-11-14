package com.example.demo.model;

import lombok.Builder;


@Builder
public class Response {
	
    public String responseMessage;
	
	public String responseCode;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	
}
