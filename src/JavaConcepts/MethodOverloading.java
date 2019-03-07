package JavaConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(100);
		obj.sum(10, 20);
		obj.sum(12.00);


	}

	public void sum(){
		System.out.println("This is the first method");
		
	}
	
	public void sum(int i){
		System.out.println("This is second method and the value of i is: "+i);
	}
	
	public void sum(int i, int j){
		System.out.println("This is the third method and the value of i and j is: "+ (i+j));
	}
	
	public void sum (double d){
		System.out.println("This is the fourth method for value of DOUBLE d as: "+d);
	}
}
