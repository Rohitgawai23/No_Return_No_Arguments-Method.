package No_Return_No_Arguments;
import java.util.*;
public class Reverse {
    Scanner sc;                   // Q6.Wap input 5 digit integer value and print its reverse.
    int i;
    int num,rem,rev=0;

    public void input(){
        sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();

    }
    public void Reverse(){
        for(i=num; i!=0; i/=10)
        {
            rem=i%10;
            rev=rev*10+rem;
        }
        System.out.println("Reverse number ="+rev);
    }

    public static void main(String []args) {
        Reverse obj = new Reverse();
        obj.input();
        obj.Reverse();
    }
}
/*

Output
 Enter the number
 12345
 Reverse number =54321

 */
