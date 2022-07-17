package No_Return_No_Arguments;
import java.util.*;

public class Prime {           // Q5.Wap intput a no and check it is prime no or not.
    Scanner sc;
    int no;

    public void input(){
        sc=new Scanner(System.in);
        System.out.println("Enter the no :");
        no=sc.nextInt();
    }
    public void prime(){
        int i;
        for(i=2; i<=no; i++)
        {
            if(no%i==0)
               break;
        }
        if(no==i)
            System.out.println("It is Prime number :");
        else
            System.out.println("It is not prime number :");

    }
    public static void main(String []args){
        Prime obj=new Prime();
        obj.input();
        obj.prime();
    }
}
/*
Output :
    Enter the no :
        13
        It is Prime number :

 */

