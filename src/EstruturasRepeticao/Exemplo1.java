package EstruturasRepeticao;

public class Exemplo1 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia","Odirlei", "Jessica", "Thiago", "Samanta"};

        for (int contador = 0; contador < listaProfessores.length; contador++) {

            if (contador == 0) {
                System.out.println("O número do índice do(a) professor(a) " + listaProfessores[contador] + " é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("O número do índice do(a) professor(a) " + listaProfessores[contador] + " é Par");
            }else {
                System.out.println("O número do índice do(a) professor(a) " + listaProfessores[contador] + " é Ímpar");
            }
        }
    }
}
