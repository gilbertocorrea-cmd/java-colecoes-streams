public class Sample02 {
    public static void main(String[] args) {
        // Cria um vetor (array) com cinco valores inteiros.
        int[] valores = { 1, 3, 5, 7, 9 };

        // O acumulador começa em zero porque nenhuma parcela foi somada ainda.
        int soma = 0;

        // Este é o modo tradicional de percorrer um array usando um índice.
        // O primeiro índice é 0, e length informa a quantidade de posições.
        for (int i = 0; i < valores.length; i++) {
            // Lê o valor da posição atual e adiciona-o ao acumulador.
            soma += valores[i];
        }

        // Quando o laço termina, soma contém o total de todos os valores.
        System.out.println("Resultado da soma: " + soma);
    }
}
