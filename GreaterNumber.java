// Write a program to enter three number from the keyboard and check & show which number is greater.

import java.util.Scanner;  

public class GreaterNumber {

	public static void main(String[] args) {
		
		int a, b, c;
		
		// input number from keyboard
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the first number:");  
        a = sc.nextInt();  
        System.out.println("Enter the second number:");  
        b = sc.nextInt();  
        System.out.println("Enter the third number:");  
        c = sc.nextInt(); 
        
        //compare and calculate greater no
        String exp2=(a>b & a>c)? "Greater no is"  +a: (b>c)? "Greater no is " +b : " Greater no is" +c;
        System.out.println(exp2);

	}

}
