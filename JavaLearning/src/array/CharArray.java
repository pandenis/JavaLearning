package array;
import java.util.Random;

import javax.swing.*;
public class CharArray {

	public static void main(String[] args) {
		//Array size from 2 to 4 include:
		int size=2+(int)(Math.random()*3);
		//variable for number of elements in array row:
		int n;
		//initial later:
		char s='a';
		//Output text to display in window:
		String text="\"Jagged\" symbols array";
		//Array creating with number of rows:
		char symbs[][]=new char [size][];
		//inserting rows to array:
		for(int k=0;k<size;k++){
			//Random number from 1 to 8; 
			n=1+(int)(Math.random()*8);
			//Create rows with random :
			symbs[k]=new char[n];
		}
		//Entering letters in to the array:
		//ran from row to next row:
		for(int i=0;i<symbs.length;i++){
			text+="\n| ";
			//ran from column to next column according the column size:
			for(int j=0;j<symbs[i].length;j++){
				//Inserting symbol in to the element:
				symbs[i][j]=s;
				//Next symbol:
				s++;
				//Adding new record to the text:
				text+=symbs[i][j] + " | ";
			}
			JOptionPane.showMessageDialog(null, text);
		}

	}

}
