package EstruturasRepeticao;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        do {
            System.out.println("Digite sua idade: ");
            idade = leitor.nextInt();
            System.out.println("Acesso negado!");
        }
        while (idade < (18));
        System.out.println("Acesso permitido!");
    }
}
