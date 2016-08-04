package test;

/**
 * 
 * @author Iswar
 * This is an interface for any kind of shape like square, triangle etc.
 * It provides two basic methods namely area and perimeter.
 *
 */

public interface Shape {
	/*
	 * Get the area of the shape.
	 * @return area.
	 */
	public double area();
	
	/*
	 * Get the perimeter of the shape.
	 * @return perimeter.
	 */
	public double perimeter();

}
