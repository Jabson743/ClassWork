import java.util.Scanner;
public class Factorial {
        public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        int factorial = 0;
        int number;

        for (int counter = 1; counter <= number; counter++) {

            System.out.print("Enter a number: ");
            number = input.nextInt();

            factorial = number(number - 1);
            System.out.print(factorial);
                         
       
     }
 }
}