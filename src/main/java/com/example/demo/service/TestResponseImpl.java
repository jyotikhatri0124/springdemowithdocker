package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.controller.pojo.TestResponse;

@Component
public class TestResponseImpl {

	public TestResponse getTestResponse(String value) {
		TestResponse tesRes = new TestResponse();
		tesRes.setResponseData(value);

		return tesRes;

	}

}
