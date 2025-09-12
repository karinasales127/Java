import java.util.Scanner;

public class lista10while {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 1 - Contador: números de 10 a 30//
        System.out.println("1 - Contador de 10 a 30:");
        int i = 10;
        while(i <= 30) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // 2 - Soma de 3 números digitados//
        System.out.println("2 - Soma de 3 números:");
        int soma = 0, contador = 0;
        while(contador < 3) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
            contador++;
        }
        System.out.println("Soma total: " + soma + "\n");

        // 3 - Multiplicação de 5 números digitados//
        System.out.println("3 - Multiplicação de 5 números:");
        int produto = 1;
        contador = 0;
        while(contador < 5) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            produto *= num;
            contador++;
        }
        System.out.println("Produto total: " + produto + "\n");

        // 4 - Contar até o número informado//
        System.out.println("4 - Contar até o número informado:");
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        i = 1;
        while(i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // 5 - Soma dos números de 1 a 5//
        System.out.println("5 - Soma de 1 a 5:");
        int soma1a5 = 0;
        i = 1;
        while(i <= 5) {
            soma1a5 += i;
            i++;
        }
        System.out.println("Soma total: " + soma1a5 + "\n");

        // 6 - Tabuada de um número//
        System.out.println("6 - Tabuada:");
        System.out.print("Digite um número para a tabuada: ");
        int tab = scanner.nextInt();
        i = 1;
        while(i <= 10) {
            System.out.println(tab + " x " + i + " = " + (tab * i));
            i++;
        }

        scanner.close();
    }

	}


