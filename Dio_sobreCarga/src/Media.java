import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int maior = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero");
			int numero = sc.nextInt();
			soma = soma + numero;
			if (maior < numero) {
				maior = numero;
			}
		}
		System.out.println("O maior numero é: "+maior);
		
		System.out.println("A média é: "+(soma/5));

	}

}
