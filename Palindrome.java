package No_Return_No_Arguments;
import java.util.*;
public class Palindrome {
    Scanner sc;              // Q1.Wap input a no and check it is palindrome or not.
    int no;

    public void input() {
        sc=new Scanner(System.in);
        System.out.println("Enter no :");
        no=sc.nextInt();
    }

    public void Palindrome(){
        int i, rev=0, rem;
        for(i=no; i!=0;i=i/10){
            rem=i%10;
            rev=rev*10+rem;

        }
        if(no==rev) {
            System.out.println("It is Palindrome number ");
        }
        else
            System.out.println("It is Not palindrome number :");
        }

        public static void main(String []args){
            Palindrome obj=new Palindrome();
             obj.input();
             obj.Palindrome();
        }

    }
    /*
    output

    Enter no :
        121
        It is Palindrome number
        */





