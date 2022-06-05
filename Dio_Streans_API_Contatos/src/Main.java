import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		System.out.println("Primima todos elementos dessa List:");
		// System.out.println(numerosAleatorios.toString());

		/*
		 * numerosAleatorios.stream().forEach(new Consumer<String>() {
		 * 
		 * @Override public void accept(String s) { System.out.println(s); } });
		 */

		// numerosAleatorios.stream().forEach(s->System.out.println(s));

		// numerosAleatorios.forEach(s->System.out.println(s));
		// numerosAleatorios.forEach(System.out::println);

		System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set: ");
		Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
		// .forEach(System.out::println);
		System.out.println(collectSet);

		System.out.println("Transforme esta lista de string em uma lista de numeros inteiros:");
		/*
		 * numerosAleatorios.stream().map(new Function<String, Integer>() {
		 * 
		 * @Override public Integer apply(String s) { return Integer.parseInt(s);
		 */
		// numerosAleatorios.stream().map(s->Integer.parseInt(s));
		List<Integer>numeroAleatoriosInteger =numerosAleatorios.stream(). // Stream<String>
				map(Integer::parseInt) // Stream<Integer>
				.collect(Collectors.toList()); // List<Integer>
				//.forEach(System.out::println);

		System.out.println("Pegue os números pares e maiores que 2 e coloque em um lista");

		/*
		 * numerosAleatorios.stream() .map(Integer::parseInt) .filter(new
		 * Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer i) { if(i%2==0&&i>2) return true;
		 * return false; } }).collect(Collectors.toList())
		 * .forEach(System.out::println);
		 */
		System.out.println();
		numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > -12)
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Qual a media dos meus numero?");
		/*
		 * numerosAleatorios.stream() .mapToInt(new ToIntFunction<String>() {
		 * 
		 * @Override public int applyAsInt(String s) { return Integer.parseInt(s); } });
		 */
		numerosAleatorios.stream()
				// .mapToInt(s->Integer.parseInt(s));
				.mapToInt(Integer::parseInt).average()
				/*
				 * .ifPresent(new DoubleConsumer() {
				 * 
				 * @Override public void accept(double value) { System.out.println(value); } });
				 */
				//.ifPresent(v->System.out.println(v));
				.ifPresent(System.out::println);
		System.out.println("Remova os valores impares: ");
		/*numeroAleatoriosInteger.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				if(integer%2!=0) return true;
				return false;
			}
		});*/
		numeroAleatoriosInteger.removeIf(integer->integer%2!=0);
		
		System.out.println(numeroAleatoriosInteger);
	}
}
