package controlFlowStatements;

import javax.swing.*;
/**
 * TODO Put here a description of what this class does.
 *
 * @author pun.
 *         Created Nov 5, 2016.
 */
public class UsingIf {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double x,y;
		//Window' title
		String title="Division";
		//Text of message (initial value)
		String text="Quotient of division: ";
		//Type of message
		int type;
		//Read of dividend:
		x=Double.parseDouble(JOptionPane.showInputDialog("Divident: "));
		//Read divisor:
		y=Double.parseDouble(JOptionPane.showInputDialog("Divisor: "));
		if(y!=0){
			type=JOptionPane.PLAIN_MESSAGE;
			text=text+x+"/"+y+"="+x/y;
		} else {
			type=JOptionPane.ERROR_MESSAGE;
			text=text+"division by zerro!";
		}
		JOptionPane.showMessageDialog(null,text,title,type);
		

	}

}
