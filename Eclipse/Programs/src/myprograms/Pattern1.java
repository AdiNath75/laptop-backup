package myprograms;

import java.util.Scanner;
public class Pattern1 {
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();

	        for (int i = 1; i <= rows; i++)
	        {
	            for (int j = rows; j > i; j--)
	            {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= i; k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
	        for (int i = 1; i <= rows; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= rows - i; k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
	    }
	}
