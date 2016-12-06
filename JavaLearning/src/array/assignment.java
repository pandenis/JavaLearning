package array;

public class assignment {

	public static void main(String[] args) {
	/*	int[] first,second;
		first=new int[10];
		second=first;
	*/
		int[] first, second;
		first = new int[10];
		second = new int[5];
		System.out.println(second.length); 
		second=first;
		System.out.println(second.length); 
	}

}
