package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.model.Admin;
import com.example.demo.model.Response;
import com.example.demo.model.TransactionByWorker;
import com.example.demo.model.Worker;

@Component
public interface ConnectUsService {

	 public Response createAdminDetail(Admin admin);

	public Response loginCheckService(Admin admin);

	public Response createWorkerDetail(Worker worker);

	public Response createTransactionByWorker(TransactionByWorker transactionByWorker);

}
