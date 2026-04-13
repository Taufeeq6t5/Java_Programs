import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {        // rows decreasing
            for (int j = 1; j <= i; j++) {    // print stars
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
