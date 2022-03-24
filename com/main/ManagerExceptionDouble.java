package com.main;

import java.util.Scanner;

public class ManagerExceptionDouble extends ManagerException
{

	public Double manageException(Scanner sc) {

		Double nber = 0.;
		boolean bool;

		do {
			try {
				nber = sc.nextDouble();
				bool = false;

			} catch (Exception e) {

				System.err.print("please enter an number\n$: ");
				bool = true;
				sc.next();
			}
		} while (bool);

		
		return nber;

	}
	
	public Double manageException(Scanner sc, String errorMessage) {

		Double nber = 0.;
		boolean bool;

		do {
			try {
				nber = sc.nextDouble();
				bool = false;

			} catch (Exception e) {

				System.err.println(errorMessage);
				System.out.print("$: ");
				bool = true;
				sc.next();
			}
		} while (bool);

		
		return nber;

	}
}
