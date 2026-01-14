import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double OriginalP;
        double DiscountPercent;
        double SellingP;

        //Taking the input of original price

        System.out.println("Enter the original price: ");
        while(input.hasNextDouble() == false){
            System.out.println("Enter a numeric value");
            input.next();
        }

        OriginalP = input.nextDouble();

        while(OriginalP <= 0 ){
            System.out.println("Price cannot be 0 or less than 0. Re-enter:");
            while (input.hasNextDouble() == false){
                System.out.println("Enter a numeric value");
                input.next();
            }
            OriginalP = input.nextDouble();
        }

        //Taking the input of discount percent

        System.out.println("Enter the discount percent: ");

        while(input.hasNextDouble() == false){
            System.out.println("Enter a numeric value");
            input.next();
        }

        DiscountPercent = input.nextDouble();

        while(DiscountPercent < 0 ){
            System.out.println("Discount Percent cannot be 0 or less than 0. Re-enter:");
            while (input.hasNextDouble() == false){
                System.out.println("Enter a numeric value");
                input.next();
            }
            DiscountPercent = input.nextDouble();
        }

        SellingP = OriginalP - (OriginalP * (DiscountPercent/100));
        System.out.println("The new selling price is: $" + SellingP );
        input.close();
    }

}
