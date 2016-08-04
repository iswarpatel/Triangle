package test;

import static org.junit.Assert.*;

import org.junit.Test;

import test.Triangle.Type;

public class TriangleTest {

	@Test
	public void testEquilateral() {
		Triangle t = new Triangle(5.5, 5.5, 5.5);
		assertEquals(t.classify(), Type.EQUILATERAL);
	}
	@Test
	public void testIsosceles() {
		Triangle t = new Triangle(5.5, 6.5, 5.5);
		assertEquals(t.classify(), Type.ISOSCELES);
	}
	@Test
	public void testScalene() {
		Triangle t = new Triangle(5.5, 6.7, 5.0);
		assertEquals(t.classify(), Type.SCALENE);
	}
	@Test
	public void testInvalid() {
		Triangle t = new Triangle(5.5, 20.7, 5.0);
		assertEquals(t.classify(), Type.INVALID);
	}
	@Test
	public void testNegative() {
		Triangle t = new Triangle(5.5, -2.7, 5.0);
		assertEquals(t.classify(), Type.INVALID);
	}
	@Test
	public void testBoundary() {
		Triangle t = new Triangle(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE);
		assertEquals(t.classify(), Type.EQUILATERAL);
	}
	@Test
	public void testMaxLength() {
		Triangle t = new Triangle(Double.MAX_VALUE/3, Double.MAX_VALUE/3, Double.MAX_VALUE/3);
		assertEquals(t.classify(), Type.EQUILATERAL);
	}
	
	// Test when i+j = k
	@Test
	public void testValidity() {
		Triangle t = new Triangle(14.6754, 7.7654, 22.4408);
		assertEquals(t.classify(), Type.INVALID);
	}
	
	@Test
	public void testOverflow() {
		Triangle t = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
		assertEquals(t.classify(), Type.EQUILATERAL);
	}
	@Test
	public void testOverflow2() {
		Triangle t = new Triangle(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
		assertEquals(t.classify(), Type.INVALID);
	}
}
