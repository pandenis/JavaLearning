
package basic;
//http://pr0java.blogspot.co.il/2015/04/java-boolean.html
public class BooleanTypes {
	public static void main(String[] args){
		boolean a=true;
		boolean b=false;
		System.out.println("a="+a+"   b="+b);
		System.out.println("a&&b = "+(a&&b)); //Counted by first operand. If "a"=false all operation = false
		System.out.println("a||b = "+(a||b)); //Counted by first operand.
		System.out.println("!a = b "+(!a==b));
		System.out.println("a&b = "+ (a&b));
		System.out.println("a|b = "+(a|b));//
		
	}

}
