import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welsome to the JAva Dealership");
        System.out.println(" .Select option 'a' to buy a car");
        System.out.println(" .Select option 'b' to sell a car");
        String option = scan.nextLine(); 
        switch (option) {
            case "a": System.out.println("You chose option " + option); break;
            case "b": System.out.println("You chose option " + option); break;
            default: System.out.println("invalid option");
        }
        scan.close(); //we need to close the scanner to avoide a memory leak
    }
}