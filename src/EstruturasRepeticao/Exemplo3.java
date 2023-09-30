package EstruturasRepeticao;

public class Exemplo3 {
    public static void main(String[] args) throws InterruptedException {
        String[] carros = {"Audi R8", "Omega", "Camaro", "Ferrari 458"};

        for (String cadaCarro: carros) {
            System.out.println(cadaCarro);
            Thread.sleep(1000);       // faz pausa na hora de mostrar cada carro da lista
        }
    }
}
