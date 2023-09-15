package Methods;

public class Prime_Numbers {

	public static void main(String[] args) {
		int no=15;
		int div=2;
		int count=0;
		while(div<=no/2) {
			if(no%div==0) {
			System.out.println(div);
			count++;
			break;
		}
		div++;
		}
	if(count==0) {
		System.out.println("PRIME");	
	}
	else {
		System.out.println("NOT PRIME");
		}
	}
}
