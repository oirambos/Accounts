package com.example.accounts.model;


import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsRequest {

	@NotBlank(message = "field department must not be null or empty.")
	public String department;
}
