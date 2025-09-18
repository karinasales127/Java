package lista11while;

import java.util.Scanner;

public class lista11while {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // 1 - Contador (1 a 31, pulando de 2 em 2)
	        System.out.println("1 - Contador (1 a 31, de 2 em 2):");
	        int i = 1;
	        do {
	            System.out.print(i + " ");
	            i += 2;
	        } while(i <= 31);
	        System.out.println("\n");

	        // 2 - Adivinhação de número
	        System.out.println("2 - Adivinhação de número:");
	        int numero;
	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();
	        } while(numero != 100);
	        System.out.println("Você acertou! Número = 100\n");

	        // 3 - Menu interativo
	        System.out.println("3 - Menu interativo:");
	        int opcao;
	        do {
	            System.out.println("Menu:\n1 - Continuar\n2 - Sair");
	            System.out.print("Escolha: ");
	            opcao = scanner.nextInt();

	            if(opcao == 1) {
	                System.out.println("Você escolheu continuar!\n");
	            } else if(opcao == 2) {
	                System.out.println("Saindo do programa...\n");
	            } else {
	                System.out.println("Opção inválida!\n");
	            }
	        } while(opcao != 2);

	        // 4 - Classificação de números
	        System.out.println("4 - Classificação de números:");
	        int contador = 0;
	        do {
	            System.out.print("Digite um número: ");
	            int n = scanner.nextInt();
	            if(n < 10) {
	                System.out.println("Tipo A");
	            } else if(n < 20) {
	                System.out.println("Tipo B");
	            } else {
	                System.out.println("Fora da Categoria");
	            }
	            contador++;
	        } while(contador < 5);
	        System.out.println();

	        // 5 - Temperatura do forno
	        System.out.println("5 - Temperatura do forno:");
	        int temp;
	        do {
	            System.out.print("Digite a temperatura do forno: ");
	            temp = scanner.nextInt();
	            if(temp >= 200) {
	                System.out.println("⚠️ Temperatura muito alta! Digite novamente.");
	            }
	        } while(temp >= 200);
	        System.out.println("✅ Temperatura segura: " + temp + "°C\n");

	        // 6 - Verificação de bateria
	        System.out.println("6 - Verificação de bateria:");
	        int bateria;
	        do {
	            System.out.print("Digite o nível da bateria (%): ");
	            bateria = scanner.nextInt();
	            if(bateria <= 20) {
	                System.out.println("⚠️ Bateria baixa, recarregue!");
	            }
	        } while(bateria <= 20);
	        System.out.println("✅ Bateria suficiente: " + bateria + "%\n");

	        // 7 - Deseja fazer uma conta?
	        System.out.println("7 - Deseja fazer uma conta?");
	        String resposta;
	        scanner.nextLine(); // limpar buffer
	        do {
	            System.out.print("Deseja fazer uma conta? (sim/não): ");
	            resposta = scanner.nextLine().toLowerCase();

	            if(resposta.equals("sim")) {
	                System.out.print("Digite o primeiro número: ");
	                int a = scanner.nextInt();
	                System.out.print("Digite o segundo número: ");
	                int b = scanner.nextInt();
	                scanner.nextLine(); // limpar buffer
	                System.out.println("Resultado da soma: " + (a + b) + "\n");
	            }
	        } while(resposta.equals("sim"));

	        scanner.close();
	    }
	


	}


