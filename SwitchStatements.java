public class SwitchStatements {
    public static void main(String[] args) {
        int month = 5;

        switch (month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;    //without the break statement it would run both May and every month that follows, it would just not stop
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Please enter valid month"); //no need for a break statement as it's the last line of code
        }
        
    }
}

/* most of the time you can and will use if else instead of switch. An if else statement can test any condition, 
an switch statement can only comparee one value against a list of values. However in the case above it would end 
up looking messy if done with if else */
