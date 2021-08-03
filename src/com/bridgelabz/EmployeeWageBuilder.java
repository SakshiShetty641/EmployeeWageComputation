package com.bridgelabz;
/**
 * @author Sakshi Shetty
 * Purpose - To calculate the daily Employee Wage
 */
public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program");
		// Declaring a constant
		int IS_PRESENT = 1;
		int Emp_Wage = 0;
		int Emp_Hrs = 0;
		int Emp_Rate_PerHr = 20;
		/**
		 * Using Math.random method to generate random numbers 0 and 1
		 */
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT) {
			/**
			 * Calculating the daily employee wage assuming wage per hour as 20 and Full day hour as 8
			 */
			Emp_Hrs = 8;
			Emp_Wage = Emp_Rate_PerHr * Emp_Hrs;
			System.out.println("The employee is present and the daily wage of an employee is:-" + Emp_Wage);
		} else {
			System.out.println("The Employee is Absent and the daily employee wage is:-" + 0);
		}

	}
}
