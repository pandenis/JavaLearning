package array;
import javax.swing.*;
public class NewSimpleArray {

	public static void main(String[] args) {
		//Array size:
		int n,m;
		//Output window text:
		String text="Two-dimensional array of rundom numbers:";
		//Inserting of array size:
		n=Integer.parseInt(JOptionPane.showInputDialog("Rows in array"));
		m=Integer.parseInt(JOptionPane.showInputDialog("Columns in arrow"));
		//Array creation:
		int[][] nums = new int [n][m];
		for(int i=0;i<n;i++){
			text=text+"*\n";
			text+="\n";
		}
		System.out.println(text);
	}
	

}
