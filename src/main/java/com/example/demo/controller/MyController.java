package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.controller.pojo.TestRequest;
import com.example.demo.controller.pojo.TestResponse;
import com.example.demo.service.TestResponseImpl;

@RestController
public class MyController {

	@Autowired
	private TestResponseImpl testResponseImpl;

	@PostMapping("/home")

	public ResponseEntity<TestResponse> test(@RequestBody TestRequest testrequest) {

		TestResponse testResponse = null;
		HttpStatus httpStatus = null;

		testResponse = testResponseImpl.getTestResponse(testrequest.getRequestData());
		httpStatus = HttpStatus.OK;

		return new ResponseEntity<TestResponse>(testResponse, httpStatus);

	}

}
