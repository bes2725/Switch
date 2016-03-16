//Bailey Spicer
//March 15, 2016
//bes2725@email.vccs.edu
//This program is an example of Switch, and will ask the user for his role,
//and the output will vary depending on what the user chose.

import java.util.Scanner;

public class SwitchCase
{
	public static void main(String[] args)
	{
		//declare variables
		int role;
		String userRole;

		//scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello! Please tell us your role in the organization. "
			+ "\nAre you: \n1: Administrator \n2: Faculty \n3: Staff \n"
			+ "4: Student \n5: Guest \nTo make your selection, please enter a "
			+ "number \nbetween 1 and 5 and press enter.");

		role = in.nextInt();

		switch (role)
		{
			case 1: userRole = "Welcome <ADMINISTRATOR>!";
				break;
			case 2: userRole = "Welcome <FACULTY>!";
				break;
			case 3: userRole = "Welcome <STAFF>!";
				break;
			case 4: userRole = "Welcome <STUDENT>!";
				break;
			case 5: userRole = "Welcome <GUEST>!";
				break;
			default: userRole = "You are not a valid user.";
				break;
		}

		System.out.println(userRole);
	}
}
