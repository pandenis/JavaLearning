package primitiveDataTypes;

public class TypeConversation02Explicit {
// http://pr0java.blogspot.co.il/2015/04/java_23.html
	public static void main(String[] args) {
		double d = 123.321;
		byte b = (byte) d;
		System.out.println("d = "+d);
		System.out.println("b = "+b);
		System.out.println("---------------------------");
		float bFloat = 10_000_000_000f;
		System.out.println("bFloat = "+bFloat);
		int bInt =(int)bFloat;
		System.out.println("bInt = "+bInt);
		bFloat = -10_000_000_000f;
		bInt = (int) bFloat;
		System.out.println("bFloat = "+bFloat);
		System.out.println("bInt = "+bInt);
		System.out.println("---------------------------");
		
	}

}
