package com.project.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;


public class RecordNotFoundException extends RuntimeException {
	public RecordNotFoundException(String s) {
		super(s);
	}
}
