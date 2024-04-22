package FinalChallenges;

import java.util.Scanner;

public class AdvancedCalculator {
    // Copie and paste the code below
}

// solved exercise:
//
//        import java.util.Scanner;
//
//        public class Main {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                while (true) {
//                    char operation = scanner.nextLine().charAt(0);
//                    if (operation == 'e') {
//                        break;
//                    }
//                    float operand1 = Float.parseFloat(scanner.nextLine());
//                    float operand2 = Float.parseFloat(scanner.nextLine());
//                    float result = 0;
//
//                    switch (operation) {
//                        case '+':
//                            result = operand1 + operand2;
//                            break;
//                        case '-':
//                            result = operand1 - operand2;
//                            break;
//                        case '*':
//                            result = operand1 * operand2;
//                            break;
//                        case '/':
//                            if (operand2 != 0) {
//                                result = operand1 / operand2;
//                            } else {
//                                System.out.println("Error: Division by zero");
//                                continue;
//                            }
//                            break;
//                        default:
//                            System.out.println("Error: Invalid operation");
//                            continue;
//                    }
//
//                    System.out.println(result);
//                }
//                scanner.close();
//            }
//        }