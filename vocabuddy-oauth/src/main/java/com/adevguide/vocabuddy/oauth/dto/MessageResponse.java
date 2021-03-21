/**
 * 
 */
package com.adevguide.vocabuddy.oauth.dto;

/**
 * @author PraBhu
 *
 */
public class MessageResponse {

	private String message;

	public MessageResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
