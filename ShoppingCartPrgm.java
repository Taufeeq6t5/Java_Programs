import java.util.Scanner;

public class ShopingCartPrgm{
    
    public static void main (String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        String item;
        double price;
        int quantity;
        double total;
        
        System.out.print("What item do you need to buy?: ");
        item=sc.nextLine();
        
        System.out.print("What is the price of the item?: ");
        price=sc.nextDouble();
        
        System.out.print("How much quantity do you need?: ");
        quantity=sc.nextInt();
        
        total=price*quantity;
        System.out.print("The total Price is " + total + " rs");
        
        sc.close();
    }
}
