
// ArrayList é uma lista mutável: podemos aumentar, diminuir e remover valores.
import java.util.ArrayList;

// List é a interface que representa uma coleção de elementos em sequência.
import java.util.List;

public class Sample01 {
    public static void main(String[] args) {
        // List.of() cria uma lista imutável. Depois de criada, ela não permite
        // adicionar, remover ou substituir elementos.
        var lista = List.of("Banana", "Pera", "Morango", "Abacate");

        // Se remover os comentários desta linha, ocorrerá uma exceção em tempo
        // de execução, porque a lista criada com List.of() não pode ser alterada.
        // lista.add("Pera2");

        // O for-each percorre a lista inteira sem exigir um contador de índice.
        // A variável fruta recebe um elemento diferente a cada repetição.
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        // Aqui criamos uma lista mutável e inicialmente vazia.
        var frutas = new ArrayList<String>();

        // add() acrescenta elementos ao final da lista, na ordem em que são inseridos.
        frutas.add("Fruta do conde");
        frutas.add("Rocambole");
        frutas.add("Melão");

        // remove() procura e remove o elemento informado da lista.
        frutas.remove("Rocambole");

        // Exibe os elementos que permaneceram depois da remoção.
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
