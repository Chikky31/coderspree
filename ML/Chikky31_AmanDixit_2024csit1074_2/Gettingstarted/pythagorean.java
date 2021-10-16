import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int a,b,c;
    a=sc.nextInt();
     b=sc.nextInt();
      c=sc.nextInt();
      if(a*a==(b*b+c*c))
      {
          System.out.println("true");
      }
      else if(b*b==(a*a+c*c))
      {
          System.out.println("true");
      }
      else if(c*c==(b*b+a*a))
      {
          System.out.println("true");
      }
      else
      {
          System.out.println("false");
      }
   }
  }
