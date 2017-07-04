# set1
import java.util.*;
import java.io.*;
public class Fact
{
  public static void main(String args[])
  {
    int fact=1;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=a;i++)
    {
      fact=fact*i;
    }
    System.out.println(fact);
  }
}
