import java.util.Scanner;
import java.lang.Math;

public class Q2 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double Radius;
    double Circumference;
    double Area;

    System.out.println("What is the radius of the circle?");

        while(input.hasNextDouble() == false){
            System.out.println("Radius should be a numeric value");
            input.next();
        }

        Radius = input.nextDouble();

        while(Radius <= 0){
            System.out.println("Radius cannot be 0 or negative");

            while(input.hasNextDouble() == false){
                System.out.println("Radius should be a numeric value");
                input.next();
            }

            Radius = input.nextDouble();
        }

        Circumference = 2 * Math.PI * Radius;
        Area = Math.PI * Math.pow(Radius,2);

        System.out.printf("The circumference of the circle is: %.2f\n", Circumference);
        System.out.printf("The area of the circle is: %.2f\n", Area);

        input.close();

    }
}
