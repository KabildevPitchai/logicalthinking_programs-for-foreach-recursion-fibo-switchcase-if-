package Methods;

public class Find_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_power fpo=new Find_power();
		fpo.find_power();
	}

	private void find_power() {
		// TODO Auto-generated method stub
		int no=2;
		int box=0;
		int power=5;
		while(0<power) {
			box=box+power*no;
			power--;
		}
		System.out.println(box);
		
	}

	
	
}
