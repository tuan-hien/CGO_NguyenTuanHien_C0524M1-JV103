package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputNumber.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0: System.out.println(number + " in word: Zero"); break;
                case 1: System.out.println(number + " in word: One"); break;
                case 2: System.out.println(number + " in word: Two"); break;
                case 3: System.out.println(number + " in word: Three"); break;
                case 4: System.out.println(number + " in word: Four"); break;
                case 5: System.out.println(number + " in word: Five"); break;
                case 6: System.out.println(number + " in word: Six"); break;
                case 7: System.out.println(number + " in word: Seven"); break;
                case 8: System.out.println(number + " in word: Eight"); break;
                case 9: System.out.println(number + " in word: Nine"); break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10: System.out.println(number + " in word: Ten"); break;
                case 11: System.out.println(number + " in word: Eleven"); break;
                case 12: System.out.println(number + " in word: Twelve"); break;
                case 13: System.out.println(number + " in word: Thirteen"); break;
                case 14: System.out.println(number + " in word: Fourteen"); break;
                case 15: System.out.println(number + " in word: Fifteen"); break;
                case 16: System.out.println(number + " in word: Sixteen"); break;
                case 17: System.out.println(number + " in word: Seventeen"); break;
                case 18: System.out.println(number + " in word: Eighteen"); break;
                case 19: System.out.println(number + " in word: Nineteen"); break;
            }
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tensWord = "";
            String onesWord = "";
            switch (tens) {
                case 2: tensWord = "Twenty"; break;
                case 3: tensWord = "Thirty"; break;
                case 4: tensWord = "Forty"; break;
                case 5: tensWord = "Fifty"; break;
                case 6: tensWord = "Sixty"; break;
                case 7: tensWord = "Seventy"; break;
                case 8: tensWord = "Eighty"; break;
                case 9: tensWord = "Ninety"; break;
            }

            switch (ones) {
                case 0: onesWord = ""; break;
                case 1: onesWord = "-one"; break;
                case 2: onesWord = "-two"; break;
                case 3: onesWord = "-three"; break;
                case 4: onesWord = "-four"; break;
                case 5: onesWord = "-five"; break;
                case 6: onesWord = "-six"; break;
                case 7: onesWord = "-seven"; break;
                case 8: onesWord = "-eight"; break;
                case 9: onesWord = "-nine"; break;
            }
            System.out.println(number + " in word: " + tensWord + onesWord + ".");
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = (number % 100) % 10;
            String hundredsWord = "";
            String tensWord = "";
            String onesWord = "";
            // xét hàng trăm
            switch (hundreds) {
                case 1: hundredsWord = "One hundred and "; break;
                case 2: hundredsWord = "Two hundred and "; break;
                case 3: hundredsWord = "Three hundred and "; break;
                case 4: hundredsWord = "Four hundred and "; break;
                case 5: hundredsWord = "Five hundred and "; break;
                case 6: hundredsWord = "Six hundred and "; break;
                case 7: hundredsWord = "Seven hundred and "; break;
                case 8: hundredsWord = "Eight hundred and "; break;
                case 9: hundredsWord = "Nine hundred and "; break;
            }

            // xét hàng chục
            if (tens == 1) { // xét RIÊNG hàng chục = 1 với hàng đơn vị từ 0 đến 9
                if (ones == 0) {
                    tensWord = "ten";
                    onesWord = "";
                } else if (ones == 1) {
                    tensWord = "eleven";
                    onesWord = "";
                } else if (ones == 2) {
                    tensWord = "twelve";
                    onesWord = "";
                } else if (ones == 3) {
                    tensWord = "thirteen";
                    onesWord = "";
                } else if (ones == 4) {
                    tensWord = "fourteen";
                    onesWord = "";
                } else if (ones == 5) {
                    tensWord = "fifteen";
                    onesWord = "";
                } else if (ones == 6) {
                    tensWord = "sixteen";
                    onesWord = "";
                } else if (ones == 7) {
                    tensWord = "seventeen";
                    onesWord = "";
                } else if (ones == 8) {
                    tensWord = "eighteen";
                    onesWord = "";
                } else {
                    tensWord = "nineteen";
                    onesWord = "";
                }
            } else {
                // xét hàng chục != 1
                switch (tens) {
                    case 0: tensWord = ""; break;
                    case 2: tensWord = "twenty "; break;
                    case 3: tensWord = "thirty "; break;
                    case 4: tensWord = "forty "; break;
                    case 5: tensWord = "fifty "; break;
                    case 6: tensWord = "sixty "; break;
                    case 7: tensWord = "seventy "; break;
                    case 8: tensWord = "eighty "; break;
                    case 9: tensWord = "ninety "; break;
                }
            }

            // xét hàng đơn vị, trừ trường hợp hàng chục = 1
            if (tens != 1) {
                switch (ones) {
                    case 0: onesWord = ""; break;
                    case 1: onesWord = "one"; break;
                    case 2: onesWord = "two"; break;
                    case 3: onesWord = "three"; break;
                    case 4: onesWord = "four"; break;
                    case 5: onesWord = "five"; break;
                    case 6: onesWord = "six"; break;
                    case 7: onesWord = "seven"; break;
                    case 8: onesWord = "eight"; break;
                    case 9: onesWord = "nine"; break;
                }
            }
            System.out.println(number + " in word: " + hundredsWord + tensWord + onesWord + ".");
        } else {
            System.out.println("Invalid number.");
        }
    }
}
