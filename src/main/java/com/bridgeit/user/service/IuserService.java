package com.bridgeit.user.service;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Service;

import com.bridgeit.response.Response;
import com.bridgeit.response.ResponseToken;
import com.bridgeit.user.dto.LoginDTO;
import com.bridgeit.user.dto.PasswordDTO;
import com.bridgeit.user.dto.UserDTO;

@Service
public interface IuserService {
	public Response resgister(UserDTO userDto) throws Exception;

	public ResponseToken login(LoginDTO logindto) throws Exception;

	public Response validation(String token) throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response forgetpassword(String emailid) throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response resetpassword(String token, PasswordDTO password)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;
}
