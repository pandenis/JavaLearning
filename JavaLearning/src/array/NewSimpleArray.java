package array;
import javax.swing.*;
public class NewSimpleArray {

	public static void main(String[] args) {
		//Array size:
		int r,c;
		//Output window text:
		String text="Two-dimensional array of rundom numbers:";
		//Inserting of array size:
		r=Integer.parseInt(JOptionPane.showInputDialog("Rows in array"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Columns in arrow"));
		//Array creation:
		int[][] nums = new int [r][c];
		for(int i=0;i<r;i++){
			text=text+"\n";
		//	text+="\n";
			for(int j=0;j<c;j++){
					nums[i][j]=(int)(10*Math.random());
					text+=nums[i][j]+"   ";
			}
		}
		JOptionPane.showMessageDialog(null, text);
	}
	

}
