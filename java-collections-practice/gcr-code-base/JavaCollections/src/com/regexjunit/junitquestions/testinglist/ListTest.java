package com.regexjunit.junitquestions.testinglist;

import java.util.List;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ListTest {
	List<Integer> list ;
	ListManager manager;
	
    @BeforeEach
    void setup() {
        list = new ArrayList<>();
        manager = new ListManager();
        list.add(10); // common starting state
    }
    
	@Test
	void testAdd() {
		assertEquals(20,manager.addElement(list, 20));
        assertFalse(list.contains(20));
	}
	
	@Test
	void remove() {
		assertTrue(manager.removeElement(list, 10));
        assertFalse(list.contains(20));
	}
	@Test
	void getSize() {
		assertEquals(list.size(),manager.getSize(list));
	}
}
