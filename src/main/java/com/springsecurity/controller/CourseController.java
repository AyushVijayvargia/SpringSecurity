package com.springsecurity.controller;

import com.springsecurity.dto.ApiResponse;
import com.springsecurity.dto.Course;
import com.springsecurity.dto.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "<h1>Welcome All</h1>";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return ("Welcome User");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		return ("Welcome Admin");
	}

	@RequestMapping(value = "/course", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addCourse(@RequestBody Course course) {
		return new ResponseEntity(new ApiResponse(200, "Added"), HttpStatus.OK);
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApiResponse> registerStudent(@RequestBody Student student) {
		return new ResponseEntity(new ApiResponse(200, "Added"), HttpStatus.OK);
	}

	@RequestMapping(value = "/course", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApiResponse> getCourses() {
		return new ResponseEntity(new ApiResponse(200, "Courses"), HttpStatus.OK);
	}
}