package com.example.demo.controller.pojo;

import lombok.Data;

@Data
public class TestRequest {

	private String requestData;

	public String getRequestData() {
		return requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

}
