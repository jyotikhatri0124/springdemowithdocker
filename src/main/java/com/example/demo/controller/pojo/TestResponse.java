package com.example.demo.controller.pojo;

import lombok.Data;

@Data
public class TestResponse {

	private String responseData;

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
}
