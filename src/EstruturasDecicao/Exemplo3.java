package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = leitor.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.print(primeiroNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.print(segundoNumero);
        }else {
            System.out.print("Os número são iguais!");
        }
    }
}
