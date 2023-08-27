package com.example.demo.Dao;

import org.springframework.stereotype.Component;

import com.example.demo.model.Admin;
import com.example.demo.model.Response;
import com.example.demo.model.Worker;

@Component
public interface ConnectUsDao {

	public Response saveAdminAll(Admin admin);

	public Response saveWorkerAll(Worker worker);

}
