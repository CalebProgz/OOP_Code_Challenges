//Code Challehnge 4: InputExample
import java.util.Scanner;

public class Challenge_4_ {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge(){
        String name;
        int age;
        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Hello " + name + " and your are " + age + " springs young.");
    }

    // public static void main(String[] args) {
    //     InputExample obj = new InputExample();
    //     obj.readName();
    // }

    public static void main(String[] args) {
        (new Challenge_4_()).readNameAndAge();
    }
}
