		import java.awt.Graphics;       // program uses class Graphics
		import javax.swing.JApplet;     // program uses class JApplet
		import javax.swing.JOptionPane; // program uses class JOptionPane
		
		public class AddApplet extends JApplet 
		{
		   private double sum; // sum of values entered by user
		
		   // initialize applet by obtaining values from user
		   public void init()
	   {
		      String firstNumber;  // first string entered by user 
		      String secondNumber; // second string entered by user
		
		      double number1; // first number to add 
		      double number2; // second number to add
		      // obtain first number from user
		      firstNumber = JOptionPane.showInputDialog(
		         "Enter first floating-point value" );
		
		      // obtain second number from user
		      secondNumber = JOptionPane.showInputDialog(
		         "Enter second floating-point value" );
			      // convert numbers from type String to type double
		      number1 = Double.parseDouble( firstNumber );      
		      number2 = Double.parseDouble( secondNumber );     
		
		      sum = number1 + number2; // add numbers          
		   } // end method init
		
		   // draw results in a rectangle on applet’s background
		   public void paint( Graphics g )
		   {
		      super.paint( g ); // call superclass version of method paint
		
		      // draw rectangle starting from (15, 10) that is 270 
		      // pixels wide and 20 pixels tall
		      g.drawRect( 15, 10, 270, 20 );
		
		      // draw results as a String at (25, 25)     
		      g.drawString( "The sum is " + sum, 25, 25 );
		   } // end method paint
		} // end class AdditionApplet

	

