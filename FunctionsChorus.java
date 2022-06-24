public class FunctionsChorus {
    public static void main(String[] args) { //calling on the function
        singChorus();
        singChorus();
        singChorus();
    }


    public static void singChorus() {   //function that "sings"/prints the chorus
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on the good times");
        System.out.println("Blame it on the boogie\n");
    }   
}


/*with functions theres 5 importaint things to remember. 
 * 1.level of access, most likely it will be public so we can access it anywhere
 * 2. Return value, in this case void meaning it will return nothing
 * 3. Function name, one that reflects the function name
 * 4. Parameters, the parameters that can be received and used in the code
 * 5. 3 Code
  */