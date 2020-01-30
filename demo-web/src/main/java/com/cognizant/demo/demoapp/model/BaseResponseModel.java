package com.cognizant.demo.demoapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * Base response model for all responses having comon fields
 * 
 * @author sourav.dutta5@cognizant.com
 *
 */
public class BaseResponseModel {

	private List<String> messages;

	private boolean successIndicator;

	/**
	 * @return the messages
	 */
	public List<String> getMessages() {
		if (Objects.isNull(messages)) {
			messages = new ArrayList<>();
		}
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	/**
	 * @return the successIndicator
	 */
	public boolean isSuccessIndicator() {
		return successIndicator;
	}

	/**
	 * @param successIndicator
	 *            the successIndicator to set
	 */
	public void setSuccessIndicator(boolean successIndicator) {
		this.successIndicator = successIndicator;
	}

}
