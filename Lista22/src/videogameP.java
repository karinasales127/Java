import java.util.Scanner;

public class videogameP {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  videogame vg = new videogame();
	        vg.marca = "Sony";
	        vg.modelo = "PlayStation 5";
	        vg.ligar();
	        vg.verificarStatus();
	        vg.desligar();
	        vg.verificarStatus();

	}

}
