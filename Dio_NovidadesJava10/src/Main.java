import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException{
		
		testar("Hanna");
		printarSoma(2,2,2,2);
	}
		private static void connectJava() throws IOException{
			
			var  url = new URL("https://docs.oracle.com/javase/10/");
			var  urlConnection = url.openConnection();
			var  bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
	}
		
		
	public static void testar(String nome) {
		var sobrenome = nome+" Santos";
		System.out.println(sobrenome);
	}//var nao por ser utilizado em nivel de classe, como parametro,...
	
	public static void printarSoma(int...numeros) {
		var soma=0;
		if(numeros.length>0) {
			soma=1;
			for(var numero:numeros) {
				soma*=numero;
			}
			System.out.println(soma);
		}
	}//nao podemos usar o var sem inicialo;

}
