package controlFlowStatements;


/**
 * TODO Put here a description of what this class does.
 *
 * @author pun.
 *         Created Nov 5, 2016.
 */
 import javax.swing.*;
 
public class UsingWhile {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int count, i=1, j=1, s1=0, s2=0;
		
		//read borders of sum
		count=Integer.parseInt(JOptionPane.showInputDialog("Enter borders of sum"));
		// texts variables
		String text ="Sum of natural numbers from 1 to "+count+".\n";
		String str1 = "Operator while: ";
		String str2 = "Operator do-while: ";
		//Using while
		while(i<=count) {
			s1+=i;
			i++;
		}
		//Using do-while
		do {
			s2+=j;
			j++;
		} while (j<=count);
		
		//Test Message
		str1+=s1+"\n";
		str2+=s2;
		
		JOptionPane.showMessageDialog(null, text+str1+str2);
		
		}

	}


