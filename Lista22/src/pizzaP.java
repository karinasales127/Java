import java.util.Scanner;

public class pizzaP {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 pizza pizza = new pizza();
	        pizza.sabor = "Calabresa";
	        pizza.tamanho = "Grande";
	        pizza.bordaRecheada = true;
	        pizza.preparar();
	        pizza.assando();
	        pizza.mostrarInformacoes();
	}

}
