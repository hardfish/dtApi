package com.dtdream.baseapi;

/**
 * Created by X0269 on 2015/4/25.
 */

/**
 * Exception which is thrown when an API lookup did not succeed
 *
 * @author Jeremy Unruh
 */
public class ApiNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new ApiNotFoundException.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ApiNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new ApiNotFoundException.
	 *
	 * @param message the message
	 */
	public ApiNotFoundException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new ApiNotFoundException.
	 *
	 * @param cause the cause
	 */
	public ApiNotFoundException(Throwable cause) {
		super(cause);
	}

}
