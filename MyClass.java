public class MyClass {
  public static void main(String args[]) {
      
    // Variáveis
    int idade = 24; //números inteiros
    double salario = 1.75; //números quebrados
    char letra = 'J'; //letra ou simbolo
    boolean estudante = true; //verdadeiro ou falso
    //true ou false
    String nome = "Juliana"; //texto
    
    System.out.println(idade);
    System.out.println("Minha idade é " + idade);
    System.out.println("O salário é " + salario);
    System.out.println("A letra é "+ letra);
    System.out.println("Estuda? " + estudante);
    System.out.println("Meu nome é " + nome);
    
    // Operadores Aritmeticos
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    System.out.println("Soma " + soma);
    System.out.println("Subtração " + sub);
    System.out.println("Divisão " + div);
    System.out.println("Multiplicação " + mult);
    
    /*Calculo da área de um Retângulo*/
    /*largura * comprimento*/
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    System.out.println("Área: " + area);
    
    // Calculo do desconto
    double valor = 100;
    double desconto = 15; //15%
    double valorDesc = valor * (desconto / 100);
    double valorFinal = valor - valorDesc;
    System.out.println("A pagar " + valorFinal);
    
    
    
    
    
    
    
  }
}