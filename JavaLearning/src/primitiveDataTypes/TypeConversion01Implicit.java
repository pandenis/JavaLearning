package primitiveDataTypes;

public class TypeConversion01Implicit{

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
		System.out.println("\nConversation with loss of precission");
		i=0b11_1111_1111_1111_1111_1111_1111;
		f=i;
		System.out.println("i="+i);
		System.out.println("f="+f);
		
	}

}
