/** 
 * File: EvenOdd.java Author: Lewis/Loftus 
 * 
 * Demonstrates the use of the JOptionPane class.
 */

import javax.swing.JOptionPane;
class SquareRoots {

	/** 
	 * Determines if the value input by the user is even or odd. 
	 * Uses multiple dialog boxes for user interaction.
	 */ 
	public static void main (String[] args) {
		
		String numStr, result;
		double num; 
		int again;

		do {
			numStr = JOptionPane.showInputDialog ("Enter an integer: ");
			num = Integer.parseInt(numStr);
			
			result = "That square roots of the number is " + (Math.sqrt(num));
			
			JOptionPane.showMessageDialog (null, result);
			
			again = JOptionPane.showConfirmDialog (null, "Do Another?");
		} while (again == JOptionPane.YES_OPTION);
	}
}