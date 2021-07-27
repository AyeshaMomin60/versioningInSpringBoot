package com.versioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import src.versioning.model.Name;
import src.versioning.model.PersonV1;
import src.versioning.model.PersonV2;

@RestController
@RequestMapping(path = "api")
public class URIParamVersioningController {

	// this method is for first version that returns the entire name
	@GetMapping(value = "/persons/param", params = "version=1")
	public PersonV1 personV1() {
		return new PersonV1("Tom Cruise");
	}

	// this method is for second version that returns firstName and lastName
	// separately
	@GetMapping(value = "/persons/param", params = "version=2")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Tom", "Cruise"));
	}
}
