package No_Return_No_Arguments;
import java.util.*;
public class Sum_Even_Odd {
                         // Q7.Wap input 5 digit integer and find the sum of even and odd no .
        int num;
        Scanner sc;

        public void input() {
            sc = new Scanner(System.in);
            System.out.println("Enter number range : ");
            num = sc.nextInt();
        }
        public void sum()
        {
            int os=0,es=0;
            for(int i=num; i!=0; i=i/10)
            {
                int rem=i%10;
                if(rem%2==0)
                    es=es+rem;
                else
                    os=os+rem;
            }
            System.out.println("Sum of even: "+es);
            System.out.println("Sum of Odd : "+os);
        }

        public static void main(String[] args) {
            Sum_Even_Odd obj=new Sum_Even_Odd();
            obj.input();
            obj.sum();

        }
 }
 /*
 Output
    Enter number range :
        1234567
        Sum of even: 12
        Sum of Odd : 16

  */