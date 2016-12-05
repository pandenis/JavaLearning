package array;
import javax.swing.*;
public class SimpleArray {

	public static void main(String[] args) {
		// Index variable and border of array:
		int i,size;
		
		//Text to display
		String text="Array of odd nymbers: \n";
		//Enter the border of array:
		size=Integer.parseInt(JOptionPane.showInputDialog("Insert border of array:"));
		//Creating of array:
		int[] nums = new int[size];
		//Enter data to array and creating of text to output:
		for(i=0;i<size;i++){
			nums[i]=i*2+1;
			text+=nums[i]+" ";
		}
		// Output message:
		JOptionPane.showMessageDialog(null, text);
	}

}
