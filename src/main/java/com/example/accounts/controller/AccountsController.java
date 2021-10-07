package com.example.accounts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.accounts.model.AccountsRequest;
import com.example.accounts.model.AccountsResponse;
import com.example.accounts.service.EmployeeAccountsService;

@RestController
public class AccountsController {

	private final EmployeeAccountsService employeeAccountsService;
	
	@Autowired
	public AccountsController(EmployeeAccountsService employeeAccountsService) {
		this.employeeAccountsService=employeeAccountsService;
	}
	
	@PostMapping(value="${app.retrieve-employee-accounts}")
	public ResponseEntity<AccountsResponse> retrieveEmployeeAccounts(
			@Valid @RequestBody AccountsRequest request){
		return new ResponseEntity<>(employeeAccountsService.retrieveAccountsCatalog(request), HttpStatus.OK);
				
	}
}
