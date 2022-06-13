import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {
		
		Function<String,String> retornarNomeAoContrario  = texto-> new StringBuilder(texto)
				.reverse().toString().toUpperCase();
		
		Function<String,Integer> retornarInteiro = string -> Integer.valueOf(string);
		
		//Method Reference
		Function<String,Integer> retornarInteiro2 = Integer::valueOf;
		
		System.out.println(retornarNomeAoContrario.apply("flavia"));
		System.out.println(retornarInteiro2.apply("2343"));
	}

}
