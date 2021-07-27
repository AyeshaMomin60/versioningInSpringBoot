package com.versioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import src.versioning.model.Name;
import src.versioning.model.PersonV1;
import src.versioning.model.PersonV2;

/**
 * @author aymomin
 *
 */
@RestController
@RequestMapping(path = "api")
public class URIVersioningController {

	// this method is for the first version that returns the entire name
	@GetMapping("v1/persons")
	public PersonV1 personv1() {
		return new PersonV1("Tom Cruise");
	}

	// this method is for the second version that returns firstName and lastName
	// separately
	@GetMapping("v2/persons")
	public PersonV2 personv2() {
		return new PersonV2(new Name("Tom", "Cruise"));
	}
}
