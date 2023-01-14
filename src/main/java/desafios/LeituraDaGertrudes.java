package desafios;

import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int resultado = paginas / paginasLidas;

        System.out.println(resultado + " dias");

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
    }
}
