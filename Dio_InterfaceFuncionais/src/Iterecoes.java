import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterecoes {

	public static void main(String[] args) {

		String[] nomes = { "João", "Douglas", "Hanna", "João" };
		Integer[] numeros = { 1, 2, 3, 4, 5 };
		imprimirODobroDeCadaItemDaLista(numeros);
		//imprimirNomesFiltrados(nomes);
		//imprimirTodosNomes(nomes);
		
		List<String>profissoes = new ArrayList<>();
		profissoes.add("Desenvolvedor de java");
		profissoes.add("Testador");
		profissoes.add("Gerente de Projeto");
		profissoes.add("Gerente de Qualidade");
		profissoes.stream()
		.filter(profissao->profissao.startsWith("Gerente"))
		.forEach(System.out::println);
	}

	public static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaImprimir = "";
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("João")) {
				nomesParaImprimir += " " + nomes[i];
			}
		}
		System.out.println("Nomes do for: " + nomesParaImprimir);

		String nomesParaImprimir2 = Stream.of(nomes)
				.filter(nome -> nome.equals("João"))
				.collect(Collectors.joining()); // String

		System.out.println("Nomes do Collector: " + nomesParaImprimir2);

	}
	public static void imprimirTodosNomes(String...nomes) {
		/*for (String nome: nomes) {
			System.out.println("Impressos pelo for: "+nome);
		}*/
		//Stream.of(nomes).forEach(System.out::println);
		Stream.of(nomes).forEach(nome-> 
		System.out.println("Imprimindo pelo forEach: "+nome));
		
	}
	public static void imprimirODobroDeCadaItemDaLista(Integer...numeros) {
		for(Integer numero: numeros) {
			System.out.println("Impresso pelo for: "+numero*2);
		}
		Stream.of(numeros).map(numero->numero*2).forEach(numero->
		System.out.println("Impresso pelo forEach: "+numero));
		Stream.of(numeros).map(numero->numero*2).forEach(System.out::println);
	}
}
