import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.junit.JUnit4TestClass;
import org.testng.junit.JUnitTestClass;

public class ISBNTest {


       @Test
       public void test(){

              String word ="valid code";
              String word1="invalid code";


              if (word.contains("valid code")||word1.contains("Invalid code")){

                     System.out.println("These words are part of the sum condition in the main class ");



              }


              else {

                     System.out.println("These words are not included in the main text");
              }






       }

}
