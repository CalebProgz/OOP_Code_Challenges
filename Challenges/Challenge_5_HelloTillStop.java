//Code Challenge 5: HelloTillStop
import java.util.*;


class Challenge_5_HelloTillStop{
    Scanner sc = new Scanner(System.in);

    void showHello(){
        String choice;
        System.out.println("For hello type h, anything else to stop");
        choice = sc.next();

        while("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();
        }
    
    }
    
public static void main(String[] args) {
    Challenge_5_HelloTillStop obj = new Challenge_5_HelloTillStop();
    obj.showHello();
    // System.out.println("Stopped");
}
}
