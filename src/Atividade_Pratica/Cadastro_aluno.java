package Atividade_Pratica;

public class Cadastro_aluno {
    public static void main(String[] args) {

        // Declarando as variáveis primitivas
        int idade = 20;
        float media = 8.5f;
        boolean matricula = true;

        // Criei a Estrutura Condicional e validei as informações
        if (matricula) {
            System.out.println("Sua matrícula está ativada");
        }
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    // Estrutura de Repetição e manipulação de laços de repetição
    for (int n = 0; n < 4; n++){
        System.out.println("Analisando a nota do " + (n + 1));
    }
    // Tratando as exceções e erros no arrays
    int[] numeros = {20, 30, 40};
    try {
        System.out.println(numeros[10]);

    } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu um erro ao acessar o array: " + e.getMessage());
        }
    // Manipulação de array
    int[] notas = {8, 7, 9, 10};
    for (int i : notas){
        System.out.println("Número do array " + i);
    }

    // Criando e manipulando a matriz
    int [][] minhaMatriz = {
        {10, 20, 30},
        {40, 50, 60}
    };
    for (int o = 0; o < minhaMatriz.length; o++ ){
        for (int p = 0; p < minhaMatriz[o].length; p++) {
            System.out.print(minhaMatriz[o][p] + " ");
        }
        System.out.println();
      

    }
    
}
}
