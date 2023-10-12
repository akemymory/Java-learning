import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomedacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Episodio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
       Filme meuFilme =  new Filme("O poderoso chefão", 1970);
       meuFilme.setDuracaoEmMinutos(180);
       System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(10);
       meuFilme.avalia(5);
       System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
       System.out.println(meuFilme.pegaMedia());

       Serie lost = new Serie("Lost", 2000);
       lost.exibeFichaTecnica();
       lost.setTemporadas(6);
       lost.setEpisodiosPorTemporada(20);
       lost.setMinutosPorEpisodio(50);
       System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

       Filme outroFilme =  new Filme("Avatar", 2023);
       outroFilme.setDuracaoEmMinutos(200);

       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(meuFilme);
       calculadora.inclui(outroFilme);
       calculadora.inclui(lost);
       System.out.println(calculadora.getTempoTotal());

       FiltroRecomedacao filtro = new FiltroRecomedacao();
       filtro.filtra(meuFilme);

       Episodio episodio = new Episodio();
       episodio.setNumero(1);
       episodio.setSerie(lost);
       episodio.setTotalVisualizacoes(300);
       filtro.filtra(episodio);

       var filmeDoPaulo = new Filme("Dogville", 2003);
       filmeDoPaulo.setDuracaoEmMinutos(200);
       filmeDoPaulo.avalia(10);

       ArrayList<Filme> listaDeFilmes = new ArrayList<>();
       listaDeFilmes.add(filmeDoPaulo);
       listaDeFilmes.add(meuFilme);
       listaDeFilmes.add(outroFilme);
       System.out.println("Tamanho da lista " + listaDeFilmes.size());
       System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
       System.out.println(listaDeFilmes);
    }
}