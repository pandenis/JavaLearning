package primitiveDataTypes;

import javax.swing.JOptionPane;

public class BooleanAssignment {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=false;
		//&=
		x&=y;
		JOptionPane.showMessageDialog(null, "After x&=y x="+x);
		//|=
		x=true;
		y=false;
		x|=y;
		JOptionPane.showMessageDialog(null, "After x|=y x="+x);
		//^=
		x=true;
		y=false;
		x^=y;
		JOptionPane.showMessageDialog(null, "After x^=y x="+x);

	}

}
