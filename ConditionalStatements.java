package myfirst;
import java.util.Scanner;
public class ConditionalStatements {

	public static void main(String[] args) {

		/*
		  
		 
		int n = -5;
		if(n>=0) {
			System.out.println("Posittive");
		}
		else
		{
			System.out.println("Negative");
		}
		
		*/
		
		
		/*
		int a = 5, b = 15, c = 4;
		
		if(a>b && a > c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		*/
		
		/*
		
//		-- find a number is even or odd !!
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number : ");
		num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("Number is even !!");
		}
		else {
			System.out.println("NUmber is odd");
		}
		
		*/
		
		
		/*
//		-- find person is young or not young 
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		age = sc.nextInt();
		if(age>=14 && age<=55) {
			System.out.println("Person is young !!");
		}
		else {
			System.out.println("Person is not young!!");
		}
		
		*/
		
		
		/*
		 
		 
//		-- find grades for given marks !!
		
		
		int m1, m2, m3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of first subject out of 100 : ");
		m1 = sc.nextInt();
		System.out.println("Enter marks of second subject out of 100 : ");
		m2 = sc.nextInt();
		System.out.println("Enter marks of third subject out of 100 : ");
		m3 = sc.nextInt();
		
		int total = m1 + m2 + m3;
		int avg = total /3;
		if (avg >= 70) {
			System.out.println("Grade is A!!");
		}
		else if(avg>=60 && avg < 70 ) {
			System.out.println("Grade is B!!");
		}
		else if(avg>=50 && avg<60) {
			System.out.println("Grade is C!!");
		}
		else if(avg>=40 && avg<50) {
			System.out.println("Grade is D!!");
		}
		
		else {
			System.out.println("Grade is E!!");
		}
		
		*/
		
		
//		find radix of a number given in a string !!
		
		/*
		String number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		number = sc.nextLine();
		if(number.matches("[01]+")) {
			System.out.println("Given Number is Binary and Radix is 2 !!");
		}
		else if(number.matches("[0-7]+")) {
			System.out.println("Given Number is Octal and Radix is 8!!");
		}
		else if(number.matches("[0-9]+")) {
			System.out.println("Given Number is Decimal and Radix is 10 !!");
		}
		else if(number.matches("[0-9A-F]+")) {
			System.out.println("Given Number is HexaDecimal and Radix is 16 !!");
		}
		else {
			System.out.println("Not a Number!!");
		}
		*/
		
		
//		--find a given year is a leap year !!
		
		/*
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		year = sc.nextInt();
		if(year%4==0) {
			
			if(year%100==0) 
				{
					if(year%400==0) 
						{
							System.out.println("its a leap year!!");			
						}
					else
						{
							System.out.println("Not a leap year !!");
						}
							
				}
			else
				{
					System.out.println("its a leap year!!");
				}
		}
		else {
			System.out.println("Not a leap year !!");
		}
		
		*/
		
//		-- Display name of the day based on number !!
		/*
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number : ");
		number = sc.nextInt();
		if (number ==1)
		{
			System.out.println("day = Monday ");
		}
		else if(number==2)
		{
				System.out.println("day = Tuesday ");
		}
		else if(number==3)
		{
				System.out.println("day = Wednesday ");
		}
		else if(number==4)
		{
				System.out.println("day = Thursday ");
		}
		else if(number==5)
		{
				System.out.println("day = Friday ");
		}
		else if(number==6)
		{
				System.out.println("day = Saturday ");
		}
		else if(number==7)
		{
				System.out.println("day = Sunday ");
		}
		else {
			System.out.println("Please enter correct number !!");
		}
		
		
		*/
		
//		-- find type of website and the protocol used
		/*
		String url;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the site : ");
//		url = sc.nextLine();
		
		url = "http://www.google.com";
		String protocol = url.substring(0, url.indexOf(":"));
		if(protocol.equals("http")) {
			System.out.println("Protocol : Hypertext Transfer Protocol");
		}
		else if(protocol.equals("ftp")) {
			System.out.println("Protocol : File Transfer Protocol");
		}
				
		String type = url.substring(url.lastIndexOf(".")+1, url.length());
		if(type.equals("com")) {
			System.out.println("Type : Commercial");
		}
		else if(type.equals("org")) {
			System.out.println("Type : Organisation");
		}
		else if(type.equals("net")) {
			System.out.println("Type : Network");
		}
		
		*/
		
		
		
//		*********************************************************************************
//		**********************************************************************************
		
		
		
		
		
//		*********************        switch case           ******************************
		
		/*
//		 * put a breakpoint and check every step , it checks every condition till satisfaction or end 
		  		 
		int n =5 ;
		if(n==1) {
			System.out.println("ONE");
		}
		else if(n==2) {
			System.out.println("TWO");
		}
		else if(n==3) {
			System.out.println("THREE");
		}
		else if(n==4) {
			System.out.println("FOUR");
		}
		else if(n==5) {
			System.out.println("FIVE");
		}
		else {
			 System.out.println("Not Valid!!");
		}
		
		*/
		
		
		/*
		 
//		 * put a breakpoint and check every step , it checks every condition till satisfaction or end 
		  
		int num = 5;
		switch(num) {
		case 1 : System.out.println("ONE");
					break;
		case 2 : System.out.println("TWO");
					break;
		case 3 : System.out.println("THREE");
					break;
		case 4 : System.out.println("FOUR");
					break;
		case 5 : System.out.println("FIVE");
					break;
		default : System.out.println("Invalid Number!!");
		}
		
		*/
		
		
//		-- display name of a day based on a number  !!
		/*
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("day 1 = Monday");
					break;
		case 2 : System.out.println("day 2 = Tuesday");
					break;
		case 3 : System.out.println("day 3 = Wednesday");
					break;
		case 4 : System.out.println("day 4 = Thursday");
					break;
		case 5 : System.out.println("day 5 = Friday");
					break;
		case 6 : System.out.println("day 6 = Saturday");
					break;
		case 7 : System.out.println("day 7 = Sunday");
					break;
		default : System.out.println("Invalid Number!!");
					break;
		}
	
		*/
	
//		-- display name of a month based on a number  !!
		/*
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("Month 1 = January");
					break;
		case 2 : System.out.println("Month 2 = February");
					break;
		case 3 : System.out.println("Month 3 = March");
					break;
		case 4 : System.out.println("Month 4 = April");
					break;
		case 5 : System.out.println("Month 5 = May");
					break;
		case 6 : System.out.println("Month 6 = June");
					break;
		case 7 : System.out.println("Month 7 = July");
					break;
		case 8 : System.out.println("Month 7 = July");
					break;
		case 9 : System.out.println("Month 7 = July");
					break;
		case 10 : System.out.println("Month 7 = July");
					break;
		case 11 : System.out.println("Month 7 = July");
					break;
		case 12 : System.out.println("Month 7 = July");
					break;
		default : System.out.println("Invalid Number!!");
					break;
		}
		
		*/
		
//		-- Display type of website  !!
		/*
		String url = "https://www.google.com";
		String domain = url.substring(url.lastIndexOf(".")+1);
		switch(domain) {
		case "net" : System.out.println("Network type!!");
						break;
		case "org" : System.out.println("Organisation type!!");
						break;
		case "com" : System.out.println("Commercial type!!");
						break;
		}
		*/
		
		
		
//		-- make a menu driven program for arithmatic operations !!
		/*
		
		System.out.println("Menu \n ADD \n SUB \n DIV \n MUL"  );
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter option : ");
		String optn = sc.nextLine();
		optn = optn.toUpperCase();
		switch(optn) {
		case "ADD" : System.out.println("Addition : "+ (num1+num2));
						break;
		case "SUB" : System.out.println("Subtraction : "+ (num1-num2));
						break;
		case "MUL" : System.out.println("Multiplication : "+ (num1*num2));
						break;
		case "DIV" : System.out.println("Division : "+ (num1/num2));
						break;
		}
		*/
		
		
		
		
	}
}
