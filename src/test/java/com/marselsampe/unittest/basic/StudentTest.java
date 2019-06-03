package com.marselsampe.unittest.basic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.marselsampe.unittest.basic.Student;

public class StudentTest {
	@Test
	public void testSetName() {
		Student student = new Student("Marsel");
		student.setName("Marsel Sampe");
		assertEquals("Marsel Sampe", student.getName());
	}
}
