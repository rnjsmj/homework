package com.kh.homework.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PwdTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
		
		String encPw = pwdEncoder.encode("");
		log.info("pass : {}", encPw);

	}

}
