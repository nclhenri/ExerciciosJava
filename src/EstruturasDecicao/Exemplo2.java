package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é positivo ou negativo: ");

        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado > 0){
            System.out.println("O número digitado é positivo!");
        } else if (numeroDigitado < 0) {
            System.out.println("O número digitado é negativo!");
        }else {
            System.out.println("O número digitado é neutro!");
        }
    }
}
