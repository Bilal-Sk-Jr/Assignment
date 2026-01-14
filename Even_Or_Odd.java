import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Num;
        int Remainder;

        System.out.println("Enter any integer: ");
        while(input.hasNextInt() == false){
            System.out.println("Only INTEGER values are allowed.");
            input.next();
        }

        Num = input.nextInt();
        Remainder = Num % 2;

        if(Remainder != 0){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }

        input.close();
    }
}
