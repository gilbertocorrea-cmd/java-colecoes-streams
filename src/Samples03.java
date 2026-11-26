
// IntStream permite processar valores inteiros usando operações encadeadas,
// como ordenar, filtrar, somar e encontrar o maior valor.
import java.util.stream.IntStream;

public class Samples03 {
        public static void main(String[] args) {
                // Cria um array de números inteiros.
                // A notação int[] indica que todas as posições guardam valores int.
                int[] valor = { 1, 2, 3, 4, 5, 7, 9 };

                // IntStream.of() transforma o array em um fluxo de inteiros.
                // sorted() organiza os valores em ordem crescente.
                // forEach() executa uma ação para cada número do fluxo.
                IntStream.of(valor)
                                .sorted()
                                .forEach(numero -> System.out.printf("%d ", numero));

                // Finaliza a linha dos valores ordenados antes das próximas mensagens.
                System.out.println();

                // max() localiza o maior valor e retorna um OptionalInt.
                // getAsInt() extrai o int; aqui sabemos que o array não está vazio.
                int maior = IntStream.of(valor).max().getAsInt();

                // min() localiza o menor valor do fluxo.
                int menor = IntStream.of(valor).min().getAsInt();

                // sum() calcula diretamente a soma de todos os valores.
                int somaComum = IntStream.of(valor).sum();

                System.out.println("Maior valor: " + maior);
                System.out.println("Menor valor: " + menor);
                System.out.println("Soma comum: " + somaComum);

                // reduce() também pode reduzir vários valores a um único resultado.
                // O 0 é o valor inicial; x acumula o total e y é o valor atual.
                int somaComReduce = IntStream.of(valor)
                                .reduce(0, (x, y) -> x + y);
                System.out.println("Soma com reduce: " + somaComReduce);

                // Nesta regra, cada número é elevado ao quadrado antes da soma:
                // 1*1 + 2*2 + 3*3 e assim por diante.
                int somaQuadrado = IntStream.of(valor)
                                .reduce(0, (x, y) -> x + y * y);
                System.out.println("Soma dos quadrados: " + somaQuadrado);

                // Separa a saída anterior da lista de números pares.
                System.out.println();

                // filter() mantém apenas os valores que atendem à condição.
                // O operador % calcula o resto da divisão; resto 0 indica número par.
                // Em seguida, sorted() ordena os pares e forEach() os imprime.
                IntStream.of(valor)
                                .filter(numero -> numero % 2 == 0)
                                .sorted()
                                .forEach(numero -> System.out.printf("%d ", numero));
        }
}
