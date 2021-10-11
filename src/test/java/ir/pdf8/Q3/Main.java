package ir.pdf8.Q3;

/**
 * 3)Third question form  :
 *(Rethrowing Exceptions) Write a program that illustrates rethrowing an
 * exception. Definemethods someMethod and someMethod2. Method
 * someMethod2 should initially throw anexception.
 * Method someMethod should call someMethod2, catch the exception and
 * rethrow it. CallsomeMethod from method main, and catch the rethrown
 * exception. Print the stack trace of this excepti
 * ------------------------------------
 * --------------------------------------------------------
 *
 * Writer   : Erfan adine
 * ----------------
 * since  :  2021
 */

public class Main {
    /**
     * this is main method for this app
     *
     */
    public static void main(String[] args){

        try{
            System.out.println(someMetode(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static int someMetode(int l ,int m) throws Exception {
       return someMetode2(l,m);


    }

    public static int someMetode2(int a, int b) throws Exception {
        if (b==0)
            throw new Exception("this divide is not true beacuse b is '0' ------------> in some metode2");
        int c=a/b;
        return c;
    }
}
