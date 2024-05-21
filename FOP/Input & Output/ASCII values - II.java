/*ASCII Values - II



Write a program to get a number (ASCII value) as input and print its equivalent character.



Sample Input 1:

119



Sample Output 1:

w



Sample Input 2:

105



Sample Output 2:

i

*/

//Solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asciiValue = scanner.nextInt();

        char character = (char) asciiValue;

        System.out.println(character);

        scanner.close();
    }
}
