import java.util.Scanner;
import java.lang.Math;

public class Q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double L1;
        double L2;
        double L3;
        double SemiP;
        double Area;

        System.out.println("Enter the first length of the triangle: ");

        while(input.hasNextDouble() == false){
            System.out.println("Length has to be a numeric value");
            input.next();
        }
        L1 = input.nextDouble();

        while(L1 <= 0){
            System.out.println("Length cannot be 0 or less than 0");
            while(input.hasNextDouble() == false){
                System.out.println("Length has to be a numeric value");
                input.next();
            }
            L1 = input.nextDouble();
        }

        //*************************************************************

        System.out.println("Enter the second length of the triangle: ");
        while(input.hasNextDouble() == false){
            System.out.println("Length has to be a numeric value");
            input.next();
        }
        L2 = input.nextDouble();

        while(L2 <= 0){
            System.out.println("Length cannot be 0 or less than 0");
            while(input.hasNextDouble() == false){
                System.out.println("Length has to be a numeric value");
                input.next();
            }
            L2 = input.nextDouble();
        }

        //************************************************************

        System.out.println("Enter the third length of the triangle: ");
        while(input.hasNextDouble() == false){
            System.out.println("Length has to be a numeric value");
            input.next();
        }
        L3 = input.nextDouble();

        while(L3 <= 0){
            System.out.println("Length cannot be 0 or less than 0");
            while(input.hasNextDouble() == false){
                System.out.println("Length has to be a numeric value");
                input.next();
            }
            L3 = input.nextDouble();
        }

        SemiP = (L1 + L2 + L3)/2;
        Area = Math.sqrt( (SemiP) * (SemiP-L1) * (SemiP-L2) * (SemiP-L3) );

        System.out.println("The area of the triangle is: " + Area);
    }
}
