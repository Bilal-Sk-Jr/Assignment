import java.util.Scanner;
public class Reverse_Num_Printing {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Num, Count;

        System.out.println("Enter a positive integer number: ");

        while(input.hasNextInt() == false) {
            System.out.println("Enter a integer: ");
            input.next();
        }
        Num = input.nextInt();

        while(Num < 0){
            System.out.println("Number should be positive: ");
            while(input.hasNextInt() == false){
                System.out.println("Only numbers are allowed: ");
                input.next();
            }
            Num = input.nextInt();
        }

        for(Count = Num; Count >= 0; Count--){
            System.out.println(Count);
        }
    }
}
