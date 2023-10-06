package br.com.alura.audioplayer.modelos;

public class Musica extends Audio {
    private String estiloMusical;

    public String getEstiloMusical() {
        System.out.println("Estilo Musical: " + estiloMusical);
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;

    }
}
