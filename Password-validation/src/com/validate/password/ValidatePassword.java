package com.validate.password;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePassword {

	public static void main(String[] args) {
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[&%$#+?@=]).{10,20}$";
		String inputPassword = "";
		Scanner sc = new Scanner(System.in);
		inputPassword = sc.next();

		if (Pattern.matches(regex, inputPassword)) {
			System.out.println("Password Matches the Condition");
		} else {
			System.out.println(
					"A password is a combination of 10 to 20 uppercase and lowercase alphanumers and one or more symbols (&% $ # +? @ =).");
		}
		sc.close();
	}

}
