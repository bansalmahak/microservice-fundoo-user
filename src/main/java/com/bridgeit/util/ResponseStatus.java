package com.bridgeit.util;

import com.bridgeit.response.Response;
import com.bridgeit.response.ResponseToken;

public class ResponseStatus {
	public static Response statusinfo(String message, int code) {
		Response status = new Response();
		status.setCode(code);
		status.setMessage(message);

		return status;
	}

	public static ResponseToken statusinfoo(String message, int code, String token) {
		ResponseToken status = new ResponseToken();
		status.setCode(code);
		status.setMessage(message);
		status.setToken(token);

		return status;
	}
}