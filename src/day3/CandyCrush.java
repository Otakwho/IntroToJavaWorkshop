package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String Crush = JOptionPane.showInputDialog("Who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+Crush+"!");
		// 3. Ask the user for the name of their best friend
String Friend = JOptionPane.showInputDialog("Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
if (Friend.equalsIgnoreCase("Donald Trump")) {
	JOptionPane.showMessageDialog(null, "You must not have many other friends.");
	
}
else{
JOptionPane.showMessageDialog(null, "Well, "+Friend+" is as sweet as candy.");

}
	} 
}



