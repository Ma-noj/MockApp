package com.ty.mockapp.service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.mockapp.dto.GoogleSheetDto;
import com.ty.mockapp.util.GoogleApiUtil;

@Service
public class GoogleApiService {
	@Autowired
	private GoogleApiUtil util;

	public Map<String, String> readData() throws IOException, GeneralSecurityException {
		return util.readDataFromSheet();
	}

	public String createGoogleSheet(GoogleSheetDto sheet) throws GeneralSecurityException, IOException {
		return util.createGoogleSheet(sheet);
	}

}
