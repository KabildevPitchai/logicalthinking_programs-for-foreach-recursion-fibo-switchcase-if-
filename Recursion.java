package Recursion;

public class Recursion {

	public static void main(String[] args) {
		Recursion r=new Recursion();
		int result=r.add_of_digits(10);
		int total=r.factorial_of_digits(6);
		
		System.out.println(result);//55 (6)
		System.out.println(total);//720 (10)
	}

	private int add_of_digits(int no) {
		if(no==1)
			return 1;
		else
			return no+add_of_digits(no-1);
	}

	
	private int factorial_of_digits(int no) {
		if(no==1)
			return 1;
		else
			return no*factorial_of_digits(no-1);
	}

}
