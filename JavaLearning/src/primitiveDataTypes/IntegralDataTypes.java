package primitiveDataTypes;
public class IntegralDataTypes {
//	http://pr0java.blogspot.co.il/2015/04/java-byte-short-int-long.html	
	public static void main(String[] args){
		/*Error: value out of range:
		/long ilong = 2147483648;*/
		long ilong = 2147483647;
		System.out.println("ilong="+ilong);
		byte a, b;
		a=5;
		b=3;
		System.out.println("a="+a+"b="+b);
	}

}
