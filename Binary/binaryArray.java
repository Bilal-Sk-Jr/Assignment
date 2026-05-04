import java.util.Scanner;

public class binaryArray {

    public static int[] getBinaryArray(int num)
    {
        int[] binary = new int[32];
        int index = 31;

        while (num > 0) {
            binary[index] = num % 2;
            num = num / 2;
            index--;
        }

        int size = 31 - index;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = binary[index + 1 + i];
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        int[] binary;

        System.out.print("Enter an integer: ");
        num = input.nextInt();

        binary = getBinaryArray(num);

        System.out.print("Binary representation: ");
        for (int bit : binary) {
            System.out.print(bit);
        }

        input.close();
    }
}