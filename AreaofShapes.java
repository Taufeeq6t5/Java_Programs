import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("---- AREA CALCULATOR ----");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circle = Math.PI * r * r;
                System.out.println("Area of Circle = " + circle);
                break;


