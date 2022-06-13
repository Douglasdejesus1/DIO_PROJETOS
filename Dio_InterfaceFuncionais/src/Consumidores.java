import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		/*-Consumer 
		apenas utiliza o parametro da forma que ele foi reecebido;
		-não há retorno no Consumer
		*/

		//Method Reference
		Consumer<String>imprimirUmaFrase = System.out::println;
		
		Consumer<String>imprimirUmaFrase2 = frase-> System.out.println("oi "+frase);
		imprimirUmaFrase2.accept("hello my world");
		
	}

}
