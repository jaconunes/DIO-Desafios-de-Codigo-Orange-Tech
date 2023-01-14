package desafios;

import java.util.Scanner;

public class MesadaDoSobrinho {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int resultado = mesada * entrada;

        System.out.println("Você terá " + resultado + " reais");

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
    }
}
