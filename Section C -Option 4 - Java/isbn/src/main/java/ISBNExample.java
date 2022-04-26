import org.testng.annotations.Test;

import java.util.Scanner;


public class ISBNExample {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter digit code");

        String s = input.nextLine();

        int lens = s.length();

        if (lens!=10){

            System.out.println("Output Invalid");


        }

        else{


            char ch;

            int dig =0, sum=0, k=10;

            for (int i=0;i<lens;i++){

                ch=s.charAt(i);

                if (ch=='x'){

                    dig = ch-48;

                }

                else {

                    dig=ch-48;

                    sum=sum+dig * k;

                    k--;

                }

                System.out.println("output =" + sum);

                if (sum%11==0){

                    System.out.println("valid code");
                }

                else {

                    System.out.println("Invalid Code");
                }


            }

        }

    }
}
