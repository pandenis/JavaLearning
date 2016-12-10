package controlFlowStatements;

import javax.swing.JOptionPane;

public class MathRandom {

	public static void main(String[] args) {
		int nums;
		String text="Math.random generated numbers: \n";
		for(int i=0; i<20; i++) {
			nums=(int)(2+(Math.random())*5);
			text=text+nums+" \n";
		}
		
		JOptionPane.showMessageDialog(null, text);

	}

}
