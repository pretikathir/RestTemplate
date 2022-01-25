package com.test.rest.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.rest.model.Details;
import com.test.rest.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TemplateService {

	public Details getDetails() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://dummy.restapiexample.com/api/v1/employees";
		Details response = restTemplate.exchange(fooResourceUrl,HttpMethod.GET,null, new ParameterizedTypeReference<Details>() {
		}).getBody();
		log.info("Response - " + response);
		return response;
	}
	
	//We will obtain only one infofrom employee so need to change the list type
	public Details getEmpById(String id) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://dummy.restapiexample.com/api/v1/employee/" + id;
		log.info("URL - " + fooResourceUrl);
		Details response = restTemplate.exchange(fooResourceUrl,HttpMethod.GET,null, new ParameterizedTypeReference<Details>() {
		}).getBody();
		log.info("Response - " + response);
		return response;
	}

}
