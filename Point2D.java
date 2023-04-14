package edu.wit.cs.comp1050;

//TODO: document this class
public class Point2D {
	double x;
	double y;
	/**
	 * Constructor to initialize coordinates
	 * 
	 * @param x x value
	 * @param y y value
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Initializes to (0., 0.)
	 */
	public Point2D() {
		new Point2D(0.0, 0.0);
		// replace with your code
		// MUST be a single call
		// to the constructor above
	}
	
	
	/**
	 * Get the x coordinate
	 * 
	 * @return x coordinate
	 */
	public double getX() {
		return x; // replace with your code
	}
	
	
	/**
	 * Get the y coordinate
	 * 
	 * @return y coordinate
	 */
	public double getY() {
		return y; // replace with your code
	}
	
	/**
	 * Gets a String representation
	 * of the coordinate in the form
	 * "(x, y)" (each with three decimal
	 * places of precision)
	 * 
	 * #return "(x, y)"
	 */
	public String toString() {
		return ("(" + String.format("%.3f", x) + ", " + String.format("%.3f", y) + ")");
	}
	
	/**
	 * Method to compute the Euclidean/L2
	 * distance between two points in 2D
	 * space
	 * 
	 * @param p1 point 1
	 * @param p2 point 2
	 * @return straightline distance between p1 and p2
	 */
	public static double distance(Point2D p1, Point2D p2) {
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}
	
	/**
	 * Method to compute the Euclidean
	 * distance between this point
	 * and a supplied point
	 * 
	 * @param p input point
	 * @return straightline distance between this point and p
	 */
	public double distanceTo(Point2D p) {
		return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
		}

	}
