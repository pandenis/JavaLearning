package array;
import javax.swing.*;
public class SimpleArray {
	public static void main(String[] args) {

		int i,size;
		//Text for display
		String text="Array from odd numbers: \n";
		//Entering size of array
		size=Integer.parseInt(JOptionPane.showInputDialog("Specify size of array:"));
		//Array creating
		int[] nums=new int[size];
		//Entering data in to the array and creating of output text
		for(i=0;i<size;i++){
			nums[i]=2*i+1;
			text+=nums[i]+" ";
		}
		//Display message window
		JOptionPane.showMessageDialog(null, text);
	}

}
