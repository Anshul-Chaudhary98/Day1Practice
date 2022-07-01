package Day1Assignments;

public class MethodsBlocksStaticvariable {

	static int a = 25;
	static int b;
	static int c;
	
	static void newfunction(int c) {
		System.out.println("a: " + a) ;
		System.out.println("b: " + b) ;
		System.out.println("c: " + c) ;

	}
	static {
		b = a * 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newfunction(10);
	}

}
