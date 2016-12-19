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
		System.out.println("a="+a+"  b="+b);
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		System.out.println("Same like a-(a/b)*b="+(a-(a/b)*b));
		System.out.println();
		System.out.println("a="+a+"  b="+b);
		System.out.println("Post-increment of a++. Now a="+a++);
		System.out.println("And now a="+a);
		System.out.println("Post-decrement of a--. Now a="+a--);
		System.out.println("And now a="+a);
		System.out.println("Prefix incriment ++a. Now a="+(++a));
		System.out.println("Prefix decriment --a. Now a="+(--a));
		a+=b; //Equal to a=a+b
		System.out.println("After a+=b	a="+a);
		a-=b; //Equal to a=a-b
		System.out.println("After a-=b	a="+a);


	}

}
