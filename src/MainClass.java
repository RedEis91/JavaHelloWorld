import java.util.Scanner;
public class MainClass
    {
        public static void main(String[] args)
        {
          Scanner scan = new Scanner(System.in);
          //greetings and instructions
            System.out.println("Hello!");
            System.out.println("Please enter a whole number:");
            //initializing two variables to store integers from user input
            int number1;
            int number2;
            //takes in new integer from scanner and stores it in variable called number1
            number1 = scan.nextInt();
            //goes to next line
            scan.nextLine();
            System.out.println("Please enter another whole number");
            //takes in new integer from scanner and stores it in variable called number2
            number2 = scan.nextInt();
            //goes to next line
            scan.nextLine();
            //give console output to user and return their numbers to them
            System.out.println("You have entered " + number1 + " & " + number2 + '.');
            //initialize variable called result to store sum of two numbers
            int result = number1 + number2;
            //prints results to user console
            System.out.println("The sum of " + number1 + " & " + number2 + " is "  + result);
            //goodbye message
            System.out.println("Great Job!");
        }
    }