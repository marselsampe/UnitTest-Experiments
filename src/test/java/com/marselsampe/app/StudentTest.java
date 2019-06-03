package com.marselsampe.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {
	@Test
	public void testSetName() {
		Student student = new Student("Marsel");
		student.setName("Marsel Sampe");
		assertEquals("Marsel Sampe", student.getName());
	}
}
