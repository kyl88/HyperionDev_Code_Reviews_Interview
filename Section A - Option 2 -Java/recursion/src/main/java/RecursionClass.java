

    public class RecursionClass {


    //Method take string parameter and check string is empty or not
    // Create a function (reverseString) to reverse a string.
    public static String reverse_string(String s)
    {

        StringBuilder sb = new StringBuilder();

        int i= s.length()-1;

        while (i>=0){

            if (s.charAt(i)!=' '){

                int end =i;

                while (i>=0 && s.charAt(i)!=' '){

                    i--;

                }

                if (sb.length()>0){

                    sb.append("");

                }

                sb.append(s.substring(i+1,end+1));



            }

            i--;

        }

        return sb.toString();


   }

    public int fibonacciRecursive(int n) {

        if (n<=1){

            return n;


        }
        // tail recursion
        // using tail recursion to calculate Fibonacci number of a given number.

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);



    }

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();

        System.out.println("Recursion Version");

        System.out.println(fib);




    }



    private  static class Fibonacci {


    }
}
