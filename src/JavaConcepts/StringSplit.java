package JavaConcepts;

public class StringSplit {

	public static void main(String[] args) {
		String Name = "UAE Dubai 829m 2010 1 details-1";
		
		String[] parts = Name.split(" ");
		System.out.println(parts[0]);
		System.out.println(parts[4]);
		
	}

}
