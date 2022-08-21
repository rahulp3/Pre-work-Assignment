import java.util.Scanner;
import java.util.Arrays;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
            Scanner k = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int value = k.nextInt(),reverse = 0 ,remainder,originalValue = value;
            
            while(value != 0) {
            	remainder = value % 10;
            	reverse = (reverse * 10) + remainder;
            	value /= 10;
            }
            
            if(originalValue == reverse) {
            	System.out.println("Palindrome number");
            }else {
            	System.out.println("Not palindrome number");
            }
            
            
      }

 

            //function to printPattern

       public void printPattern() {
    	   Scanner l = new Scanner(System.in);
    	   System.out.println("Enter a value : ");
    	   
    	   for(int i = l.nextInt(); i != 0; i--) {
    		   for(int j = i; j != 0; j--) {
    			   System.out.print("*");
    		   }
    		   System.out.println();
    	   }
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
     	   Scanner l = new Scanner(System.in);
     	   System.out.println("Enter a value : ");
     	   int value = l.nextInt();
     	   int count = 0;
     	   
     	   for(int i = value-1 ; i != 1 ; i--) {
     		   if((value % i) == 0) {
     			   count += 1;
     		   }
     	   }
     	   
     	   if(count == 0) {
     		   System.out.println("Prime number");
     	   }else {
     		  System.out.println("Not a Prime number");
     	   }
     	   
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
     	   Scanner l = new Scanner(System.in);
     	   System.out.println("Enter a value : ");
     	   int length = l.nextInt();
     	   int[] value = new int[length];
     	   value[0] = first;
     	   value[1] = second;
     	   
     	   for(int i = 2; i < length; i++) {
     		   value[i] = value[i-1] + value[i-2];
     	   }
     	   
     	  Arrays.stream(value).forEach(System.out::print);;

          }

 

//main method which contaa ins switch doesd do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}