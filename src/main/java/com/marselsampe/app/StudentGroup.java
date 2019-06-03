package com.marselsampe.app;

import java.util.ArrayList;

public class StudentGroup
{
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public ArrayList<Student> getStudents(){
		return this.students;
	}
}