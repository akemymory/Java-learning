package listadecompras.lista;

public class Compra {

    private String itemComprado;

    private double valor;

    public String getItemComprado() {
        return itemComprado;
    }

    public void setItemComprado(String item) {
        this.itemComprado = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%-20s %10.2f", itemComprado, valor);
    }

}

