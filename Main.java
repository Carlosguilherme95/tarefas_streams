import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

public class Main {
    @Test
    public void testeUm() {
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Carlos-M");
        pessoas.add("Vitor-M");
        pessoas.add("Gustavo-M");
        pessoas.add("Luana-F");
        pessoas.add("Marcia-F");
        pessoas.add("Rose-F");

        List<String> mulheres = pessoas.stream().filter(p -> p.endsWith("-F")).toList();

        // Verificar se todas as pessoas na lista "mulheres" terminam com "-F"
        assertTrue("A lista de mulheres não pode estar vazia", !mulheres.isEmpty());
        for (String mulher : mulheres) {
            assertTrue("O nome da mulher não termina com '-F'", mulher.endsWith("-F"));
        }
    }

    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Carlos-M");
        pessoas.add("Vitor-M");
        pessoas.add("Gustavo-M");
        pessoas.add("Luana-F");
        pessoas.add("Marcia-F");
        pessoas.add("Rose-F");
        System.out.println(pessoas);
        List<String> mulheres = pessoas.stream().filter(p -> p.endsWith("-F")).toList();
        System.out.println(mulheres);
       
    }
}