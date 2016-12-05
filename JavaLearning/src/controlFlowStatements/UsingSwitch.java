package controlFlowStatements;
import javax.swing.*;
/**
 * TODO Put here a description of what this class does.
 *
 * @author pun.
 *         Created Nov 5, 2016.
 */
public class UsingSwitch {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		String text,str;
		text=JOptionPane.showInputDialog("Enter integer from 0 to 10:");
		num=Integer.parseInt(text);
		switch(num){
		case 0:
			str="You entered the zerro value!";
			break;
		case 1:
			str="You entered the unit value!";
			break;
		case 2:
		case 3:
		case 5:
		case 7:
			str="You enterd the prime number!";
			break;
		case 4:
		case 6:
		case 8:
		case 10:
			str="You entered the odd number!";
			break;
			default:
				str="You enterd number 9 or\n out of range!";
		}
		JOptionPane.showMessageDialog(null,str);

	}

}
