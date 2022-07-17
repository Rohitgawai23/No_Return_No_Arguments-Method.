package No_Return_No_Arguments;
import java.util.*;
public class Table_1ToN {     // Q10.Wap input a no and print table till that no

        Scanner sc;
        int no;

        public void input() {
            sc = new Scanner(System.in);
            System.out.println("Enter range: ");
            no = sc.nextInt();
            System.out.println("Table are :");
        }

        public void Table_1ToN() {
            for (int j = 1; j <= no; j++) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print((j * i)+"\t");
                }
                System.out.println("\n");
            }
        }

        public static void main(String[] args) {
            Table_1ToN obj=new Table_1ToN();
            obj.input();
            obj.Table_1ToN();

        }

    }
    /*
    Output :
    Enter range:
        5
        Table are :
        1	2	3	4	5	6	7	8	9	10

        2	4	6	8	10	12	14	16	18	20

        3	6	9	12	15	18	21	24	27	30

        4	8	12	16	20	24	28	32	36	40

        5	10	15	20	25	30	35	40	45	50

     */

