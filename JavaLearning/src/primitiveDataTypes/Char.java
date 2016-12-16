package primitiveDataTypes;

import javax.swing.JOptionPane;

public class Char {

	public static void main(String[] args) {
		char shin ='ש';
		JOptionPane.showMessageDialog(null, "char: "+shin);
		char armenian='\u090B';
		JOptionPane.showMessageDialog(null, armenian);
		armenian++;
		JOptionPane.showMessageDialog(null, armenian);


	}

}
