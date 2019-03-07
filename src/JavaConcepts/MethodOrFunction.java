package JavaConcepts;

public class MethodOrFunction {

	public static void main(String[] args) {

		MethodOrFunction obj = new MethodOrFunction();
		//1
		obj.test1();
		//2
		int Test2Output = obj.Test2();
		int z=Test2Output+30;
		System.out.println("The Test2 Output is: "+Test2Output);
		System.out.println("The Test2 Output is: "+z);
		//3
		String Test3Output = obj.Test3();
		System.out.println("The Test 3 output is : "+Test3Output);
		//4
		int Test4Output =obj.Test4(100, 200);
		System.out.println("The Test 4 output is: "+Test4Output);
		test11();
	}
	//this method is void in it, meaning we are not returning everything
	public void test1(){
		
		int l = 10;
		int m = 30;
		
		int k = (l+m);
		System.out.println(k);
	}
	//this method is STATIC, meaning we CAN use it directly in the main method without using the object.
	public static void test11(){
		
		int o = 70;
		int p = 90;
		
		int q = o+p;
		System.out.println(q);
	}
	//This is a int method returning c
	public int Test2(){
	int a = 10;
	int b= 20;
	int c = a+b;
	return c;
	}
	
	//This is a String method returning s
	public String Test3(){
		String s= "Selenium Training";
		return s;
	}
	
	//This is a int method with two variables returning x 
	public int Test4 (int A, int B){
	 int x = A+B;
	 return x;
	}
	}


