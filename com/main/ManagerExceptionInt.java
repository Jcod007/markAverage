package com.main;

import java.util.Scanner;

public class ManagerExceptionInt extends ManagerException{

	public Integer manageException(Scanner sc) {

		Integer nber = 0;
		boolean bool;

		do {
			try {
				nber = sc.nextInt();
				bool = false;

			} catch (Exception e) {

				System.err.print("please enter an integer\n$: ");
				bool = true;
				sc.next();
			}
		} while (bool);

		
		return nber;

	}
	public Integer manageException(Scanner sc,String errorMessage) {

		Integer nber = 0;
		boolean bool;

		do {
			try {
				nber = sc.nextInt();
				bool = false;

			} catch (Exception e) {

				System.err.print(errorMessage);
				System.out.print("$: ");
				bool = true;
				sc.next();
			}
		} while (bool);

		
		return nber;

	}
}
