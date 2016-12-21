package primitiveDataTypes;

public class TypeConversion01 {

	public static void main(String[] args) {
		byte b=127;
		System.out.println("b="+b);
		short s=b;
		System.out.println("s="+s);
		int i=s;
		System.out.println("i="+i);
		long l=i;
		System.out.println("l="+l);
		float f=l;
		System.out.println("f="+f);
		double d=f;
		System.out.println("d="+d);
		
		char c=0x401;
		System.out.println("c="+c);
		i=c;
		l=c;
		f=c;
		d=c;
		System.out.println("c="+c+"	i="+i+"	l="+l+"	f="+f+"	d="+d);
	}

}
