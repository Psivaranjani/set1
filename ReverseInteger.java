# set1
import java.util.*;
import java.io.*;
public class ReverseInteger
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in); 
    int num=sc.nextInt();
    int reversenum =0;
    while( num != 0 )
    {
      reversenum = reversenum * 10;
      reversenum = reversenum + num%10;
      num = num/10;
    }
    
    System.out.println("Reverse of given integer is: "+reversenum);
  }
}
