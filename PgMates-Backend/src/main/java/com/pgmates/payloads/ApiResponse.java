package com.pgmates.payloads;

import java.time.LocalDateTime;

public class ApiResponse {
	private LocalDateTime timeStamp;
	private String message;
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ApiResponse(LocalDateTime timeStamp, String message) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
	}
	public ApiResponse(String string) {
		super();
		// TODO Auto-generated constructor stub
	}
}
