import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double Amps;
        double Volt;
        double Watts;

        System.out.println("Enter Ammeter reading: ");

        while(input.hasNextDouble() == false){
            System.out.println("Cannot be a non-numeric value");
            input.next();
        }
        Amps = input.nextDouble();

        while(Amps < 0){
            System.out.println("Ammeter reading cannot be less than 0");

            while(input.hasNextDouble() == false){
                System.out.println("Cannot be a non-numeric value");
                input.next();
            }

            Amps = input.nextDouble();
        }

        System.out.println("Enter Voltmeter reading: ");

        while(input.hasNextDouble() == false){
            System.out.println("Cannot be a non-numeric value");
            input.next();
        }

        Volt = input.nextDouble();

        while(Volt < 0){
            System.out.println("Volt meter reading cannot be less than 0");

            while(input.hasNextDouble() == false) {
                System.out.println("Cannot be a non-numeric value");
                input.next();
            }

            Volt = input.nextDouble();
        }
        Watts = Amps * Volt;
        System.out.println("The power reading is: " + Watts + "Watts");
        input.close();
    }
}
