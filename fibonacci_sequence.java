import java.util.Scanner;

public class fibonacci_sequence{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of terms:");
        int num=sc.nextInt();

       int first=0, second=1;
       System.out.print("Fibonacci numbers series upto " + num +" terms is:");

       for(int i=0;i<num;i++){
        System.out.print(first + " ");

        int next=first+second;
        first=second;
        second=next;
       }
    sc.close();
    }

}