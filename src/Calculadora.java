import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner escrever = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = escrever.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = escrever.nextDouble();

        System.out.print("Digite uma operação (+, -, *, /): ");
        char operator = escrever.next().charAt(0);
        
        escrever.close();
        double result;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        // ou usando placeholders com "printf"
        System.out.printf("(%.2f) (%s) (%.2f) = (%.2f)", num1, operator, num2, result);
    }
}
