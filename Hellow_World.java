package Java_code;

public class Hellow_World {

	public static void main(String[] args) {
	
		reusable_code h = new reusable_code();
	
	 int result = h.calculation(2,3);
	 System.out.println("The result is "+result);
		
	}
	
}

class reusable_code{
	int calculation(int x, int y) {
		return x*y;
	}
}