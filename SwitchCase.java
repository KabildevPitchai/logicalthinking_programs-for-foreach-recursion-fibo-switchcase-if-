package Methods;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=10;
		switch(no) {
		case 10:
			System.out.println("A");
			break;
		case 11:
			System.out.println("B");
			break;
		case 12:
			System.out.println("C");
			break;
		default :
			System.out.println("D");
			break;
		}

		
		/*
		 * float val=10.5f; switch(val) { case 10.5f: System.out.println("A"); break;
		 * case 11.5f: System.out.println("B"); break; case 12.5f:
		 * System.out.println("C"); break; default : System.out.println("D"); break; }
		 */
		
		int no1=1;
		while(no1<=5) {
			System.out.println(no1);
			no1++;// 1 2 3 4 5 
		}
		
		int no2=1;
		while(no2<=5) {
			System.out.println(no2);
			++no2;// 1 2 3 4 5
		}
		
		int no3=1;
		while(no3<=5) {
			System.out.println(no3);
		} //infinite loop of 1
		

}
	
}
//because SWITCH CASE ACCEPTS ONLY 3 DATATYPES

        //  1.int 2.enum 3.String




