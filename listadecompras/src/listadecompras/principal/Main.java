package listadecompras.principal;

import listadecompras.lista.Compra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        boolean temLimite = true;
        double totalDeCompras = 0;

        System.out.println("Digite o limite do cartão:");
        double limite = valor.nextDouble();

        List<Compra> listaDeCompras = new ArrayList<Compra>();

        while (true) {
            System.out.println("Digite o item:");
            String item = valor.next();

            System.out.println("Digite o preço:");
            double preco = valor.nextDouble();

            Compra compra = new Compra();
            compra.setItem(item);
            compra.setValor(preco);

            if (totalDeCompras + preco <= limite) {
                listaDeCompras.add(compra);
                totalDeCompras += preco;
                System.out.println("Compra adicionada. Você ainda tem " + (limite - totalDeCompras) + " de limite disponível");
            } else {
                System.out.println("A compra excede o limite disponível. Limite restante: " + (limite - totalDeCompras));
            }

            System.out.println("Para continuar digite 1 e para encerrar 2:");
            int choice = valor.nextInt();
            if (choice == 2) {
                break;
            }
        }

        System.out.println("Lista de compras: " + listaDeCompras);
        System.out.println("Total gasto: " + totalDeCompras);
    }
}
