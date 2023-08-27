package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.model.Response;
import com.example.demo.model.Worker;
import com.example.demo.service.ConnectUsService;

@RestController
public class ConnectUsController {

	
	@Autowired
	private ConnectUsService connectUsService;
	
	@PostMapping(value = "/createAdmin")
	public Response createAdmin(@RequestBody Admin admin) {
		
		return connectUsService.createAdminDetail(admin);
		 
	}
	
	@PostMapping(value = "/createWorker")
	public Response createWorker(@RequestBody Worker worker) {
		
		return connectUsService.createWorkerDetail(worker);
		 
	}
	
	@PostMapping(value = "/loginChecker")
	public Response loginCheck(@RequestBody Admin admin) {
		
		return connectUsService.loginCheckService(admin);
	}
}
