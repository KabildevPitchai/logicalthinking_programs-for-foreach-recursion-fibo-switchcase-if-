package Methods;

public class Find_first_5_prime_numbers {

	public static void main(String[] args) {
		Find_first_5_prime_numbers fpn=new Find_first_5_prime_numbers();
		fpn.find_prime(13);
	}

	private void find_prime(int no) {
		int div=2;
		int count=0;
		int Prime_count=0;
		while(div<no/2) {
			if(no%div==0) {
				System.out.println("NOT PRIME");
				count++;
				break;
			}
			div++;
			Prime_count++;
		}
		if(count==0) {
			System.out.println(no+" "+"PRIME");
			
		}
		if(Prime_count<=5) {
			no++;
			find_prime(no);
		}
		
	}

	public void find_power() {
		// TODO Auto-generated method stub
		
	}

}
