/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main(String[] args) 
  {
   int ages[] = {16, 57, 41, 45, 32, 44, 74,55 };
   float avg, sum = 0;
   int length = ages.length;
   for (int age : ages) 
   {
   sum += age;
    }
    avg = sum / length;
     System.out.println("The average age is: " + avg);
  }
}
