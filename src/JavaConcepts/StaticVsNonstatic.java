package JavaConcepts;

public class StaticVsNonstatic {

	int i= 100;
	static int s= 200;
	public static void main(String[] args) {
		Test1(); // direct calling the static method
		
		StaticVsNonstatic obj = new StaticVsNonstatic();
		obj.Test2();
		int NonstatVariable = obj.i;
		System.out.println("The nonstatic variable value is: "+NonstatVariable);
		System.out.println(s);

	}
	
	public static void Test1(){
		System.out.println("This is a static method");
	}

	public void Test2(){
		System.out.println("This is a nonstatic method");
	}
}
