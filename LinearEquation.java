package edu.wit.cs.comp1050;

//TODO: document this class
public class LinearEquation {
	
	/**
	 * Initialize the linear equation of form:
	 * ax + by = e
	 * cx + dy = f
	 * 
	 * @param a parameter a
	 * @param b parameter b
	 * @param c parameter c
	 * @param d parameter d
	 * @param e parameter e
	 * @param f parameter f
	 */
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		// replace with your code
	}
	
	/**
	 * Convenience constructor to initialize
	 * the linear equation via array
	 * 
	 * THIS CONSTRUCTOR CALLS THE CONSTRUCTOR
	 * ABOVE USING THE ARRAY CONTENTS
	 * 
	 * @param p parameter array, assumed to be length 6 (a-f, in order)
	 */
	public LinearEquation(double[] p) {
		// MUST call the above constructor
		// with the contents of p
	}
	
	/**
	 * Returns parameter a
	 * 
	 * @return a
	 */
	public double getA() {
		return 0.; // replace with your code
	}
	
	/**
	 * Returns parameter b
	 * 
	 * @return b
	 */
	public double getB() {
		return 0.; // replace with your code
	}
	
	/**
	 * Returns parameter c
	 * 
	 * @return c
	 */
	public double getC() {
		return 0.; // replace with your code
	}
	
	/**
	 * Returns parameter d
	 * 
	 * @return d
	 */
	public double getD() {
		return 0.; // replace with your code
	}
	
	/**
	 * Returns parameter e
	 * 
	 * @return e
	 */
	public double getE() {
		return 0.; // replace with your code
	}
	
	/**
	 * Returns parameter f
	 * 
	 * @return f
	 */
	public double getF() {
		return 0.; // replace with your code
	}
	
	/**
	 * Returns true if the parameterized
	 * equation is solvable (i.e. denominator
	 * ad-bc is not 0)
	 * 
	 * @return true if solvable, false otherwise
	 */
	public boolean isSolvable() {
		return false; // replace with your code
	}
	
	/**
	 * Returns solution for x if solvable,
	 * null otherwise
	 * 
	 * @return x if solvable, null otherwise
	 */
	public Double getX() {
		return null; // replace with your code
	}
	
	/**
	 * Returns solution for y if solvable,
	 * null otherwise
	 * 
	 * @return y if solvable, null otherwise
	 */
	public Double getY() {
		return null; // replace with your code
	}

}
