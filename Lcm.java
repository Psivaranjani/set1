# set1
import java.util.*;
import java.io.*;
public class Lcm
{
  public static void main(String args[])
  {    
    int a,b,x,y,l,t;  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first Number : ");
    x = scan.nextInt();
    System.out.println("Enter second Number : ");
    y = scan.nextInt();
    a = x;
    b = y;
    while(b != 0)
    {
      t = b;
      b = a%b;
      a = t;
    } 
    l = (x*y)/a; 
    System.out.print("\nLCM = " +l);
  }}
