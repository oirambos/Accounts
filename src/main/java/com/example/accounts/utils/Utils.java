package com.example.accounts.utils;

import com.example.accounts.model.AccountsResponse;
import com.google.gson.Gson;

public class Utils {

	static final String catalog = "{\"accounts\":[{\"employeeName\":\"Ram\",\"accountNumber\":\"010120391023\","
			+ "\"issuingBank\":\"Bancomer\"},{\"employeeName\":\"Shyam\",\"accountNumber\":\"12981273112\",\"issuingBank\":\"HSBC\"},"
			+ "{\"employeeName\":\"John\",\"accountNumber\":\"92731826311\",\"issuingBank\":\"Banco Azteca\"},{\"employeeName\":\"Bob\","
			+ "\"accountNumber\":\"91823719212\",\"issuingBank\":\"Scotiabank\"}]}";
	
	public static AccountsResponse generateHardcodedCatalog() {
		Gson g = new Gson(); 
		AccountsResponse jsonResponse = g.fromJson(catalog, AccountsResponse.class);
		return jsonResponse;
	}

}
