package com.bridgelabz;
/**
 * @author Sakshi Shetty
 * Purpose - To calculate the daily wage of an Employee using Switch-Case
 */
public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program");
		// Declaring a constant
		int IS_FULLTIME = 1
		int IS_PARTTIME = 2;
		int Emp_Rate_PerHr = 20;
		// Declaring a variables
		int empHrs = 0;
		int empWage = 0;
		/**
		 * Using Math.random method to generate random numbers 0, 1 and 2
		 */
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case 0: // Employee is absent
			empHrs = 0;
		case 1: // FullTime Employee
			empHrs = 8;
			break;
		case 2: // PartTime Employee
			empHrs = 4;
			break;
		}
		/**
		 * Calculating the daily employee wage of an employee
		 */
		empWage = Emp_Rate_PerHr * empHrs;
		System.out.println("The daily wage of an employee is:-" + empWage);

	}

}
