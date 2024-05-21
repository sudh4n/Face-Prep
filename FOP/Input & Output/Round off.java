/*Round Off



Write a program to get a float value from the user and display it in the below-mentioned format.

HINT: Use ceil() and floor() functions from the header file.



Input & Output Format:

Input consists of one float value.

The output consists of one integer, its rounded-up value, and its rounded-down value.



Sample Input 1:

54.5



Sample Output 1:

54

55

54



Sample Input 2:

66.7



Sample Output 2:

66

67

66

*/

//Solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float input = scanner.nextFloat();

        int integerPart = (int) input;

        int roundedUp = (int) Math.ceil(input);

        int roundedDown = (int) Math.floor(input);

        System.out.println(integerPart);
        System.out.println(roundedUp);
        System.out.println(roundedDown);
    }
}
  
