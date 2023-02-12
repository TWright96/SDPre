import java.util.Scanner;
public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int userNum;

      System.out.println("Please enter a number: ");
      int num = scanner.nextInt();
      

     if (num > 0) {
      System.out.println("The number is greater than 0.");

     }

     else if (num < 0) { 
      System.out.println("The number less than 0.");
     }

     else if (num == 0) {
      System.out.println("The num is equal to 0.");

     }



      /*
        Your solution goes here
      */

      scanner.close();
  }
}