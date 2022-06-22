import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two very big integers (on the saje line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();  

        System.out.println("Enter two decimals (on the saje line)");
        double decimal1 = scan.nextLong();
        double decimal2 = scan.nextLong();

        System.out.println("Enter two text values (on the saje line)");
        String text1 = scan.next();
        String text2 = scan.next();
        
    }
}
