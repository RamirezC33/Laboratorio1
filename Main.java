import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Addition(scanner);
                    break;
                case 2:
                    Subtraction(scanner);
                    break;
                case 3:
                    Multiplication(scanner);
                    break;
                case 4:
                    Division(scanner);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choose a valid option");
                    break;
            }
        } while (option != 5);

        scanner.close();
    }