package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.rest.model.Details;
import com.test.rest.model.Employee;
import com.test.rest.service.TemplateService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/template")
public class Controller {

	@Autowired
	 TemplateService templateService;

	@GetMapping
	public Details getEmpDetails() {
		return templateService.getDetails();

	}
	
	@GetMapping("/{id}")
    public Details retrieveEmpById(@PathVariable String id) {
        return templateService.getEmpById(id);
    }

}
