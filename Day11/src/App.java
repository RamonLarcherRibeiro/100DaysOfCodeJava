import classes.DivisaoNaoExata;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {4, 8, 16, 32, 64, 128, 7}; // Adicionando um número ímpar
        int[] demon = {2, 0, 4, 8,7, 0, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (i >= demon.length || demon[i] == 0) {
                    throw new ArithmeticException("Divisão por zero ou índice fora do limite.");
                }
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro: ");
                e.printStackTrace();
            } 
        }
    }
}
