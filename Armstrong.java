package No_Return_No_Arguments;
import java.util.*;

public class Armstrong {       // Q3.Wap input a no and check it is armstrong no or not.
    Scanner sc;
    int n,rem,rev=0;


    public void input(){
        sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        n=sc.nextInt();
    }
    public void Armstrong(){
        for(int i=n; i!=0; i/=10)
        {
            rem=i%10;
            rev=rev+(rem*rem*rem);
        }
        if(rev==n)
            System.out.println("It is Armstrong number :");
        else
            System.out.println("It is not Armstrong number :");
    }
    public static void main(String []args){
        Armstrong obj=new Armstrong();
        obj.input();
        obj.Armstrong();
    }
}
/*
Output :
        Enter your number :
        153
        It is Armstrong number :

 */
