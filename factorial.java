package No_Return_No_Arguments;
import java.util.*;
public class factorial {
    int fact=1;          // Q2.Wap input a no and find the factorial.
    Scanner sc;
    int n;
    public void input(){
        sc=new Scanner(System.in);
        System.out.println("Enter the number :");
         n=sc.nextInt();

    }
    public void factorial() {
        int i;
        for (i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("factorial of " +n+ " is = " +fact);
    }
        public static void main (String []args){
            factorial obj = new factorial();
            obj.input();
            obj.factorial();

        }


    }
    /*
    Output :
    Enter the number :
        5
        factorial of 5 is = 120

     */