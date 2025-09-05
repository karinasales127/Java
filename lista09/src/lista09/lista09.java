package lista09;

import java.util.Scanner;

public class lista09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);// java.ultil

		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++;// +1
		}
		int numero2 = 10;
		while (numero2 >= 1) {
			System.out.println(numero2);
			numero2--;// +1
		}
		int numero3 = 0;
		while (numero3 <= 100) {
			System.out.println(numero3);
			numero3 += 5;
		}
		int mensagem = 1;
		while (mensagem <= 5) {
			System.out.println("Eu gosto de Java!");
			mensagem++;
		}
		 int contador = 1;
	        int soma = 0;

	        while (contador <= 5) {
	            System.out.print("Digite o " + contador + "º número: ");
	            int num = scanner.nextInt();
	            soma += num;  // acumula o valor digitado
	            contador++;
	     }
	        System.out.println("Digite a senha: ");
	        int pass = scanner.nextInt();
	        while (pass != 1234) {
	            System.out.println("Senha incorreta, tente novamente: ");
	            pass = scanner.nextInt();
	        }
	        System.out.println("Senha correta! Acesso liberado!");
	        
	}
}
