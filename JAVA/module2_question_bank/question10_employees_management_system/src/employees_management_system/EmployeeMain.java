package employees_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		ArrayList<Employee> al=new ArrayList<>();
		boolean flag=true;
		while(flag) {
			System.out.println("=====Enter Your Choice======");
			System.out.println("1. To add Employee Details");
			System.out.println("2. To display all the details");
			System.out.println("3. To display avg, min and max salaries of employee");
			System.out.println("4. Quit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					addEmployee(al);
					break;
				case 2:
					printAllEmployees(al);
					break;
				case 3:
					printMinMaxSalary(al);
					break;
				case 4: 
					flag=false;
					break;
					
				default:
					System.out.println("Invalid choice");
					break;
							
			}
		}
	}
	public static void addEmployee(ArrayList<Employee> al){
		try {
		Employee e=new Employee();
		System.out.print("Enter Name:");
		sc.nextLine();
		e.name=sc.nextLine();
        System.out.print("Enter salary:");
		int salary=sc.nextInt();
		if(salary<0) {
			throw new InvalidSalaryException();
		}
		e.salary=salary;
		System.out.print("Enter dept:");
		e.dept=sc.next();
		al.add(e);
		System.out.println("Details Added successfully");
		}
		catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void printAllEmployees(ArrayList<Employee> al) {
        for (Employee a : al) {
            System.out.println("Name: " + a.name);
            System.out.println("Salary: " + a.salary);
            System.out.println("Department: " + a.dept);
            System.out.println("---------------------------");
        }
    }
	public static void printMinMaxSalary(ArrayList<Employee> al) {
		int sum=0,avg=0;
		for(Employee a:al) {
			sum+=a.salary;
		}
		avg=sum/al.size();
		System.out.println("Average Salary:"+avg);
		Employee minSalaryEmp = Collections.min(al, Comparator.comparingInt(e -> e.salary));
	    Employee maxSalaryEmp = Collections.max(al, Comparator.comparingInt(e -> e.salary));
        System.out.println("Min salary:"+minSalaryEmp.salary+"("+minSalaryEmp.name+","+minSalaryEmp.dept+")");
        System.out.println("Max salary:"+maxSalaryEmp.salary+"("+maxSalaryEmp.name+","+maxSalaryEmp.dept+")");
	}

}
