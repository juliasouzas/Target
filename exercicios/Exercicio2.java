package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	        System.out.println("Vamos calcular a sequência de Fibonacci! Digite um número a seguir: ");
	        int numero = sc.nextInt();
	        int numero1 = 0;
	        int numero2 = 1;
	        int resultado;
	        if (numero == 0 || numero == 1) {
	            System.out.println("O número informado pertence à sequência de Fibonacci!");
	        } else {
	            for (int i=0; numero2 < numero; i++) {
	                resultado = numero1 + numero2;
	                System.out.println(resultado);
	                numero1 = numero2;
	                numero2 = resultado;
	            }
	            if (numero2 == numero) {
	                System.out.println("O número informado pertence à sequência de Fibonacci!");
	            } else {
	                System.out.println("O número informado não pertence à sequência de Fibonacci!");
	            }
	        }
		
	}

}
