package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.model.Admin;
import com.example.demo.model.Response;

@Component
public interface ConnectUsService {

	 public Response createAdminDetail(Admin admin);

	public Response loginCheckService(Admin admin);

}
