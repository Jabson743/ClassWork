import java.util.Scanner;
public class EvenOdd {
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       int evenSum = 0;
       int oddSum = 0;

       for (int counter = 0; counter <= 10; counter++) {
             
           System.out.print("Enter a number: ");
           int number = input.nextInt();

           if (number % 2 == 0) {
              evenSum += number;
           }
           else {
              oddSum += number;
          }
         
          }
          System.out.print("The sum of the even numbers and odd numbers is: " + evenSum + " "  + oddSum);
   }
}