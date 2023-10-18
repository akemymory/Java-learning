package listadecompras.principal;

import listadecompras.lista.Compra;

import java.util.*;

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
            compra.setItemComprado(item);
            compra.setValor(preco);

            if (totalDeCompras + preco <= limite) {
                listaDeCompras.add(compra);
                totalDeCompras += preco;
                System.out.println("Compra adicionada. Você ainda tem " + (limite - totalDeCompras) + " de limite disponível");
            } else {
                System.out.println("A compra excede o limite disponível. Limite restante: " + (limite - totalDeCompras));
            }

            System.out.println("Para continuar digite 1 e para encerrar 2:");
            try{
                int choice = valor.nextInt();
                if (choice != 1) {
                    break;
                }
            }catch(Exception e){
                System.out.println("Valor invalido, considerado encerrado");
                break;
            }

        }


       Comparator<Compra> comparator = Comparator.comparing(Compra::getValor);
        Collections.sort(listaDeCompras, comparator);

        System.out.println("****************************");
        System.out.println("EXTRATO DE COMPRAS");
        System.out.println("----------------------------");
        System.out.println("Item                   Valor");
        for (Compra compra : listaDeCompras) {
            System.out.println(compra);
        }
        System.out.println("------------------------------");
        System.out.println("Total gasto: " + totalDeCompras);
        System.out.println("******************************");


    }

}
