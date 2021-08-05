package com.bridgelabz;
/**
 * @author Sakshi Shetty
 * Purpose - Calculating wages for a month assuming 20 working days in a month
 */
public class EmployeeWageBuilder {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	public static final int Emp_Rate_PerHr = 20;
	public static final int NO_WORKINGDAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program");
    // Declaring a variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		/**
		 * Using Math.random method to generate random numbers 0, 1 and 2
		 */
		for (int day = 0; day < NO_WORKINGDAYS; day++) {
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
			totalEmpWage += empWage;
			System.out.println("The daily wage of an employee is:-" + empWage);
		}
		System.out.println("The daily wage of an employee is:-" + totalEmpWage);
	}
}
