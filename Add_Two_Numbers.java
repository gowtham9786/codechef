import java.util.*;
import java.io.*;
import java.lang.*;

class AddTwoNumbers
{
  public static void main(String[] args)
  {
    Scanner tests = new Scanner(System.in);
    int x = tests.nextInt();
    ArrayList<Integer> pairs = new ArrayList<Integer>();
    for(int y = 0; y < x; y++)
    {
      int z1 = tests.nextInt();
      int z2 = tests.nextInt();
      int sum = z1+z2;
      System.out.println(sum);
    }
  }
