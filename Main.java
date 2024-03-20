import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
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