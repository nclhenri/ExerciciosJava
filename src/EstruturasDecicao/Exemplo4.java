package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o usuário: ");
        String usuario = leitor.nextLine();
        System.out.println("Digite a senha: ");
        String senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("123")){
            System.out.println("Login bem-sucedido!");
        }else {
            System.out.println("Usuário ou senha incorreta!");
        }
    }
}