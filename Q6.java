import java.util.Scanner;

public class Q6 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        double L1;
        double L2;
        double Height;
        double Area;

        System.out.println("Enter the length of the 1st parallel side: ");
        //Error input check
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

        // **********************************************************

        System.out.println("Enter the length of the 2nd parallel side: ");
        //Error input check
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

        //**********************************************************

        System.out.println("Enter the height of the trapezium: ");
        while(input.hasNextDouble() == false){
            System.out.println("Height has to be a numeric value");
            input.next();
        }
        Height = input.nextDouble();

        while(Height <= 0){
            System.out.println("Height cannot be 0 or less than 0");
            while(input.hasNextDouble() == false){
                System.out.println("Height has to be a numeric value");
                input.next();
            }
            Height = input.nextDouble();
        }

        Area = Height * ((L1 + L2)/2);
        System.out.printf("The area of the trapezium is: %.1f", Area);

        input.close();
    }
}
