package org.tnsindia.customexception;
import java.util.Scanner;

//Custom Exception for validating the Login credentials
class LoginCredentials extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String str;

	//constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
}