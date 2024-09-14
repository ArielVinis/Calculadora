import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner escrever = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");

        double num1 = escrever.nextDouble();
        System.out.print("Digite o segundo número: ");

        double num2 = escrever.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
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
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+"= "+result);
    }
}