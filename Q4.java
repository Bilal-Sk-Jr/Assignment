import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double OriginalP;
        double DiscountPercent;
        double SellingP;

        //Taking the input of the Discount Percent

        System.out.println("Enter the discount percent: ");
        while(input.hasNextDouble() == false){
            System.out.println("Enter a numeric value");
            input.next();
        }

        DiscountPercent = input.nextDouble();

        while(DiscountPercent <= 0 ){
            System.out.println("Discount percentage cannot be 0 or less than 0. Re-enter:");
            while (input.hasNextDouble() == false){
                System.out.println("Enter a numeric value");
                input.next();
            }
            DiscountPercent = input.nextDouble();
        }

        //Taking the input of Selling Price

        System.out.println("Enter the selling price: ");

        while(input.hasNextDouble() == false){
            System.out.println("Enter a numeric value");
            input.next();
        }

        SellingP = input.nextDouble();

        while(SellingP <= 0 ){
            System.out.println("Price cannot be 0 or less than 0. Re-enter:");
            while (input.hasNextDouble() == false){
                System.out.println("Enter a numeric value");
                input.next();
            }
            SellingP = input.nextDouble();
        }

        OriginalP = SellingP / (1 - (DiscountPercent/100));
        System.out.println("The original price was: $" + OriginalP);
        input.close();

    }
}
