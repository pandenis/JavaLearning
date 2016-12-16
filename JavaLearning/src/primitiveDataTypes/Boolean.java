package primitiveDataTypes;
import javax.swing.*;
public class Boolean {
	
	public static void main (String[] args){
	JOptionPane.showMessageDialog(null,"true && false return "+(true&&false)+"\n"
			+"true && true return "+(true&&true));
	JOptionPane.showMessageDialog(null,"false || true return "+(false||true)+"\n"
			+"true || true return "+(true||true));
	JOptionPane.showMessageDialog(null, "!true returns "+(!true)+"\n"
			+"!false returns "+(!false));
	}

}
