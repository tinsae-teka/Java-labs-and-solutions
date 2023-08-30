/** 
 * File: CirclePanel.java 
 * 
 * A panel with a circle drawn in the center and buttons on the 
 * bottom that move the circle.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CirclePanel extends JPanel {
	
	private final int CIRCLE_SIZE = 50;
	int width;
	 int height;
	private int x,y;
	private Color c;
	// Create buttons to move the circle
	JButton left = new JButton("Left");
	JButton right = new JButton("Right");
	JButton up = new JButton("Up");
	JButton down = new JButton("Down");

	/** 
	 * Set up circle and buttons to move it.
	 */ 
	public CirclePanel(int width, int height) {
		
		this.width = width;
		this.height =height;
		
		setSize(this.width, this.height);
		// Set coordinates so circle starts in middle
		x = (this.width/2)-(CIRCLE_SIZE/2);
		y = (this.height/2)-(CIRCLE_SIZE/2);
		c = Color.green;
		
		// Need a border layout to get the buttons on the bottom
		this.setLayout(new BorderLayout());
		
		
		
		// Add listeners to the buttons
		left.addActionListener(new MoveListener(-20,0));
		left.setMnemonic(KeyEvent.VK_L);
		left.setToolTipText("Click this button to move the circle by 20 pixels to the left");
		right.addActionListener(new MoveListener(20,0));
		right.setMnemonic(KeyEvent.VK_R);
		right.setToolTipText("Click this button to move the circle by 20 pixels to the right");
		up.addActionListener(new MoveListener(0,-20));
		up.setMnemonic(KeyEvent.VK_U);
		up.setToolTipText("Click this button to move the circle by 20 pixels up");
		down.addActionListener(new MoveListener(0,20));
		down.setMnemonic(KeyEvent.VK_D);
		down.setToolTipText("Click this button to move the circle by 20 pixels down");

		// Need a panel to put the buttons on or they'll be on
		// top of each other.
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(left);
		buttonPanel.add(right);
		buttonPanel.add(up);
		buttonPanel.add(down);

		// Add the button panel to the bottom of the main panel
		this.add(buttonPanel, "South");
	}
	/** 
	 * Draw circle on CirclePanel
	 */ 
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
			page.setColor(c);
			page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
	}

	/** 
	 * Class to listen for button clicks that move circle.
	 */ 
	private class MoveListener implements ActionListener {
		
		private int dx;
		private int dy;
		/** 
		 * Parameters tell how to move circle at click.
		 */ 
		public MoveListener(int dx, int dy) {
			this.dx = dx;
			this.dy = dy;
			
		}


		/** 
		 * Change x and y coordinates and repaint.
		 */ 
		
		public void actionPerformed(ActionEvent e) {
			x += dx;
			y += dy;
			if(x < 0){
				System.out.print("Disable left");
				left.setEnabled(false);
			}else {
				left.setEnabled(true);
			}
			if(x>width){
				System.out.print("Disable right");
				right.setEnabled(false);
			}else {
				right.setEnabled(true);
			}


			if(y<0){
				System.out.print("Disable Up");
				up.setEnabled(false);
			}else {
				up.setEnabled(true);
			}
			if(y > height){
				System.out.print("Disable Down");
				down.setEnabled(false);
			}else {
				down.setEnabled(true);
			}
			repaint();
		}
	}
}