package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employeeList = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int n =sc.nextInt();
		
		
		for(int i = 1 ; i <= n;i++) {
			sc.nextLine();
			System.out.println("Employee #"+i+" data: ");
			System.out.print("Outsourced (y/n)? ");
			char decision =sc.next().charAt(0);
			
			
			if(decision == 'n') {
				
				sc.nextLine();
				System.out.print("Name: ");
				String  name= sc.nextLine();
				System.out.print("Hours: ");
				int  hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double  valuePerHour= sc.nextDouble();
				Employee employee0 = new Employee(name, hours, valuePerHour);
				employeeList.add(employee0);
			}else {
				sc.nextLine();
				System.out.print("Name: ");
				String  name= sc.nextLine();
				System.out.print("Hours: ");
				int  hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double  valuePerHour= sc.nextDouble();
				System.out.print("Additional charge: ");
				double  additionalCharge= sc.nextDouble();
				Employee employee0 = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				employeeList.add(employee0);	
				
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee employee2 : employeeList) {
			System.out.println(employee2.getName() + " - $ "+String.format("%.2f", employee2.payment()));
		}
		
		
		sc.close();
	}

}
