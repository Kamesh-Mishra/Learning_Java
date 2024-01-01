package myfirst;

import java.util.Scanner;

public class Loops {
	public static void main(String args[]) {
		
		
//		int i = 1;
		
		
//		while(i<100) {
//			System.out.println(i);
//			i = i*2;
//			
//		}
		
		
//		int i = 1;
//		do {
//			System.out.println(i);
//			i = i*2;
//		} while(i<100);
		
//		for(; i<=10; i++) 
//		{
//			System.out.println(i);
//		}
		
		
//		for(int j = 1; j<=10; j++) 
//		{
//			System.out.println(j);
//		}
		
//		for(System.out.println("Hello"); i<=10; i++) 
//		{
//			System.out.println(i);
//		}
		
//		for(; i<=10; ) 
//		{
//			System.out.println(i);
//			i++;
//		}
		
//		for(; i<=10; i++) 
//		{
//			System.out.println(i);
//		}
		
//		for(;;) 
//		{
//			System.out.println(i);              //   Infinite for loop
//		}
		
//		for(;true;) 
//		{
//			System.out.println(i);              //   Infinite for loop
//		}
		
		
//		for (int j = 0, k = 1; j<=10; j++,k=k*2) 
//		{
//			System.out.println(j + " " + k);
//		}
		
		
		
//		**************************************************************************************
		
		
//		*************************          student challenge          **************
		
		
//		-- Display multiplication table
		
//		
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number : ");
//		n = sc.nextInt();
//		for (int l = 1;l<=10;l++) {
//			System.out.printf("%1$d x %2$d = %3$d \n",n,l,n*l );
//		} 
//		
		
//		-- find sum of n numbers 
		
//		int n;
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		for(int i=0;i<=n;i++ ) {
//			sum += i;
//		}
//		System.out.println("SUM of n numbers : " + sum);
		
//		-- factorial of a number
		
//		int n;
//		int fact = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		for (int i=1; i<=n; i++) {
//			fact = fact * i;
//		}
//		System.out.format("factorial of number %d is : " +fact, n);
		
		
//		-- Display digits of a number 
		
//		int n;		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		int r ;
//		while(n>0) {
//			r = n%10;
//			n = n/10;
//			System.out.println(r);
//		}
		
		
		
//		-- count digits of a number
		
		
//		int n, count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		
//		while(n>0) {
//			n = n/10;
//			count++;
//			
//		}
//		System.out.println("Total number of digits : "+ count);
		
		
//		-- finding a number is armstrong or not
		
		
//		int n,m,r,sum=0,r3=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		m = n;
//		while(n>0) {
//			r = n%10;
//			n = n/10;
//			r3 = r*r*r;
//			sum = sum + r3;
//		}
//		if(sum==m) {
//			System.out.println("Number is armstrong!!");
//		}
//		else
//			System.out.println("Not a armstrong number !!");
		
//		--  reverse a number
		
//		int n,r,rev=0,m;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		m = n;
//		while(n>0) {
//			r = n%10;
//			rev = rev*10+r;
//			n = n/10;
//		}
//		System.out.printf("reverse of %d is : " + rev , m);
		

		
//		-- check a number is pelindrome
		
//		int n,r,rev=0,m;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		m = n;
//		while(n>0) {
//			r = n%10;
//			rev = rev*10+r;
//			n = n/10;
//		}
//		if(rev == m) {
//			System.out.println("number is pelindrome!!");
//		}
//		else
//			System.out.println("Not a pelindrome number!!");
		
		
//		-- display a number in words even with tailing 0
		
		
//		int n;
//		String str, word= ""; 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		n = sc.nextInt();
//		str = ""+n;
//		for(int i = 0; i<str.length(); i++) {
//			char charr = str.charAt(i);
//			switch(charr)
//			{
//			case '0' : word = word + "Zero ";
//						break;
//			case '1' : word = word + "One ";
//						break;
//			case '2' : word = word + "Two ";
//						break;
//			case '3' : word = word + "Three ";
//						break;
//			case '4' : word = word + "Four ";
//						break;
//			case '5' : word = word + "Five ";
//						break;
//			case '6' : word = word + "Six ";
//						break;
//			case '7' : word = word + "Seven ";
//						break;
//			case '8' : word = word + "Eight ";
//						break;
//			case '9' : word = word + "Nine ";
//						break;
//			}
//		}
//		System.out.println(word);
		
		
//		-- display AP series
		
		
//		int a,d,n,num;
//		String series = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter initial number : ");
//		a = sc.nextInt();
//		System.out.print("Enter Difference number : ");
//		d = sc.nextInt();
//		System.out.print("Enter Total number : ");
//		n = sc.nextInt();
//		
////		int term = a;    // logic 2
////		for(int i = 0; i<n; i++) {
////			System.out.print(term+",");
////			term  = term+d;
////		}
//		
//		for(int i = 0; i<n; i++) {     // logic 1
//			num = a+i*d;
//			series = num+", ";
//			System.out.print(series);
//		}
		
		
		
//		--display GP series
		
//		int a,r,n,num;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter initial number : ");
//		a = sc.nextInt();
//		System.out.print("Enter common ratio number : ");
//		r = sc.nextInt();
//		System.out.print("Enter Total number : ");
//		n = sc.nextInt();
//		num = a;
//		for (int i = 0; i<n; i++)
//		{
//			System.out.print(num+",");
//			num = num*r;
//		}
		
		
		
//		-- display fibonacci series
		
//		int a = 0, b=1, c,n;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number of terms : ");
//		n = sc.nextInt();
//		
//		System.out.print(a+","+b+",");
//		for(int i=0; i <n-2; i++) {
//			c= a+b;
//			System.out.print(c+",");
//			a=b;
//			b=c;
//		}
		
		
//		*******************************************************************************************
//		*******************************************************************************************
		
		
		
		
//		**********************************       Nested loops    ********************************
		
		
		
//		-- Display patterns
		
		
		
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		
		
//		1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 3 
//		4 4 4 4 4 
//		5 5 5 5 5
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println("");
//		}
		
		
		
		
//		2 3 4 5 6 
//		3 4 5 6 7 
//		4 5 6 7 8 
//		5 6 7 8 9 
//		6 7 8 9 10 
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//			{
//				System.out.print(i+j+" ");
//			}
//			System.out.println("");
//		}
		
		
//		01 02 03 04 05 
//		06 07 08 09 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25 
		
		
//		int count = 0;
//		for (int i =1; i <= 5; i++) {
//		for(int j = 1; j<=5; j++)
//			{
//				++count;
//				System.out.format("%02d ", count);
//			}
//		System.out.println("");
//		}
		
		
//		1
//		12
//		123
//		1234
//		12345
		
		
//		for (int i =1; i <= 5; i++) {
//		for(int j = 1; j<=i; j++)
//			{
//				System.out.print(j);
//			}
//		System.out.println("");
//		}
		
		
		
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		
		
//		int count=0;
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=i; j++)
//				{
//					count++;
//					System.out.print(count+" ");
//				}
//			System.out.println("");
//			}
		
		
//		*
//		**
//		***
//		****
//		*****
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=i; j++)
//				{
//					System.out.print("*");
//				}
//			System.out.println("");
//			}

		
		
		
//		_
//		__
//		___
//		____
//		_____
		

//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=i; j++)
//				{
//					System.out.print("_");
//				}
//			System.out.println("");
//			}
		
		
//		5 4 3 2 1 
//		5 4 3 2 1 
//		5 4 3 2 1 
//		5 4 3 2 1 
//		5 4 3 2 1
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 5; j>0; j--)
//				{
//					System.out.print(j+" ");
//				}
//			System.out.println("");
//			}
		

