package primitiveDataTypes;

import javax.swing.JOptionPane;
//http://pr0java.blogspot.co.il/2015/04/java-char.html
public class Char {

	public static void main(String[] args) {
		char shin ='ù';
		JOptionPane.showMessageDialog(null, "char: "+shin);
		char armenian='\u090B';
		JOptionPane.showMessageDialog(null, armenian);
		armenian++;
		JOptionPane.showMessageDialog(null, armenian);


	}

}
