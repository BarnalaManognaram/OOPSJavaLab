package student_management_system;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryTreeMap {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<>();
		boolean flag=true;
		while(flag) {
			System.out.println("1. To enter definition");
			System.out.println("2. To print all definition");
			System.out.println("3. Quit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addDefinitions(tm);
				break;
			case 2:
				printAll(tm);
				break;
				
			case 3:
				System.out.println("You are quitting");
				flag=false;
				break;
			}
		}
	}
	public static void addDefinitions(TreeMap<String,String> tm) {
		System.out.println("Enter ur word here");
		String key=sc.next();
		System.out.println("Enter definition of word here");
		sc.nextLine();
		String def=sc.nextLine();
	     tm.put(key, def);
	}
	public static void printAll(TreeMap<String,String> tm) {
		for(Map.Entry<String, String> ml:tm.entrySet()) {
			System.out.println(ml.getKey()+": "+ml.getValue());
		}
	}
}