//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1 
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5-i+1; j++)
//				{
//					System.out.print(j+" ");
//				}
//			System.out.println("");
//			}
		
//		1 1 1 1 1 
//		2 2 2 2 
//		3 3 3 
//		4 4 
//		5
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5-i+1; j++)
//				{
//					System.out.print(i+" ");
//				}
//			System.out.println("");
//			}
		
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5-i+1; j++)
//				{
//					System.out.print("* ");
//				}
//			System.out.println("");
//			}
		
		
//		01 02 03 04 05 
//		06 07 08 09 
//		10 11 12 
//		13 14 
//		15 
		
//		int count = 0;
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5-i+1; j++)
//				{
//					count++;
//					System.out.format("%02d ",count);
//				}
//			System.out.println("");
//			}

		
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//				{
//					if(j>=i) {
//						System.out.print("* ");
//					}
//					else
//						System.out.print("  ");					
//				}
//			System.out.println("");
//			}
		
		
		
//		        * 
//		      * * 
//		    * * * 
//		  * * * * 
//		* * * * * 
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//				{
//					if(i+j>5) {
//						System.out.print("* ");
//					}
//					else
//						System.out.print("  ");					
//				}
//			System.out.println("");
//			}
		
		
//		
//		        * 
//		      * * * 
//		    * * * * * 
//		  * * * * * * * 
//		* * * * * * * * * 
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//				{
//					if(i+j>5) {
//						System.out.print("* ");
//					}
//					else
//						System.out.print("  ");					
//				}
//			
//			for(int j = 1; j<i; j++)
//				{
//					System.out.print("* ");
//				}
//			
//			
//			System.out.println("");
//		}

		
//		        * 
//		      * * * 
//		    * * * * * 
//		  * * * * * * * 
//		* * * * * * * * * 
//		  * * * * * * * 
//		    * * * * * 
//		      * * * 
//		        * 
		          
		
		
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//				{
//					if(i+j>5) {
//						System.out.print("* ");
//					}
//					else
//						System.out.print("  ");					
//				}
//			for(int j = 1; j<i; j++)
//				{
//					System.out.print("* ");
//				}
//			System.out.println("");
//		}
//		for (int i =1; i <= 5; i++) {
//			for(int j = 1; j<=5; j++)
//				{
//					if(j>=i+1) {
//						System.out.print("* ");
//					}
//					else
//						System.out.print("  ");					
//				}
//			for(int j = 1; j<5-i; j++)
//				{
//					System.out.print("* ");
//				}
//			System.out.println("");
//			}

		
		
		
		
	}
}
