import java.util.Scanner;  


public class SwapNumber {

	public static void main(String[] args) {
		
		int a, b, temp;
        
		//input numbers from keyboard
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the first number:");  
        a = sc.nextInt();  
        System.out.println("Enter the second number:");  
        b = sc.nextInt();  
        
        //Before Swap
        System.out.println("Values Before Swap:");
        System.out.println("First number = " +a);
        System.out.println("Second Number = " +b);
        
        //Swap the numbers
        temp = a;
        a= b;
        b= temp;
        
        //After Swap
        System.out.println("Values After Swap:");
        System.out.println("First number = " +a);
        System.out.println("Second Number = " +b);

	}

}
