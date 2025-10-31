
public class MusicaP {

	public static void main(String[] args) {
		Musica musica = new Musica();
        musica.titulo = "Shape of You";
        musica.artista = "Ed Sheeran";
        musica.duracao = 4.2;
        musica.tocar();
        musica.mostrarDetalhes();
        musica.pausar();

	}

}
