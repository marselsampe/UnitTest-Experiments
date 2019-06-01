package com.marselsampe.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {
	@Test
	public void testSetName() {
		Student student = new Student();
		student.setName("Marsel");
		assertEquals("Marsel", student.getName());
	}
}
