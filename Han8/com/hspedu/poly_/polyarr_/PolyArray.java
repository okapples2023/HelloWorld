package com.hspedu.poly_.polyarr_;

import java.util.Iterator;

public class PolyArray {
	public static void main(String[] args) {
		 
		Person[] persons = new Person[5];
		persons[0] = new Person("jack", 20);
		persons[1] = new Student("jack", 18, 100);
		persons[2] = new Student("smith", 19, 30.2);
		persons[3] = new Teacher("scott", 30, 20000);
		persons[4] = new Teacher("king", 50, 25000);
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].say());
			
			if(persons[i] instanceof Student) {
				((Student)persons[i]).study(); 
			} else if(persons[i] instanceof Teacher) {
				((Teacher)persons[i]).teach(); 
			} else if(persons[i] instanceof Person) {
				
			} else {
				System.out.println("类型有误,请检查...");
			}
			
		}
	}

}
