public class LogicalOperatores {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;

        if (chemistryGrade > 75 || englishGrade > 75) {           //shows the use of the or || operator
            System.out.println(" COngratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }
        
    }
}
