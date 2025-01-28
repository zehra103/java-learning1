/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*another method for multidimensional*/
public class Main 
{
  public static void main(String[] args) 
  {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,8,9} };
    for (int[] row : myNumbers) 
    {
      for (int i : row) 
      System.out.println(i);
     }
  }
}
