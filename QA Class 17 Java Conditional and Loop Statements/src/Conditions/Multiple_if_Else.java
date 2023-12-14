package Conditions;

public class Multiple_if_Else {

	public static void main(String[] args) {
	int a=50;
	int b=20;
	int c=55;
	//greatest of three numbers
	
	if(a>b)// true
	{
		if(a>c)//false
			System.out.println(a+" is greater ");
		else
			System.out.println(c+" is greater");
	}
	else if(b>c)
		System.out.println(b+" is greater");
	else
		System.out.println(c+" is greater");
	
	}

}
