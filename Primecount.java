# set1
import java.util.*;
import java.io.*;
public class Primecount{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the starting number");
    int a=sc.nextInt();
    System.out.println("Enter the ending number");
    int b=sc.nextInt();
    System.out.println("The prime numbers are:");
    int flag=0,count=0;
    for(int i=a;i<b;i++)
    {
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        {
          flag=0;
          break;
        }
        else{
          flag=1;
        }
      }
      if(flag==1)
      count++;
     }
      System.out.println(count);
  }
}
