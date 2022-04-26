
--java


import java.util.Scanner;


public class ISBNExample {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter digit code");

        String s = input.nextLine();

        int lens = s.length();

        if (lens!=10){

            System.out.println("output invalid");


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

---

## Basic logic

#### ISBN Number -  Unique book identifier which is printed on every book.

#### the ISBN is based upon 10 Digit Code. 

#### eg. ISBN : 1401601499

#### Sum: 1 *  1 + 2 * 4 + 3 * 0 + 4 * 1 + 5 * 6 + 6 * 0 + 7 * 1 + 8 * 4 + 9 * 9 + 10 * 9 = 253

#### 253/11 = 23 (output is the correct number)

---


--java

        Scanner input = new Scanner(System.in);

        System.out.println("Enter digit code");

        String s = input.nextLine();


---

#### this above code specifies creating a Scanner class to input the ISBN number.

--java


            if (lens!=10){

            System.out.println("output invalid");


            }
 ---

 
## the above code specifies if not a 10 digit number. Display "output valid"
