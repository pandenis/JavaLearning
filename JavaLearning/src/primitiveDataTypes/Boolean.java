package primitiveDataTypes;
import javax.swing.*;
public class Boolean {
	
	public static void main (String[] args){
		//&& and 
	JOptionPane.showMessageDialog(null,
			"true && false return "+(true&&false)+"\n"
			+"true && true return "+(true&&true));
		//|| or
	JOptionPane.showMessageDialog(null,
			"false || true return "+(false||true)+"\n"
			+"true || true return "+(true||true));
		//! not
	JOptionPane.showMessageDialog(null, 
			"!true returns "+(!true)+"\n"
			+"!false returns "+(!false));
		//& and
	JOptionPane.showMessageDialog(null, 
			"true & false return "+(true&false)+"\n"
			+"true & true returns "+(true&true));
		//| ore
	JOptionPane.showMessageDialog(null, 
			"true | false return "+(true|false)+"\n"
			+"true | true return "+(true|true));
		//^ hor
	JOptionPane.showMessageDialog(null, 
			"true ^ true return "+(true^true)+"\n"
			+"true ^ false return "+(true^false)+"\n"
			+"false ^ false return "+(false^false));
	
	}

}
