package com.marselsampe.unittest.basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.marselsampe.unittest.basic.Student;
import com.marselsampe.unittest.basic.StudentGroup;

import java.util.ArrayList;

public class StudentGroupTest {
	@Test
	public void testAddStudent() {
		StudentGroup studentGroup = new StudentGroup();
		Student student = new Student("Marsel");
		studentGroup.addStudent(student);
		
		assertEquals(1, studentGroup.getStudents().size());
		assertEquals("Marsel", studentGroup.getStudents().get(0).getName());
	}
	
	@Test
	public void testGetStudents() {
		StudentGroup studentGroup = new StudentGroup();
		Student student1 = new Student("Marsel");
		studentGroup.addStudent(student1);
		Student student2 = new Student("Sampe");
		studentGroup.addStudent(student2);
		
		ArrayList<Student> listStudent=studentGroup.getStudents();
		Student[] students = listStudent.toArray(new Student[listStudent.size()]);
		Student[] expectedStudents = new Student[] { student1, student2 }; 
		assertArrayEquals(expectedStudents, students);
	}
}
