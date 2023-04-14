package edu.wit.cs.comp1050;
import java.text.DecimalFormat;
import java.util.Scanner;
//TODO: document this class
public class PA3b {
	
	/**
	 * Error to display if the command-line arguments are invalid
	 */
	public static final String ERR_USAGE = "Please supply 6 numbers (a-f).";
	
	/**
	 * Error to display if the equation has no solution
	 */
	public static final String ERR_NOSLTN = "The equation has no solution.";
	
	/**
	 * Number of required parameters (a-f)
	 */
	public static final int NUM_PARAMS = 6;
	
	/**
	 * Validates command-line arguments and returns
	 * parameters if valid
	 * 
	 * @param args command-line arguments
	 * @return if valid an array of parameters, else null
	 */
	public static double[] validateArgs(String[] args) {
		double[] p = new double[NUM_PARAMS];
	    if (args.length == NUM_PARAMS) {
	        for (int i = 0; i < args.length; i++) {
	            try {
	                p[i] = Double.parseDouble(args[i]);
	            } catch (NumberFormatException e) {
	                return null;
	            }
	        }
	        return p;
	    } else {
	        return null;
	    }
	}
	

	/**
	 * Uses command-line arguments to create 
	 * an instance of the linear equation,
	 * and reports the outcome
	 * 
	 * @param args command-line arguments, interpreted as equation parameters
	 */
	public static void main(String[] args) {
		double[] p = validateArgs(args);
		if (p == null) {
			System.out.println(ERR_USAGE);
			return;
		}
		LinearEquation l = new LinearEquation(p);
		
		if (l.isSolvable()) {
			 DecimalFormat df = new DecimalFormat("##.000");
			System.out.println("Solution: x=" + df.format(l.getX()) + ", y=" + df.format(l.getY()));
			}else {
				System.out.println(ERR_NOSLTN);
			}
	}
}
	
