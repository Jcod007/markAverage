package com.main;

import java.util.Scanner;

public abstract class ManagerException {
	
	public abstract Object manageException(Scanner sc);
	public abstract Object manageException(Scanner sc, String errorMessage);
}
