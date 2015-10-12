package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Course<String> list = new Course<String>();
		list.add("Math");
		list.add("Physics");
		list.add("English");
		
		Semester<String> list = new Semester<String>();
		list.add("Spring");
		list.add("Fall");
		
		Section<String> list = new Section<String>();
		list.add(12,"Math");
		list.add(13,"Math");
		list.add(14,"Physics");
		list.add(15,"Physics");
		list.add(10,"English");
		list.add(11,"English");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		c = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void student() {
		assertEquals(1,1);
	}
}
