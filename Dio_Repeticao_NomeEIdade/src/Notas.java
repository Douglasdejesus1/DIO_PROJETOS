import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nota de Zero a Dez: ");
		int nota = sc.nextInt();
		
		while (nota<0||nota>10) {
			System.out.println("Nota invalida!");
			System.out.println("Digite uma nota de Zero a Dez: ");
			nota = sc.nextInt();
		}
		System.out.println("Nota registrada com sucesso");

	}

}
