import java.util.Scanner;

public class binaryString {

    public static String getBinaryString(int num)
    {
        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        String binary;

        System.out.print("Enter an integer: ");
        num = input.nextInt();

        binary = getBinaryString(num);

        System.out.println("Binary representation: " + binary);

        input.close();
    }
}
