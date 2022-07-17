package No_Return_No_Arguments;
import java.util.*;
public class Palindrome1_N {     // Q9.Wap print all palindrome no between 1 to n.

        Scanner sc;
        int no;

        public void input() {             // method defination
            sc = new Scanner(System.in);
            System.out.println("Enter range: ");
            no = sc.nextInt();
            System.out.println("palindrome number are");
        }

        public void palindrome() {          // method defination
            for(int j=1;j<no;j++)
            {
                int rev = 0, rem, i;
                for (i = j; i != 0; i = i / 10) {
                    rem = i % 10;
                    rev = rev * 10 + rem;

                }
                if (j == rev) {
                    System.out.println(j+" ");
                }
            }
        }

        public static void main(String[] args) {
            Palindrome1_N obj=new Palindrome1_N();   // object creation
            obj.input();                             // method calling
            obj.palindrome();

        }

}
/*
Output
    Enter range:
        25
        palindrome number are
        1
        2
        3
        4
        5
        6
        7
        8
        9
        11
        22

 */


