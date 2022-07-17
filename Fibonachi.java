package No_Return_No_Arguments;
import java.util.*;
public class Fibonachi {       // Q4.Wap find the fabnoscii .
    Scanner sc;
    int n;
    int a=0;
    int b=1;

    public void input(){


        System.out.println("Enter the range");
        sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("fibonacchi series");
        System.out.print(a+" "+b+" ");

    }
    public void Fibonachi(){
        for(int i=2; i<n; i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
    public static void main(String[] args) {
        Fibonachi obj=new Fibonachi();
        obj.input();
        obj.Fibonachi();
    }

}
/*
    Output  :
    Enter the range
        10
        fibonacchi series
        0 1 1 2 3 5 8 13 21 34

 */