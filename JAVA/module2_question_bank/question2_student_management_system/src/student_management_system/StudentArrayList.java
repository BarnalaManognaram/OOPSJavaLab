package student_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		    boolean flag=true;
			while(flag) {
			System.out.println("=====Enter your choice====");
			System.out.println("1. To add student details");
			System.out.println("2. To remove student details through id");
			System.out.println("3. To search the student records based on id");
			System.out.println("4. To print all student detailsS");
			System.out.println("5. Quit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addStudent(al);
				break;
				
			case 2:
				System.out.println("Enter id of student who u want to remove");
				removeDetails(al,sc.nextInt());
				break;
				
			case 3:
				System.out.println("Enter id of student who u want to search");
				searchDetails(al,sc.nextInt());
				break;
			
			case 4:
				printDetails(al);
				break;
			case 5:
				flag=false;
				System.out.println("You have exited from menu");
				break;
				
			}	
		}
	}
	public static void addStudent(ArrayList<Student> al) {
		Student s=new Student();
		System.out.print("Enter Id of Student: ");
		s.id=sc.nextInt();
		System.out.print("Enter Name of Student: ");
		sc.nextLine();
		s.name=sc.nextLine();
		System.out.print("Enter Age of Student: ");
		s.age=sc.nextInt();
		System.out.print("Enter grades of Student: ");
		s.grade=sc.nextDouble();
		al.add(s);
	}
	
	public static void printDetails(ArrayList<Student> al) {
		for(int i=0;i<al.size();i++) {
			System.out.println("Student Id: "+al.get(i).id);
			System.out.println("Student Name: "+al.get(i).name);
			System.out.println("Student Age: "+al.get(i).age);
			System.out.println("Student grade: "+al.get(i).grade);
			System.out.println();
		}
	}
	public static void removeDetails(ArrayList<Student> al,int id) {
		int d=searchDetails(al,id);
		if(d!=0) {
		al.remove(d-1);
		}
	}
	public static int searchDetails(ArrayList<Student> al,int id) {
		for(int i=0;i<al.size();i++) {
			if(al.get(i).id==id) {
				ArrayList<Student> temp = new ArrayList<>();
				temp.add(al.get(i));
				printDetails(temp);
				return i+1;
			}
		}
		System.out.println("Details not found.");
		return 0;
	}
	

}
