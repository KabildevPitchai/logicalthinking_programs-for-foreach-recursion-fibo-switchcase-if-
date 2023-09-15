package Methods;

public class Find_prime_numbers_2_to_20 {

	public static void main(String[] args) {
		Find_prime_numbers_2_to_20 pn=new Find_prime_numbers_2_to_20();
		
		/*
		 * pn.find_prime(5); int no=2; while(no<=10) { boolean result=pn.find_prime(no);
		 * if(result==true) break; no++; } }
		 * 
		 * private boolean find_prime(int no) { int Prime_count=0; int div=2; int
		 * count=0; while (div<=no/2) { if(no%div==0){ count++; break; } div++; }
		 * if(count==0) { System.out.println(no+"->"+"PRIME"); Prime_count++;
		 * if(Prime_count==5) return true; }return false;
		 */
		
		int no=2;
		while(no<=20) {
			pn.find_prime(no);
			no++;
		}
		
		
	}

	private void find_prime(int no) {
		int div=2;
		int count=0;
		while(div<=no/2) {
			if(no%div==0) {
//				System.out.println("not Prime");
				count++;
				break;
			}
			div++;
		}
		if(count==0) { 
			System.out.println(no+ "prime");
		}
	}
	
	
	int no1=100;
	int no2=60;
	int small=no1>no2?no1:no2;
	int div1=2;{
	while(div1<=small) {
		if(no1%div1==0 && no2%div1==0) {
			System.out.println(div1);
		}div1++;
	 }
  }
}
	
		


