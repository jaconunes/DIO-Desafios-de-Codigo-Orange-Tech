package desafios;

import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        String download = "";
        for (int i = 0; i < tamanho; i++){
            download += "/";
        }
        System.out.println(download);
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
    }
}
