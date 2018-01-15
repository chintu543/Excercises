package com.employeeapp.EmployeeApplication;

import java.util.Scanner;

import com.employee.EmployeeLibrary.CollectionEmployeeOperations;
import com.employee.EmployeeLibrary.CollectionEmployeeUtil;
import com.employee.EmployeeLibrary.EmployeeNotFoundException;
import com.employee.EmployeeLibrary.IEmployeeArray;
import com.employee.EmployeeLibrary.InvalidSalaryException;

public class EmployeeCollectionsApp {

	public static void main(String[] args) throws Exception {

		collectionOperations();

	}

	private static void collectionOperations() throws Exception {

		Scanner sc = new Scanner(System.in);
		IEmployeeArray cImpl = new CollectionEmployeeOperations();

		CollectionEmployeeUtil.populateCSVtoArraylist(cImpl);

		System.out.println("\n" + "Imported values from CSV file");

		do {
			CollectionEmployeeUtil.displayMenu();
			int c = sc.nextInt();
			switch (c) {

			case 1:
				try {
					cImpl.createEmployee(CollectionEmployeeUtil.readEmployee());
				} catch (InvalidSalaryException ex) {
					System.out.println(ex);
				}
				break;
			case 2:
				System.out.println("please enter the id to find employee");
				int empid = sc.nextInt();
				System.out.println(cImpl.findEmployee(empid));
				break;
			case 3:
				System.out.println("Please enter the name to find employee");
				String name = sc.next();
				System.out.println(cImpl.findEmployee(name));
				break;
			case 4:
				System.out.println("Please enter new employee details you want to update with");
				//int id = sc.nextInt();
				try {
					cImpl.updateEmployee(CollectionEmployeeUtil.getNewEmpDetails());
				} catch (EmployeeNotFoundException ex) {
					System.out.println(ex);
				}
				break;
			case 5:
				System.out.println("Please enter employee id to get Gross Salary");
				int eid = sc.nextInt();
				System.out.println("Gross Salary of given employee id is: " + cImpl.calculateGrossSal(eid));
				break;
			case 6:
				((CollectionEmployeeOperations) cImpl).displayEmployee();
				break;
			case 7:
				System.out.println("Enter employee id you wanna delete");
				int Id = sc.nextInt();
				try {
					cImpl.deleteEmployee(Id);
					System.out.println("Employee is deleted!!");
				} catch (EmployeeNotFoundException ex) {
					System.out.println(ex);
				}
				break;
			case 8:
				((CollectionEmployeeOperations) cImpl).sort();
				break;
			case 9:
				((CollectionEmployeeOperations) cImpl).displayUniqueNames();
				break;
			case 10:
				((CollectionEmployeeOperations) cImpl).displayAgeRangeCount();
				break;
			case 11:
				((CollectionEmployeeOperations) cImpl).writeToFile();
				return;
			}
			
			
		} while (true);

	}

}
