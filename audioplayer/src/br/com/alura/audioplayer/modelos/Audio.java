package br.com.alura.audioplayer.modelos;

public class Audio {
    private String titulo;
    private String artista;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Total de curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
    }


}
