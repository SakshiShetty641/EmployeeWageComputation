package com.bridgelabz;
/**
 * @author Sakshi Shetty
 * Purpose - To check whether Employee is present or absent
 */
public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program");
		// Declaring a constant
		int IS_PRESENT = 1;
		/**
		 * Using Math.random method to generate random numbers 0 and 1
		 */
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT)
			System.out.println("The Employee is Present");
		else
			System.out.println("The Employee is Absent");

	}
}
