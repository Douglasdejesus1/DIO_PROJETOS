import java.util.Collection;
import java.util.List;

public class CollectionExemplo {

	public static void main(String[] args) {
		//Collection<String> nomes = Arrays.asList("Joao", "Paulo", "Oliveira", "Santos");
        Collection<String> nomes = List.of("Joao", "Paulo", "Oliveira", "Santos"); //List.of, Set.of

        System.out.println(nomes);
    }
}
