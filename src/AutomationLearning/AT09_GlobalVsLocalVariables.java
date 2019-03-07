package AutomationLearning;

public class AT09_GlobalVsLocalVariables {
	
	int a =50;
	int b =60;

	public static void main(String[] args) {
		
		
		int c = 10;
		int d = 20;
		
		System.out.println("Sum of Main Method variables is: "+ (c+d));
		AT09_GlobalVsLocalVariables Subin = new AT09_GlobalVsLocalVariables() ;
		
		
		System.out.println("Sum of global Variables is: "+ (Subin.a+Subin.b));
		
		//using submethod in main
		
		Subin.SubMethod();

	}
	
	public void SubMethod()
	{
		int e = 30;
		int f = 40;
		
		System.out.println("Sum of Sub Variables: "+(e+f));
	}

}
