package exercicios;

public class Exercicio5 {

	public static void main(String[] args) {
		
		String str = "azul";
        String invertida = "";

        int tamanho = str.length();

        for (int i = tamanho - 1; i >= 0; i--) {
            invertida = invertida + str.charAt(i);
        }

        System.out.println(invertida);
    
}

	}


