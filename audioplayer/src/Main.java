import br.com.alura.audioplayer.modelos.Audio;
import br.com.alura.audioplayer.modelos.Musica;
import br.com.alura.audioplayer.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica mrBrightside = new Musica();
        mrBrightside.setTitulo("Mr. Brightside");
        mrBrightside.setEstiloMusical("Indie Rock");
        mrBrightside.setDuracao(3.42);
        mrBrightside.setArtista("The Killers");
        mrBrightside.setEstiloMusical("Indie Rock");

        mrBrightside.curtir();
        mrBrightside.curtir();
        mrBrightside.curtir();
        mrBrightside.reproduzir();
        mrBrightside.reproduzir();
        mrBrightside.reproduzir();
        mrBrightside.reproduzir();
        mrBrightside.reproduzir();


        mrBrightside.exibeFichaTecnica();
        mrBrightside.getEstiloMusical();

    }
}