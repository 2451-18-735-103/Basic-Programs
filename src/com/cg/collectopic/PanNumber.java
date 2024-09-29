package com.cg.collectopic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidPanNumber extends Exception{
	public InvalidPanNumber(String message) {
		super(message);
	}
}
public class PanNumber {
	public static void PanValidator(String pan) throws InvalidPanNumber {

		String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

		Pattern pattern = Pattern.compile(panPattern);

		Matcher matcher = pattern.matcher(pan);

		if (matcher.matches() && pan.length() == 10) {

		}

		else {

			throw new InvalidPanNumber("Invalid pan number");

		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		try {

			Scanner sc = new Scanner(System.in);

			String panNumbeer = sc.nextLine();

			PanValidator(panNumbeer);

			System.out.println("PAN is valid");

		}

		catch (InvalidPanNumber e) {

			System.out.println(e.getMessage());

		}

	}

}
