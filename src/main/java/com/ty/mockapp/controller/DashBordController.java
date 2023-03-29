package com.ty.mockapp.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.mockapp.dto.GoogleSheetDto;
import com.ty.mockapp.service.GoogleApiService;

@RestController
public class DashBordController {
	@Autowired
	private GoogleApiService service;

	@GetMapping("test")
	public String test() {
		return "Hi";
	}

	@GetMapping("/getData")
	public Map<String, String> reaData() throws IOException, GeneralSecurityException {
		return service.readData();
	}

	@PostMapping("/createSheet")
	public String createGoogleSheet(@RequestBody GoogleSheetDto sheet) throws GeneralSecurityException, IOException {
		return service.createGoogleSheet(sheet);
	}

}
