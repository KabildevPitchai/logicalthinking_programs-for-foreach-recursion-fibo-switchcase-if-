package Methods;

public class Swapping_two_numbers {

	public static void main(String[] args) {
		Swapping_two_numbers st=new Swapping_two_numbers();
		st.two_num_swap();
		st.two_num_without_2nd_variable();
		st.three_num_without_3rd_variable();
		}

	private void three_num_without_3rd_variable() {
		int a=1,b=1000,c=3500;
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

	private void two_num_without_2nd_variable() {
		int no1=1;
		int no2=100;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1);
		System.out.println(no2);

	}

	private void two_num_swap() {
		int no1=20;
		int no2=10;
		int temp=0;
		temp=no1;
		no1=no2;
		no2=temp;
		System.out.println(no1);
		System.out.println(no2);
	}

}
