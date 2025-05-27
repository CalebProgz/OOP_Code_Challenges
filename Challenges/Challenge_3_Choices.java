//Code Challenge 3: If_else statements
import java.util.Scanner;

public class Challenge_3_Choices {
    static Scanner sc = new Scanner(System.in);
    
    static int number_under_twenty(){
        int number;
        System.out.println("Enter a number between 1 and 20:");
        number = sc.nextInt();
        
        while (number < 1 ) {
            System.out.println("Invalid input! Please try again:");
            number = sc.nextInt();
        }
        System.out.println("You entered: " + number);
        return number;
        
    }

    void number_equal_twenty(int number){
        while(number != 20){
            if(number < 20){
                System.out.println("The number is less than 20.");
                
                // Increment the number by 2
                number += (number + 2>20) ? 1 : 2;
             } else if(number > 20){ 
                System.out.println("The number is greater than 20.");
                // Decrement the number by 1
                number -= 1;
            }
            System.out.println("The number is: " + number);
        }
        System.out.println("The Number is now equal to 20.");
    }

    public static void main(String[] args) {

        int number = number_under_twenty();
        (new Challenge_3_Choices()).number_equal_twenty(number);
    }
    
}
