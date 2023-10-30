import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        int quantidade = sc.nextInt();


        double[] numeros = new double[quantidade];

        System.out.println("Digite os numeros");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Numeros negativos: ");

        for (double numero : numeros) {
            if (Calc.verificaNegativo(numero)) {
                System.out.println(numero);
            }
        }

        System.out.println("Numeros postivos:");

        for (double numeroPos : numeros) {
            if (CalcPos.verificaPositivo(numeroPos)) {
                System.out.println(numeroPos);
            }
        }

        System.out.println("Numeros quebrados:");

        for (double numeroQuebrado : numeros) {
            if (CalcQue.verificaQuebrado(numeroQuebrado)) {
                System.out.println(numeroQuebrado);
            }
        }


        sc.close();

    }
}

