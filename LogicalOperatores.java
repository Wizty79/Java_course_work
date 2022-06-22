public class LogicalOperatores {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {           //shows the use of the or || operator
            System.out.println(" Congratulations, you got the scholarship!");                       //if just one condition is tgrue, it outputs 
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }

        int credits = 56;
        double GPA = 3.2;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned you diploma!");
        } else {
            System.out.println("Sorry, you need at leats 40 credits and a minimum GPA of 2.0");    //however with the and && operator, both have to be true to trigger the output 
        }
        
    }
}
