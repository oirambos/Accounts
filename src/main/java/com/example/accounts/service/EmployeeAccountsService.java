package com.example.accounts.service;

import com.example.accounts.model.AccountsRequest;
import com.example.accounts.model.AccountsResponse;

public interface EmployeeAccountsService {

	public AccountsResponse retrieveAccountsCatalog(AccountsRequest request);
}
