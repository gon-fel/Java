package programa;
public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int [][] matrixTamFixo = new int [2][2];

        // Mostrar na tela

        System.out.println("\nValores de Matriz: ");

        for (int i = 0; i < matriz.length; i ++ ){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}