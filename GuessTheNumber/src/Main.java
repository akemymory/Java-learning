import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroCorreto = new Random().nextInt(100);
        Scanner numero = new Scanner(System.in);
        int tentativasFeitas = 0;
        boolean acertou = false;

        System.out.println("Bem vindo ao Jogo de Adivinhações");
        System.out.println("Tente adivinhar o número entre 0 e 100");

        while (tentativasFeitas < 5) {
            System.out.println("Tentativa " + (tentativasFeitas + 1) + ": Digite um número ");
            int tentativa = numero.nextInt();
            tentativasFeitas++;

            if (tentativa < numeroCorreto) {
                System.out.println("O número correto é maior que o número escolhido");
            } else if (tentativa > numeroCorreto) {
                System.out.println("O número correto é menor que o número escolhido");
            } else {
                acertou = true;
                break;
            }
        }

        if (acertou) {
            System.out.println("Você acertou o número " + numeroCorreto + " em " + tentativasFeitas + " tentativas");
        } else {
            System.out.println("Suas tentativas acabaram, o número correto era " + numeroCorreto);
        }

        numero.close();
    }
}
