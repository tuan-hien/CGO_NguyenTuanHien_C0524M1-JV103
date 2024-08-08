package ss02_loop.exercise;

import java.util.Scanner;

//public class _3_PrimeNumbers100 {
//    public static void main(String[] args) {
//        for (int n = 2; n < 100; n++) {
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                int min = 3;
//                while (min < 100 - n) {
//                    min = 100 - n;
//                }
//                if (min != 3) {
//                    System.out.print(n + ", ");
//                } else {
//                    System.out.print(n + ".");
//                }
//            }
//        }
//    }
//}

//cách 2
public class _3_PrimeNumbers100 {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " - ");
            }
        }
        // Remove the trailing comma and add a period at the end.
        System.out.print("\b\b\b (T.T)"); // \b is the backspace character
        // --> \b\b\b nghĩa là lùi lại 3 kí tự và thay vào đó một kí tự mình muốn (kể cả khoảng trống)
    }
}
