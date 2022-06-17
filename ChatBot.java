import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String name = scan.nextLine();

        System.out.println("Hi " + name + "Where are you from?")
        String place = scan.nextLine();

        System.out.println(" I hear it's beautiful in " + place + "I'm from a place called Viborg" + "\n How old are you?")
        double age = scan.nextDouble();

        System.out.println("So your're " + age + "I'm 400 years old!");
    }
}
