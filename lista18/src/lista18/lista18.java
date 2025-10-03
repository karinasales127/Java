package lista18;

public class lista18 {

	public static void main(String[] args) {
		
	}
		 // 1 – Apresentação
	    public static void apresentacao() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Meu nome é Karina Sales!");
	        }
	    }

	    // 2 – Exibindo uma frase
	    public static void fraseMotivacional() {
	        System.out.println("Acredite em você e tudo será possível!");
	    }

	    // 3 – Imprimindo valores
	    public static void imprimirUmADez() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	        }
	    }

	    // 4 – Mostrando as vogais
	    public static void mostrarVogais() {
	        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
	        for (char v : vogais) {
	            System.out.println(v);
	        }
	    }

	    // 5 – Desenhando um quadrado
	    public static void desenharQuadrado() {
	        int tamanho = 5; // pode mudar o tamanho aqui
	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    // 6 – Imprimindo números pares
	    public static void imprimirPares() {
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.println(i);
	        }
	    }

	    // 7 – Exibindo uma contagem regressiva
	    public static void contagemRegressiva() {
	        for (int i = 10; i >= 1; i--) {
	            System.out.println(i);
	        }
	        System.out.println("Fim!");
	    }

	    // 8 – Desenhando um triângulo
	    public static void desenharTriangulo() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    // 9 – Mostrando os dias da semana
	    public static void diasDaSemana() {
	        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", 
	                         "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
	        for (String dia : dias) {
	            System.out.println(dia);
	        }
	    }

	    // Programa principal para testar
	    public static void main1(String[] args) {
	        apresentacao();
	        System.out.println("----");
	        fraseMotivacional();
	        System.out.println("----");
	        imprimirUmADez();
	        System.out.println("----");
	        mostrarVogais();
	        System.out.println("----");
	        desenharQuadrado();
	        System.out.println("----");
	        imprimirPares();
	        System.out.println("----");
	        contagemRegressiva();
	        System.out.println("----");
	        desenharTriangulo();
	        System.out.println("----");
	        diasDaSemana();
	    
	
	}

}
