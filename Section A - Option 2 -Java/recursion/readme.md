--java

public class RecursionClass {

    
   // Method take string parameter and check string is empty or not
   // Create a function reverse_string to reverse a string.

    public static String reverse_string(String s)
    {
        // Create a string builder object to instantiate the class

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


---

## General understanding

### A recursive function is one that has the capability to call itself.

### tail recursion
 ### using tail recursion to calculate Fibonacci number of a given number.
        
        --java

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);

        ---

## function

--java

 String reversed = reverse_string(myStr); 

---


### Create a function (reverseString) to reverse a string.

## The problem of recursiveness
  
### Recursive - runs in exponential time, its inefficient for large values of f(50) or more

## Solution

### Considering implementating non-recursive alternatives such as iterative algorithm, for example look at the pattern below.

--java


     	for (int i = 1; i <= maxNumber; ++i){
	    System.out.print(previousNumber+" ");
	    
	    int sum = previousNumber + nextNumber;
	    previousNumber = nextNumber;
	    nextNumber = sum;
	    }
        // On each iteration, we are assigning second number
	    // to the first number and assigning the sum of last two
	    // numbers to the second number
        ---


## Alternative method: User Input
### easier way to design the Fibonacci sequence is using the Scanner class to input the data and use the user to write the number

--java

   public class FibonacciInput {

   public static void main (String[]args){

    int maxNumber = 0;

    int previousNumber =0;

    int nextNumber =1;


    System.out.println("How many numbers you want in Fibonacci");

    Scanner input = new Scanner(System.in);

    maxNumber = input.nextInt();

    System.out.println("Fibonacci Series of "+maxNumber+" numbers: ");

   for (int i=1; i<= maxNumber; ++i){

    System.out.println(previousNumber+ " ");

    int sum = previousNumber + nextNumber;

    previousNumber = nextNumber;

    nextNumber = sum;


  }




  }


  }

---