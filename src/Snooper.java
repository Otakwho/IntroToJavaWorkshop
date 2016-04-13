import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String Name = JOptionPane.showInputDialog ("What is your name?");
	JOptionPane.showMessageDialog (null, "Hello, "+Name+".");
	String Address = JOptionPane.showInputDialog("So I was thinking we should meet up. What's your address?");
	String BankNo = JOptionPane.showInputDialog("Okay, when would you like to meet? Before that though, I need to borrow some money. What's your bank number?");
	JOptionPane.showMessageDialog(null, "Oh, thanks!");
	String PhoneNo = JOptionPane.showInputDialog("So, when should we get together? I'm thinking your place, can you send me your schedule for this month? Oh, I'll text you first so what's your phone number?")	;
	JOptionPane.showMessageDialog(null, "Thank you, "+Name+", for providing the following information:\nAddress: "+Address+"\nBank Number: "+BankNo+"\nPhone Number: "+PhoneNo+"\nOur company will not hesitate to use this information in any way that we please. We thank you for your valuable time and information.");
}
}
