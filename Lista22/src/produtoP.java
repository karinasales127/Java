
public class produtoP {

	public static void main(String[] args) {
		 produto produto = new produto();
	        produto.nome = "Camiseta";
	        produto.preco = 59.90;
	        produto.estoque = 10;
	        produto.vender(3);
	        produto.mostrarInformacoes();
	}

}
