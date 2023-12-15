package arrays;

public class Array_Ex {

	public static void main(String[] args) {
		//DataType[] arrayname= new DataType[size];
		
		String[] name= new String[15];
		name[2]="Steve";
		name[4]="John";
		name[0]="Mark";
		name[3]="Lee";
		name[2]="Kevin";
		name[4]="Andy";
		name[14]="Bruce";
		
		System.out.println(name[3]);
		System.out.println(name[2]);
		System.out.println(name[4]);
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[15]);
		

	}

}
