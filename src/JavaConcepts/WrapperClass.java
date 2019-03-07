package JavaConcepts;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
	//converting string into integer
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		//String to Double 
		
		String sd= "12.55";
		double d =Double.parseDouble(sd);
		System.out.println(d+10);
		
		//String to Boolean
		
		String sb = "True";
		boolean b = Boolean.parseBoolean(sb);
		System.out.println(b);
		
		//int to string
		int is= 10;
		String s = String.valueOf(is);
		System.out.println(s+20);

	}

}
