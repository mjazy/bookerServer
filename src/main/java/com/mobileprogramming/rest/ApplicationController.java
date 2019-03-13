package com.mobileprogramming.rest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.domain.Entry;
import com.mobileprogramming.repository.DataRepository;

/**
 * Application controller providing endpoint for entries registration.
 * @author MJazy
 *
 */
@RestController
public class ApplicationController {
	
	@Autowired
	DataRepository dataRepository;
	
	@PostMapping("/registration")
	ResponseEntity<String> saveRegistrationData(@RequestBody JSONObject data){
		Entry entry = new Entry(data.getString("servicesSelected"), data.getString("daysSelected"));
		dataRepository.save(entry);
		return ResponseEntity.status(HttpStatus.OK).body("Registration successful");
	}
}
