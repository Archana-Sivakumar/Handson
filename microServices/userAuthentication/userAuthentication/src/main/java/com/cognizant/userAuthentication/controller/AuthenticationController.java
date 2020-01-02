package com.cognizant.userAuthentication.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.userAuthentication.UserAuthenticationApplication;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {
	

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAuthenticationApplication.class);
   @GetMapping("/authenticate")
   
   public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
		
		LOGGER.info("Start");
		
		Map<String, String> data = new HashMap<>();
		//String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0].toString();
		//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		//String user = authentication.getName();

		data.put("token", generateJwt(getUser(authHeader)));
		//data.put("role", role);
		//data.put("user", user);
		
		//LOGGER.debug(role);
		LOGGER.info("End");
		return data;

	}

	private String getUser(String authHeader) {
		
		LOGGER.info("Start");
       
		String header[] = authHeader.split(" ");
		String encodedCredentials = header[1];
		LOGGER.debug(header[1]);

		String decodedCredentials = new String(Base64.getDecoder().decode(encodedCredentials));
		LOGGER.info("End");
		return decodedCredentials.split(":")[0];
	}

   
	/*
	 * public Map<String, String> authenticate(@RequestHeader("Authorization")
	 * String authHeader) { Map<String, String> data = new HashMap<>();
	 * data.put("token",generateJwt(getUser(authHeader))); return data; }
	 * 
	 * private String getUser(String authHeader) { String encodedCredentials =
	 * "dXNlcjpwd2Q="; String decodedCredentials = new
	 * String(Base64.getDecoder().decode(encodedCredentials)); return
	 * decodedCredentials.split(":")[0]; }
	 */
   
   private String generateJwt(String user) {
	   JwtBuilder builder = Jwts.builder();
       builder.setSubject(user);

       // Set the token issue time as current time
       builder.setIssuedAt(new Date());

       // Set the token expiry as 20 minutes from now
       builder.setExpiration(new Date((new Date()).getTime() + 1200000));
       builder.signWith(SignatureAlgorithm.HS256, "secretkey");

       String token = builder.compact();

       return token;
   }
}

