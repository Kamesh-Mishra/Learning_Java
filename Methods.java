package myfirst;

public class Methods {

//	static int max(int x, int y)
//	{
//		if(x>y)
//			return x;
//		else
//			return y;
//	}
	
//	int max(int x, int y)
//	{
//		if(x>y)
//			return x;
//		else
//			return y;
//	}
	
//	int max(int x, int y) {
//		return x>y?x:y;
//	}

//	static void inc(int x) {
//		x++;
//		System.out.println(x);
//	}
	
//	static void update(int A[]) {
//		A[0] = 25;
//	}
	
//	String userName(String email) {
//		int a = email.indexOf('@');
//		String name = email.substring(0, a);
//		return name;							// returns object
//	}
	
	
//	static void change(int X[], int index, int value) {
//		X[index]=value;
//	}
//	
//	static void change2(int x,int value)
//	{
//		x = value;
//	}
	
//	******************************************************
	
//	--find a number is prime
	

//	static boolean isPrime(int n) 
//	{
//		for(int i =2; i<n/2; i++) {
//			if(n%i==0) 
//				return false;
//		}
//		return true;
//	}
	
//	find GCD of 2 numbers
	
//	static int gcd(int a, int b) {
//		while(a!=b) {
//			if(a>b) a=a-b;
//			else b=b-a;
//		}
//		return a;
//	}
	
	
//	find max of an array
	
//	static int max(int[] A) {
//		int max = A[0];
//		for(int i =0; i<A.length; i++) {
//			if(A[i]>max) {
//				max = A[i];
//			}
//		}
//		return max;
//	}
	
	
	
//	*************************
	
//	method overloading
	
//	static int max(int x, int y) {
//		return x>y?x:y;
//	}
//	static float max(float x, float y) {
//		return x>y?x:y;
//	}
//	--------------------
	
//   here in below if we pass values 3,4 it will not call byte method , it will call float method because of type compatibility
//	static byte max(byte x, byte y) {
//		return x>y?x:y;
//	}
//	static float max(float x, float y) {
//		return x>y?x:y;
//	}
	
	
//	---------------------
	
//	method overloading with different number of parameters
	
//	static int max(int x, int y) {
//		return x>y?x:y;
//	}
//	
//
//	static int max(int x, int y, int z) {
//		if(x>y && x>z)
//			return x;
//		else if(y>x && y>z)
//			return y;
//		else
//			return z;
//	}

	
	
//	differnt data type of parameters
	
//	static int max(int x, int y) {
//		return x>y?x:y;
//	}
//	static float max(int x, float y) {
//		return x>y?x:y;
//	}
	
	
	
//	method overloading cannot be archived by only changing the return type, it is invalid and not allowed
	
//	static int max(int x, int y) {
//		return x>y?x:y;
//	}
//	static boolean max(int x, int y) {
//		if(x>y)
//			return true;
//		else
//			return false;
//	}
	
//	--overloaded method to calculate areas of different different shapes
	
//	static float area(int x, int y) {        // area of rectangle
//		return x*y;
//	}
//	static double area(int r) {              // area of circle
//		return Math.PI*r*r;
//	}

	
//	-- overloaded method to reverse a int or array
	
//	static int reverse(int x) {
//		int rev = 0;
//		while(x>0) {
//			int r = x%10;
//			rev = rev*10+r;
//			x = x/10;
//		}
//		return rev;
//	}
//	
//	static int[] reverse(int A[]) {
//		int B[] = new int[A.length];
//		for(int i = A.length-1, j= 0; i>=0; i--,j++) {
//			B[j] = A[i];
//		}
//			return B;
//	}
	
//	-- overloaded method to validate name and age
	
//	static boolean validate(String name) {
//		return name.matches("[a-zA-Z\\s]+");
//	}
//	static boolean validate(int age) {
//		return age>=3 && age<=15;
//	}
	
//	***********************************************
	
//	variable arguments
	
//	static void show(int ...A) {
//		for(int x:A) {
//			System.out.print(x+", ");
//		}
//		System.out.println();
//	}
	
	
//	static void showlist(String ...S) {
//		for(int i=0; i<S.length; i++) {
//			System.out.println(i+1+". "+S[i]);
//		}
//	}
//	
//	static void showlist(int start,String ...S) {
//		for(int i=0; i<S.length; i++) {
//			System.out.println(start+". "+S[i]);
//			start++;
//		}
//	}
	

//	--maximum of numbers using varargs
//	static int maxnum(int ...x) {
//		if (x.length==0) return Integer.MIN_VALUE;
//		int max = x[0];
//		for(int i=1; i<x.length; i++) {
//			if(x[i]>max) {
//				max = x[i];
//			}
//		}
//		return max;
//	}
	
	
//	--sum of all elements using varargs
//	static int sum(int ...x) {
//		int s = 0;
//		for(int i=0; i<x.length; i++)
//			s = s+x[i];
//		return s;
//	}
	
	

//	-- calculate discount using varargs
	
//	static double discount(double ...x) {
//		double discount=0,sum = 0;
//		for(int i=0; i<x.length; i++)
//			sum = sum+x[i];
//		if(sum<500) {
//			 discount = sum*5/100;
//		}
//		else if(sum>=500 && sum<=1000)
//			discount = sum*10/100;
//		else if(sum>1000)
//			discount = sum*20/100;
//		return discount;
//	}
	
//	-- recursion
	
//	static void fun(int n) {                   // see the result after putting breakpoint
//		if(n>0) {
//			fun(n-1);
//			System.out.println(n);
//		}
//	}
	
//	static void fun(int n) {                  // see the result after putting breakpoint
//		if(n>0) {
//			System.out.println(n);
//			fun(n-1);
//		}
//	}
	
	
	
	
	
	
	public static void main(String ...args) {
	
//	public static void main(String[] args) {	
//			int a = 10, b =15;
	
//			System.out.println(max(a,b));         // static method directly called 
			
//			Methods m = new Methods();
//			System.out.println(m.max(a, b));      // non static method is called by class object
			
//			inc(a);
//			System.out.println(a);     // value of a is not changed it remains same
		
//			int A[]= {2,3,4,5};
//			update(A);
//			System.out.println(A[0]);     // passsing object as parameter - here array reference is passed in parameter which is referencing the object array A
		
			
			
//			Methods m = new Methods();		//   returns object
//			String str = m.userName("vijay@gmail.com");
//			System.out.println(str);
	
	
//			int A[] = {2,4,6,8,10};
//			change(A,2,20);
//			for(int x:A) {
//				System.out.print(x+", ");           // here we passing object , so it is changing the original value 
//			}
//			System.out.println();
//			int x =10;               // value of x will remain same after method call also
//			change2(x,20);
//			System.out.println("Value of primitive : "+x);    // here copy of value is passed in method param as  primitive type, so it not changes in original value it changes only copy value
			
		
//			**************************************************************
		
// 			--find a number is prime	
			
//			System.out.println(isPrime(19));    
//			System.out.println(isPrime(14));
	
//		    -- find GCD of 2 numbers
		
//			System.out.println(gcd(15, 25));
//			System.out.println(gcd(35,56));
		    
		
//			-- find max element in an arrays
		
//			int[] A = {2,4,6,77,66,55,44,44,77};
//			System.out.println(max(A));
		
//		method overloading
		
//		System.out.println(max(11, 33));
//		System.out.println(max(11.33f, 33.11f));

//		-------------------
		
//		compatibility of parameters
		
//		System.out.println(max(11, 33));
//		System.out.println(max(11.33f, 33.11f));

//		method overloading with different number of parameters

//		System.out.println(max(34,23));
//		System.out.println(max(77,66,55));
		
		
//		differnt data type of parameters
		
//		System.out.println(max(4,7));
//		System.out.println(max(44, 65.5f));

		
//		--overloaded method to calculate areas of different different shapes
		
		
//		System.out.println(area(4,7));
//		System.out.println(area(8));
		
//		-- overloaded method to reverse a int or array
		
//		System.out.println(reverse(567890));
//		int[] A = {1,2,3,4,5,6};
//		System.out.print(reverse(A));
		

//		-- overloaded method to validate name and age
//		System.out.println(validate(12));
//		System.out.println(validate("Vijay S"));
		
//		********************************************************
		

//		variable arguments
		
//		show();
//		show(10,23,22);
//		show(4);
//		show(new int[] {3,4,2,66,7,8,90});     // passing anonymous array
//		int A[]  = {2,3,4,5,8};
//		show(A);
		
//		showlist("ajay","vijay","djay","kijay");
//		showlist(5,"ajay","vijay","djay","kijay");
		
		
//		--maximum of numbers using varargs
		
//		System.out.println(maxnum(3,4,5,6,7,8,9,0));
//		System.out.println(maxnum());
		
		
		

//		--sum of all elements using varargs
		
//		System.out.println(sum(10,20,30,40));
//		System.out.println(sum());
		
		
//		-- calculate discount using varargs
		
//		System.out.println(discount(20,44,33,22,11,105,200,500,6));
//		System.out.println(discount());
	
		
		
//		*******************************************************************
		
		
//		command line argument
		
//		run this on cmd and provide some command argument to check output
		
		
//		public static void main(String[] args) {
//			double d = 0;
//			for(String x:args) {
//				if(x.matches("[0-9]\\."))
//					d = d+java.lang.Double.parseDouble(x);
//			}
//			System.out.println("Sum is : "+d);
//		}

//	*********************************************************************
		
//	*****************************	recursion    ************************
		
//		fun(3);
 		
	}
}
















