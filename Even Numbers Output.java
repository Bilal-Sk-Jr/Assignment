import java.util.Scanner;
public class Even_Num_Printing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int StartVal, EndVal;
        int Count;
        System.out.println("Enter starting number: ");

        while (input.hasNextInt() == false) {
            System.out.println("Enter a INTEGER number: ");
            input.next();
        }
        StartVal = input.nextInt();

        System.out.println("Enter ending number: ");

        while (input.hasNextInt() == false) {
            System.out.println("Enter a INTEGER number: ");
            input.next();
        }
        EndVal = input.nextInt();

        Count = StartVal;
        while (Count <= EndVal) {
            if (Count % 2 == 0) {
                System.out.println(Count);
                Count = Count + 1;
            } else {
                Count = Count + 1;
            }
        }
    }
}
