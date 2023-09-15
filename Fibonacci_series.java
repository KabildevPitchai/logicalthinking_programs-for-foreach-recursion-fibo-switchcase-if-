package Methods;

public class Fibonacci_series {

	public static void main(String[] args) {
		Fibonacci_series fb=new Fibonacci_series();
		fb.Print_fibo(0,1);
	}

	private void Print_fibo(int first, int second) {
		int count=1;
		while(count<=10) {
			System.out.print(first+" ");
			int third=first+second;
			 first=first+second;
			 second=first-second;
			 count++;
			 System.out.println(third);
		}
//		System.out.println(count);
	}

}
