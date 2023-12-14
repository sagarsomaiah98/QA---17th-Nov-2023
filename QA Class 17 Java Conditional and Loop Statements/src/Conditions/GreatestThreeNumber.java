package Conditions;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		
		int a=70;
		int b=90;
		int c=155;
		
		if(a>b & a>c)// false & false
			System.out.println(a+" is greater");
		else if(b>c)//false
			System.out.println(b+" is greater");
		else
			System.out.println(c+" is greater");
		

	}

}
