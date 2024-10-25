import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prvi broj je: ");
        int operand1 = scanner.nextInt();

        System.out.println("Unesite operator: + - / * ");
        String operator = scanner.next();

        System.out.println("Drugi broj je: ");
        int operand2 = scanner.nextInt();


        switch (operator) {
            case "+" : System.out.println("Rezultat je: " + (operand1 + operand2));
                break;
            case "-" : System.out.println("Rezultat je: " + (operand1 - operand2));
                break;
            case "/" : System.out.println("Rezultat je: " + (operand1 / operand2));
                break;
            case "*" : System.out.println("Rezultat je: " + (operand1 * operand2));
                break;
        }

    }
}