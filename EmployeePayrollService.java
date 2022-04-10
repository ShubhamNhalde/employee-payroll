package com.bridgelabz.emppayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Purpose = Create an Employee Payroll Service to Read and Write Employee
 * Payroll to a Console.
 * 
 * @author ShubhamNhalde
 * @since 10/04/2022
 *
 */

public class EmployeePayrollService {

	public static final Scanner SC = new Scanner(System.in);
	private List<EmployeePayroll> employeeList;

	public EmployeePayrollService() {
		this.employeeList = new ArrayList<EmployeePayroll>();
	}

	public void readEmployeeData() {
		System.out.println("Enter employee id:");
		int employeeId = SC.nextInt();
		System.out.println("Enter employee name:");
		SC.nextLine();
		String employeeName = SC.nextLine();
		System.out.println("Enter employee salary:");
		double employeeSalary = SC.nextDouble();
		EmployeePayroll newEmployee = new EmployeePayroll(employeeId, employeeName, employeeSalary);
		employeeList.add(newEmployee);
	}

	public void writeEmployeeDate() {
		for (EmployeePayroll o : employeeList)
			System.out.println(o.toString());
	}

	public static void main(String[] args) {
		EmployeePayrollService serviceObject = new EmployeePayrollService();
		serviceObject.readEmployeeData();
		serviceObject.writeEmployeeDate();
	}

}
