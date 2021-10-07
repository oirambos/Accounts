package com.example.accounts.service;

import org.springframework.stereotype.Service;

import com.example.accounts.model.AccountsRequest;
import com.example.accounts.model.AccountsResponse;
import com.example.accounts.utils.Utils;

@Service
public class EmployeeAccountsServiceImpl implements EmployeeAccountsService {

	@Override
	public AccountsResponse retrieveAccountsCatalog(AccountsRequest request) {
		return Utils.generateHardcodedCatalog();

	}

}
