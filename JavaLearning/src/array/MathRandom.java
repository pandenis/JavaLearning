package array;

import javax.swing.JOptionPane;

public class MathRandom {

	public static void main(String[] args) {
		int nums;
		String text="Math.random generated numbers: \n";
		for(int i=0; i<20; i++) {
			nums=2+(int)(Math.random()*3);
			text=text+nums+" \n";
		}
		
		JOptionPane.showMessageDialog(null, text);

	}

}
