package com.example.demo.Dao;

import org.springframework.stereotype.Component;

import com.example.demo.model.Admin;
import com.example.demo.model.Response;

@Component
public interface ConnectUsDao {

	public Response saveAll(Admin admin);

}
