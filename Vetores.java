
public class Vetores {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Inicialização com valores
        String[] names = {"Alice", "Bob", "Charlie"}; // Inicialização com valores

        int[] numero = new int[5]; // Inicialização de um vetor com 5 inteiros
        String[] nomes = new String[3]; // Inicialização de um vetor com 3 strings

        // mostrar
        System.out.println("Vetor de números: " + numbers);

        // percorrer
        System.err.println("Valores de vetor usando FOR");
        for (int i = 0; i < numbers.length; i++){
            System.err.println("Elementos na posição [" + i + "]:" + numbers[i]);

        }
              


    }
    
}
