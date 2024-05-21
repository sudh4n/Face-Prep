/*ASCII Values - I



Write a program to get a character as input and print its ASCII value.



Sample Input 1:

a



Sample Output 1:

97



Sample Input 2:

A



Sample Output 2:

65

*/

//Solution

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);

    char inputChar = scanner.next().charAt(0);
    
    int asciiValue = (int)inputChar;

    System.out.println(asciiValue);
    
    scanner.close();
  }
