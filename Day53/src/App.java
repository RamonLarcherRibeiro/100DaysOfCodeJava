import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade de numeros : ");
        int n = scanner.nextInt();

        int[] numeros = new int[n]; //criando o array de numeros


        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); 
        }

        // ordenação dos nu,eros
        Arrays.sort(numeros); // array em ordem crescente

        // exibição dos numeros ordenados
        System.out.println("\nNumeros ordenados em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " "); 
        }
        System.err.println("\n");
        scanner.close(); 
    }
}
