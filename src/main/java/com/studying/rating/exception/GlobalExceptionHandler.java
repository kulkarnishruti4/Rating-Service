package com.studying.rating.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleResourceNotFound(ResourceNotFoundException e) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("Message", e.getMessage());
		map.put("Code", 200);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
	}

}
