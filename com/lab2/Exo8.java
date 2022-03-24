package com.lab2;

import java.util.Scanner;

import com.main.ManagerException;
import com.main.ManagerExceptionDouble;
import com.main.ManagerExceptionInt;

public class Exo8 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		ManagerException manager[] = {new ManagerExceptionDouble(),new ManagerExceptionInt()};
		int nberStudent = 0, nberMark = 0;
		double matrix[][], studentAverage[] = new double[nberStudent], classAverage = 0;
		double markMax = 0;
		
		System.out.print("enter a number of student: ");
		nberStudent = (int)manager[1].manageException(sc);
		System.out.print("enter a number of subjects: ");
		nberMark = (int)manager[1].manageException(sc);
		System.out.print("the subjects are marked on how much?: ");
		markMax =(double)manager[0].manageException(sc);
		
		matrix = new double[nberStudent][nberMark];
		studentAverage = new double[nberStudent];
		
		for(int i = 0 ; i < nberStudent;i++)
		{
			System.out.println("student "+(i+1));
			for(int j = 0;j< nberMark;j++)
			{
				do{
					
					System.out.printf("\tnote %d: ",j+1);
					matrix[i][j] = (double) manager[0].manageException(sc);
					if(matrix[i][j] < 0 || matrix[i][j] > markMax)
					{
						System.err.println("please your mark must be greater than 0  and lower or equal as 20 ");
					}
				}while(matrix[i][j] < 0 || matrix[i][j] > markMax);
					
				studentAverage[i] += matrix[i][j];
			}
			
			studentAverage[i]/= nberMark;
			classAverage += studentAverage[i];
			System.out.printf("\tStudent %d's average: %g/%g\n",i+1,studentAverage[i],markMax);
		}
		
		
		System.out.printf("Class's average: %g",classAverage/nberStudent);

	}

}
