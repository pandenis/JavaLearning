package controlFlowStatements;
import javax.swing.*;
/**
 * TODO Put here a description of what this class does.
 *
 * @author pun.
 *         Created Nov 5, 2016.
 */
public class UsingMoreIf {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String text,str;
		//Read input text (number)
		text=JOptionPane.showInputDialog("Enter an integer:");
		if (text==null) {System.exit(0);}
		int num=Integer.parseInt(text);
		if (num<0) {str="You entered a negative number!";}
		else if(num>100) {str="This is a very big number!";}
		else if(num>10){str="The numer is bigger then ten!";}
		else {str="The number is between ten and one hundred";}
		JOptionPane.showMessageDialog(null,str);
	}

}
