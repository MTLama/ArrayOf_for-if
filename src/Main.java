import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        // Rest of your code...

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array as a space-separated string
        System.out.print("Enter the elements of the array (space-separated): ");
        String input = scanner.nextLine();
        // Split the input string by spaces and convert each element to an integer
        String[] inputElements = input.split(" ");
        int size = inputElements.length;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(inputElements[i]);
        }
        System.out.println("Enter the number of operation, what do u want to do with that array");
    while(true) {
        System.out.println("""
                 0:Exit
                 1:Sum of the line
                 2:Odd/even quantity
                 3:Negative/positive quantity
                 4:Prime numbers\s
                 
                """);
        int NumOfOp = Integer.parseInt(scanner.nextLine());
        if (NumOfOp == 0) {
            return;
        }
        if (NumOfOp == 1) {
            int result = solver1(numbers);
            System.out.println("Result: " + result);
        } else if (NumOfOp == 2) {
            int[] result = solver2(numbers);
            System.out.println(Arrays.toString(result));
        } else if (NumOfOp == 3) {
            int[] result = solver3(numbers);
            System.out.println(Arrays.toString(result));

        } else if (NumOfOp == 4) {
            int result = solver4(numbers);
            System.out.println(result);
        }
    }




    }
    private static int solver1(int[] numbers) {
    // Declare the solver method outside the main method
        int sum = 0;
        for ( int i = 0; i <= numbers.length - 1; i++) {
            sum = sum +  numbers[i];
        }
        return sum;
    }

    private static int[] solver2(int[] numbers) {
        int even = 0;
        int odd = 0;
    for (int i = 0; i < numbers.length; i++){
        if (numbers[i]%2 == 0){odd = odd + 1;}
        else {even = even + 1;}
    }
        return new int[]{odd, even};
    }

    private static int[] solver3(int[] numbers) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){pos = pos + 1;}
            else {neg = neg + 1;}
        }
        return new int[]{pos, neg};
    }

    private static int solver4(int[] numbers) {
        int mod = (int) (8%2.5);
//        dynamic array of s that could collect and rewrite element by index and cycle which read, write and calculate next element
//        so i build sequences and after that do approximation by neuron network

        BigInteger num1 = new BigInteger("56");
        BigInteger num2 = new BigInteger("48");

        BigInteger gcdResult = num1.gcd(num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcdResult);

//        int j = -1;
//        int r = 0;
//        int[] arr = {-34,-83,-71,-11,-20,-84,-100,-46,-57,-96,-34,-67,-100,16,-53,-16,-82,13,-53,-55,-96,-82,-79,-1,-95,-24,-99,-84,-80,-95,-21,18,-2,-26,-69,19,-20,-5,-99,-67,-58,8,-51,-46,-9,-62,-12,-91,6,-95,-55,-41,-74,-6,-29,-18,-62,-35,-86,-48,-87,-38,-49,-86,-13,-23,-95,-52,-45,-51,-96,-22,-76,-37,-24,8,-9,-88,-29,-50,-100,-13,-12,-73,-81,-82,-21,10,-7,-4,-14,-48,7,8,-79,-96,-24,-26,-43,-7};
//        for (int i = 1; i < 50 ; i++){
//            for (int k = 0; k<=1; k++) {
//                arr[r] = 6 * i + j;
//                j = -j;
//                r++;
//            }
//        }
        return mod;
    }


}
