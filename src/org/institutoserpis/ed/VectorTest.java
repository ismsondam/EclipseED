package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void indexOf() {
		int[] v = new int[] { 16, 12, 15, 14, 17 };
		assertEquals(2, Vector.indexOf(v, 15));
	}
	
	@Test
	void min() {
		assertEquals(1, Vector.min(new int[] {5, 4, 3, 2, 1}));
		assertEquals(10, Vector.min(new int[] {50, 30, 70, 10}));
		assertEquals(5, Vector.min(new int[] {5}));
	}
	
	@Test
	void indexOfMin()
	{	
		assertEquals(2, Vector.indexOfMin(new int[] {10, 5, 3, 15, 30}));
		assertEquals(3, Vector.indexOfMin(new int[] {0, 10, 12, -5}));
		assertEquals(0, Vector.indexOfMin(new int[] {1}));
	}

	@Test
	void sort()
	{
		
	}
}
