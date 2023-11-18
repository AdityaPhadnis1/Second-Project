package secondproject;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 //Note: Arithmatical operators are : +, -, *, /, %.
		
		
		int x;
		x=20;
		int y;
		y=10;
//		
//		System.out.println("Sum of the var x&Y = " + (x+y) );
		
		//We can add different data types values
//		int x=10;
//	    double y =10.2d;
//	    System.out.println("Sum of the var x&y = " + (x+y));
		
		// Arithmatical operations on two integers
		System.out.println("-----------------------Arithmatical Operaters------------------------------------------");
		
		System.out.println("Sum of x & y is: " + (x+y));
		System.out.println("Sum of x & y is: " + (x-y));
		System.out.println("Sum of x & y is: " + (x*y));
		System.out.println("Sum of x & y is: " + (x/y));
		System.out.println("Sum of x & y is: " + (x%y));
		
		//Relational operators are : ==, >=, <=, >, <, !=
		System.out.println("-----------------------Relational Operaters------------------------------------------");
		
		System.out.println("Sum of x & y is: " + (x==y));
		System.out.println("Sum of x & y is: " + (x>y));
		System.out.println("Sum of x & y is: " + (x<y));
		System.out.println("Sum of x & y is: " + (x<=y));
		System.out.println("Sum of x & y is: " + (x>=y));
		System.out.println("Sum of x & y is: " + (x!=y));
		
		
		//Logical Operators
		//Works between two boolean
		System.out.println("-----------------------Logical Operaters------------------------------------------");
		
		boolean a= true;
		boolean b = false;
		
		System.out.println(a && b); //false
		System.out.println(a || b); //true
		System.out.println(!a);     //false
		System.out.println(!b);     //true
		
		System.out.println("-----------------------Increment Operater------------------------------------------");
		
		x=10;
		x++; //x+1;
		System.out.println(x);
		
		System.out.println("-----------------------Decrement Operaters------------------------------------------");
		
		y=20;
		y++; //y+1
		System.out.println(y);
		
		//Assignment operator =
				

	}

}
