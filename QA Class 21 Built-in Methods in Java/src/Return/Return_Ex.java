package Return;

public class Return_Ex {
	
	public boolean method1() {
		String name="John";
		int age=30;
		char grad='A';
		double height=6.2;
		boolean flag=true;
		
		return flag;
	
		
	}

	public static void main(String[] args) {
		
		Return_Ex r= new Return_Ex();
	//	System.out.println(r.method1());
		boolean d=r.method1();
		System.out.println(d);
	

	}

}
