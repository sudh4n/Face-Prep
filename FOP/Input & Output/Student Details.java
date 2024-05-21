/*Student Details:



Write a program to print the details of a student. The student's details consist of his/her name, age, CGPA, and grade.



Input Format:

The input consists of one string, one integer, one float, and one character.

The string corresponds to the name of a student.

The integer corresponds to the age of a student.

The float corresponds to the CGPA of a student.

The character corresponds to the grade of a student.



Output Format:

The output prints all the details of a student.

Refer to the sample Output.



Note: The CGPA (float value) should be printed with 2 decimal places.



Sample Input 1:

Rajeev

20

8.6467

B

Sample Output 1:

Name: Rajeev

Age: 20

CGPA: 8.64

Grade: B



Sample Input 2:

Meera

18

9.123

A



Sample Output 2:

Name: Meera

Age: 18

CGPA: 9.12

Grade: A */

//Solution

import java.util.Scanner;
import java.math.BigDecimal;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    
    String name = scanner.nextLine();
    int age = scanner.nextInt();
    scanner.nextLine();
    float cgpa = scanner.nextFloat();
    cgpa = (float) (Math.round(cgpa * 100.0) / 100.0);
    scanner.nextLine();
    char grade = scanner.next().charAt(0);

      
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("CGPA: "+cgpa);
    System.out.println("Grade: "+grade);
    
    scanner.close();

  }
}
