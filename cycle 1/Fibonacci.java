import java.util.*;
class Fibonacci
{
    public static void main(String args [])
    
        {
            int t1=0,t2=1,t,i;
            Scanner l=new Scanner(System.in);
            System.out.println("Enter the no of terms of the required Fibonacci Series :");
            int n=l.nextInt();
            System.out.println("Fibonacci Series is ");
            System.out.println(t1);
            System.out.println(t2);
            for(i=0;i<=n;i++)
            {
                t=t1+t2;
                System.out.println(nt);
                t1=t2;
                t2=t;
              } 
    }
}
     
