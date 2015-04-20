import java.util.Scanner;

public class LetterCountTest
{
 public static void main(String[] args)
 {
 String testString = "";
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a string");
 testString = scanner.nextLine();
 LetterCount letterCount = new LetterCount();
 letterCount.printLettersFrequency(testString);
 }
}