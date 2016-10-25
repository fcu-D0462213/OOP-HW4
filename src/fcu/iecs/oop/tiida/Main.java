package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			NissanTiida tiida1=new NissanTiida();
			int number,i;
			System.out.println("Please enter a number:");
			number=scan.nextInt();
			for(i=0;i<number;i++)
			{
				tiida1.tiida(i);
			}
		// TODO Auto-generated method stub

	}

}
