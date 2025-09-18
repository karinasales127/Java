package lista12;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 int i = 10;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 30);
	        int numero;
	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();
	        } while (numero != 5);
	        System.out.println("Acertou! O número era 5.");
	        
	        int peso;
	        do {
	            System.out.print("Digite o peso da mala (kg): ");
	            peso = scanner.nextInt();
	            if (peso > 23) {
	                System.out.println("Peso excedido! Tente novamente.");
	            }
	        } while (peso > 23);
	        System.out.println("Mala dentro do limite permitido!");
	        
	        
	        int total = 0;
	        int contador = 1;

	        do {
	            System.out.print("Digite as páginas lidas no dia " + contador + ": ");
	            int paginas = scanner.nextInt();
	            total += paginas;
	            contador++;
	        } while (contador <= 7);

	        System.out.println("Total de páginas lidas na semana: " + total);
	        
	        
	        
	        int codigo;
	        do {
	            System.out.print("Digite o código de acesso (3 dígitos): ");
	            codigo = scanner.nextInt();

	            if (codigo != 789) {
	                System.out.println("Código incorreto, tente novamente.");
	            }
	        } while (codigo != 789);
	        System.out.println("Acesso liberado!");
	        
	        int combustivel;
	        do {
	            System.out.print("Digite o nível de combustível em litros: ");
	            combustivel = scanner.nextInt();

	            if (combustivel <= 10) {
	                System.out.println("Combustível baixo!");
	            }
	        } while (combustivel <= 10);
	        System.out.println("Combustível suficiente para viagem!");
	        
	        
	        
	        int distancia;
	        int totalKm = 0;
	        do {
	            System.out.print("Digite a distância percorrida neste trecho: ");
	            distancia = scanner.nextInt();

	            if (distancia > 0) {
	                totalKm += distancia;
	            }
	        } while (distancia > 0);
	        System.out.println("Total de quilômetros percorridos: " + totalKm);
	    }
	
	    }
	
	
