package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName(){System.out.println("Name of the Student is Vanitha");}
	public void studentDept(){System.out.println("Name of the Student department is IT");}
	public void studentId(){System.out.println("Student Id is 16166");}

	public static void main(String[] args) {
		Student std= new Student();
		std.studentDept();
		std.studentId();
		std.studentName();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();		

	}

}
