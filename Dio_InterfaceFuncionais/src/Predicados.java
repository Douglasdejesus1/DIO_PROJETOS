import java.util.function.Predicate;

public class Predicados {

	public static void main(String[] args) {
		//recebem um parametro e retornam um boolean
		Predicate<String>estaVazio= valor ->valor.isEmpty();
		
		//Reference method
		Predicate<String>estaVazio2= String::isEmpty;
		System.out.println(estaVazio2.test(""));
		System.out.println(estaVazio2.test("oi"));
		
	}

}

