package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor =new Scanner(System.in);
        System.out.print("Digite o salário: "); //console.log
        //double salario = Double.parseDouble(leitor.nextLine()); //le oq ta escrito na proxima linha

        double salario = leitor.nextDouble(); //pega o leitor e ja le em formato de double e tambem pega a localidade do sistema, entao usaremos virgula e nao ponto

        if (salario < 1000){
            double salarioReajustado = salario * 1.1;
            System.out.println(salarioReajustado);
        }else{
            System.out.println("Salário sem reajuste");
        }
    }
}
