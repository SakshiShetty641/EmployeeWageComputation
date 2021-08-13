package com.bridgelabz;
/**
 * Purpose - To save total wage for each company
 * @author Sakshi Shetty
 * @version 16.0
 * @since 2021-08-13
 */
public class EmployeeWageBuilder {
	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2

	private final String company;
	private final int empRatePerHour;
	private final int noOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWageBuilder(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.totalEmpWage = totalEmpWage;
	}

  /**
	 * This method is used to compute the employee wage
	 */
public void computeWage() {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		/**
		 * Using Math.random method to generate random numbers 0, 1 and 2
		 */
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
			totalWorkingDays++;
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

			totalEmpHrs += empHrs;
			System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Wages is : " + totalEmpWage);

	}

	@Override
	public String toString() {
		return " Total Employee Wage" + company + " : " + totalEmpWage;

	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program");
		EmployeeWageBuilder dmart = new EmployeeWageBuilder("Dmart", 20, 2, 10);
		EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance", 10, 4, 20);
		dmart.computeWage();
		System.out.println(dmart);
		reliance.computeWage();
		System.out.println(reliance);

	}
}