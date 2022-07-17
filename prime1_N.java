package No_Return_No_Arguments;
import java.util.*;

public class prime1_N {    // Q8.Wap print all prime no between 1 to n;
        Scanner sc;
        int range;

        public void input() {
            sc = new Scanner(System.in);
            System.out.println("Enter range: ");
            range = sc.nextInt();
            System.out.println("prime numbers are :");
        }

        public void prime() {
            int i;
            for(int j=1;j<=range;j++)
            {
                for (i = 2; i <= j; i++) {
                    if (j % i == 0)
                        break;

                }
                if (j == i) {
                    System.out.print(j+" ");
                }
            }
        }

        public static void main(String[] args) {
            prime1_N obj=new prime1_N();
            obj.input();
            obj.prime();

        }

    }
    /*
    output ;
    Enter range:
        10
        prime numbers are :
        2 3 5 7

     */
