# set1
import java.io.*;
import java.util.*;
   public class Repeat
{
  public static void main(String args[])
  {
    String s;
    int max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the word:");
    s=sc.next();
    String m=" ";      
    for(int i=0;i<s.length();i++)
    {
      int count=0;
      for(int j=i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j))
        count++;
      } 
      if(count>max){
        m=Character.toString(s.charAt(i));
        max=count;
      }
      else if(count==max)
      m=m+" "+Character.toString(s.charAt(i));
       
    }
    
    System.out.println("The max repeating letter is: "+m);
    
    
  }
}
