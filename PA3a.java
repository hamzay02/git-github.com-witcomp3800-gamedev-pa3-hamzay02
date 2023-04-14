package edu.wit.cs.comp1050;

//TODO: document this class
public class PA3a {
	
	/**
	 * Error to output if no command-line arguments supplied
	 */
	public static final String ERR_USAGE = "Please supply at least one argument at the command line."; // DO NOT CHANGE
	
	/**
	 * Opening quote character
	 */
	public static final char QUOTE_CHAR_OPEN = '<'; // DO NOT CHANGE
	
	/**
	 * Closing quote character
	 */
	public static final char QUOTE_CHAR_CLOSE = '>'; // DO NOT CHANGE
	
	/**
	 * Finds an element in a non-empty
	 * array that has minimal length.
	 * If first is true, the first such;
	 * otherwise the last.
	 * 
	 * @param a input array
	 * @param first if true, return the first minimal-length element; otherwise the last
	 * @return element in a that has minimal length
	 */
	private static String findShortest(String[] a, boolean first) {
		return null; // replace with your code
	}
	
	/**
	 * Finds the first of the elements of a
	 * supplied array that have the minimal
	 * length
	 * 
	 * @param a input array (assumed non-empty)
	 * @return first element in a that has minimal length
	 */
	public static String firstShortestElement(String[] a) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		return findShortest(a, true);
	}
	
	/**
	 * Finds the last of the elements of a
	 * supplied array that have the minimal
	 * length
	 * 
	 * @param a input array (assumed non-empty)
	 * @return last element in a that has minimal length
	 */
	public static String lastShortestElement(String[] a) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		return findShortest(a, false);
	}
	
	/**
	 * Finds an element in a non-empty
	 * array that has maximal length.
	 * If first is true, the first such;
	 * otherwise the last.
	 * 
	 * @param a input array
	 * @param first if true, return the first maximal-length element; otherwise the last
	 * @return element in a that has maximal length
	 */
	private static String findLongest(String[] a, boolean first) {
		return null; // replace with your code
	}
	
	/**
	 * Finds the first of the elements of a
	 * supplied array that have the maximal
	 * length
	 * 
	 * @param a input array (assumed non-empty)
	 * @return first element in a that has maximal length
	 */
	public static String firstLongestElement(String[] a) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		return findLongest(a, true);
	}
	
	/**
	 * Finds the last of the elements of a
	 * supplied array that have the maximal
	 * length
	 * 
	 * @param a input array (assumed non-empty)
	 * @return last element in a that has maximal length
	 */
	public static String lastLongestElement(String[] a) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		return findLongest(a, false);
	}
	
	/**
	 * Returns an element with a supplied length
	 * (if it exists, else null). If first is true,
	 * the first such element; else the last.
	 * 
	 * @param a input array
	 * @param len length of element for which to search
	 * @param first if true searches for first; else searches for last
	 * @return element with length len in a according to first
	 */
	private static String findOfLength(String[] a, int len, boolean first) {
		return null; // replace with your code
	}
	
	/**
	 * Returns the first element of a
	 * supplied array that has the
	 * supplied length exactly, or
	 * null if not found
	 * 
	 * @param a input array
	 * @param len length of element for which to search
	 * @return first element with length len, or null if not found
	 */
	public static String firstOfLength(String[] a, int len) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		return findOfLength(a, len, true);
	}
	
	/**
	 * Returns the last element of a
	 * supplied array that has the
	 * supplied length exactly, or
	 * null if not found
	 * 
	 * @param a input array
	 * @param len length of element for which to search
	 * @return last element with length len, or null if not found
	 */
	public static String lastOfLength(String[] a, int len) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		return findOfLength(a, len, false);
	}
	
	/**
	 * Returns the sum of the lengths
	 * of all the elements in the
	 * supplied string array
	 * 
	 * @param a input array
	 * @return summation over the length of all strings in a
	 */
	public static int sumOfElementLengths(String[] a) {
		return 0; // replace with your code
	}
	
	/**
	 * Given a sum and count, returns
	 * the average as an integer
	 * naturally rounded
	 * 
	 * @param sum elements summed
	 * @param count count of elements
	 * @return rounded average of sum and count
	 */
	public static int averageAsInt(int sum, int count) {
		return 0; // replace with your code
	}
	
	/**
	 * Returns true if the supplied array
	 * has two elements with the same contents
	 * (not necessarily same identity)
	 * 
	 * @param a array to examine
	 * @return true if a contains duplicate elements
	 */
	public static boolean hasDuplicates(String[] a) {
		return false; // replace with your code
	}
	
	/**
	 * Utility method to quote a supplied 
	 * string using supplied open/close 
	 * characters
	 * 
	 * @param s string to quote
	 * @param cOpen character before the string
	 * @param cClose character after the string
	 * @return quoted string
	 */
	public static String flexibleQuote(String s, char cOpen, char cClose) {
		return ""; // replace with your code
	}
	
	/**
	 * Utility method for printing the first and last
	 * Strings from a list. Rules:
	 * - If both are null, return "none"
	 * - If either are null, return the other (quoted)
	 * - If the same string is provided twice (identity, not content); return either (quoted)
	 * - Otherwise return "first=quoted(sFirst), last=quoted(sLast)"
	 * 
	 * Characters for quoting are supplied as arguments
	 * 
	 * @param sFirst first string
	 * @param sLast last string
	 * @param cOpen open character for quoting
	 * @param cClose close character for quoting
	 * @return string according to the rules above
	 */
	public static String oneOrBothOrNone(String sFirst, String sLast, char cOpen, char cClose) {
		return ""; // replace with your code
	}
	
	/**
	 * Utility method to print (to the terminal) 
	 * an array of Strings given something before 
	 * the list, something after, and something 
	 * between each element
	 * 
	 * @param a elements
	 * @param sBefore what to print before the list 
	 * @param sSep what to print between each element
	 * @param sAfter what to print after the list
	 */
	public static void printWithSeparator(String[] a, String sBefore, String sSep, String sAfter) {
		// replace with your code
	}
	
	/**
	 * Returns true if command-line arguments
	 * were supplied; false otherwise
	 * 
	 * @param args program arguments
	 * @return true if input is of non-zero length
	 */
	public static boolean validArgs(String[] args) {
		return false; // replace with your code
	}

	/**
	 * Outputs a small analysis of strings
	 * supplied as command-line arguments
	 * to the program
	 * 
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		//////////////////////////////////
		// !! DO NOT CHANGE THIS METHOD !!
		//////////////////////////////////
		
		if (!validArgs(args)) {
			System.out.printf("%s%n", ERR_USAGE);
			System.exit(1);
		}
		
		//
		
		System.out.printf("Arguments (%d, %s duplication):", args.length, (hasDuplicates(args))?("has"):("no"));
		printWithSeparator(args, " ", " ", String.format("%n"));
		
		//
		
		final int lSum = sumOfElementLengths(args);
		final int lAvg = averageAsInt(lSum, args.length);
		System.out.printf("Length: total=%d, avg=%d%n", lSum, lAvg);
		
		//
		
		final String fShortest = firstShortestElement(args);
		final String lShortest = lastShortestElement(args);
		System.out.printf("Shortest (%d): %s%n", fShortest.length(), oneOrBothOrNone(fShortest, lShortest, QUOTE_CHAR_OPEN, QUOTE_CHAR_CLOSE));
		
		//
		
		final String fLongest = firstLongestElement(args);
		final String lLongest = lastLongestElement(args);
		System.out.printf("Longest (%d): %s%n", fLongest.length(), oneOrBothOrNone(fLongest, lLongest, QUOTE_CHAR_OPEN, QUOTE_CHAR_CLOSE));
		
		//
		
		final String fAverage = firstOfLength(args, lAvg);
		final String lAverage = lastOfLength(args, lAvg);
		System.out.printf("Average (%d): %s%n", lAvg, oneOrBothOrNone(fAverage, lAverage, QUOTE_CHAR_OPEN, QUOTE_CHAR_CLOSE));
	}

}
