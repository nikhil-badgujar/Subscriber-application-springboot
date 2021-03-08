package com.nikhilb.SpringbootjpalucentasgException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
	
	private static final long serialversionIOD = 1L;
	
	public ResourceNotFoundException(String m) {
		super (m);
	}
}