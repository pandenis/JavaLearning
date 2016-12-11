
package basic;

public class BooleanTypes {
	public static void main(String[] args){
		boolean a=true;
		boolean b=false;
		System.out.println("a="+a+"   b="+b);
		System.out.println("a&&b = "+(a&&b)); //Counted by first operand. If "a"=false all operation = false
		System.out.println("a||b = "+(a||b)); //Counted by first operand.
		System.out.println("!a = b "+(!a==b));
		System.out.println("a&b = "+ (a&b));
		System.out.println("a|b = "+(a|b));
	}

}
