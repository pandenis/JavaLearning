package controlFlowStatements;
import javax.swing.*;
public class UsingFor {
	public static void main(String[] args) {
		//the border of sum, index variable, the variable for the sum:
		int count, i, s=0;
		//Read the border of sum
		count=Integer.parseInt(JOptionPane.showInputDialog("Enter the border of sum"));
		//Text variable:
		String text="Sum of natural numbers from 1 to "+count+": ";
		//Counting of sum by operator for:
		for(i=1;i<=count;i++){
			s+=i;
		}
		//Output message window:
		JOptionPane.showMessageDialog(null,text+s);
	}

}
