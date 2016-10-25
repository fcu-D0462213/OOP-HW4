package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PasswordEncorder encoder=new PasswordEncorder();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a password:");
		boolean flag=true;
		while(flag)
		{
			String password=scan.next();
			if(password.compareTo("exit")==0)
			{
				flag=false;
			}
			else
			{
				System.out.println(encoder.encode(password));
			}
		}
		// TODO Auto-generated method stub

	}

}
