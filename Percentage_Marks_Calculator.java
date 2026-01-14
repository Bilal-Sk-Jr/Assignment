import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int ObtainedMarks;
        int MaximumMarks;
        double PercentageMarks;

        System.out.println("Enter your obtained marks: ");

        while(input.hasNextInt() == false){
            System.out.println("Enter a numeric integer value");
            input.next();
        }
        ObtainedMarks = input.nextInt();

        while(ObtainedMarks < 0){
            System.out.println("Marks cannot be a negative value");

            while(input.hasNextInt() == false){
                System.out.println("Enter a numeric integer value");
                input.next();
            }

            ObtainedMarks = input.nextInt();
        }

        System.out.println("Enter your maximum marks: ");

        while(input.hasNextInt() == false){
            System.out.println("Enter a numeric integer value");
            input.next();
        }

        MaximumMarks = input.nextInt();

        while(MaximumMarks < ObtainedMarks || MaximumMarks < 0){

            if(MaximumMarks < 0){
                System.out.println("Maximum marks must be greater than 0");
            }
            else{
                System.out.println("Maximum marks cannot be less than obtained marks");
            }

            System.out.println("Re-enter your marks: ");

            while(input.hasNextInt() == false) {
                System.out.println("Enter a numeric integer value");
                input.next();
            }

            MaximumMarks = input.nextInt();
        }
        PercentageMarks = ((double)ObtainedMarks/MaximumMarks) * 100;
        System.out.println("Your percentage marks is: " + PercentageMarks + "%");


    }
}

