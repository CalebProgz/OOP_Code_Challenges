//Code challenge 2: showInterest

public class Challenge_2_Variables {
    //Method to calculate interest
    void showInterest(){
        double amount;
        double interest;

        //Amount before Interest
        amount = 1200.00;
        System.out.println("Amount: " + amount);

        //Calculate interest of the 1st year
        interest = 3.0;
        amount = amount * (100+interest) / 100;
        System.out.println("Amount after a year: " + amount);

        //Calculate interest of the 2nd year
        amount = amount * (100+interest) / 100;
        System.out.println("Amount after two years: " + amount);

        
    }
    //Main method to run the program
    public static void main(String[] args){
        (new Challenge_2_Variables()).showInterest();
    }
}
