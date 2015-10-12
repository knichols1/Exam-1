package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Staff_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add(50,"Megan");
		list.add(400,"John");
		list.add(400,"Mike");
		list.add(200,"Sean");
		list.add(10,"Jake");
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}
	
	@Test
	public void test(String[] args) {
		assertEquals(meanofsalaries(),212);
	}
	
	@Test(expected=Person.class)
	public final void testPerson() throws PersonException{
		DOB= 1900;
		phone_number=13029402945;
		
		assertEquals("You have entered the wrong DOB",(long)c.Person,(long));
        c

	private Object meanofsalaries() {
		return null;
	}
}
