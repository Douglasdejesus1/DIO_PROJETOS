import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Quantas numeros voce quer ler?");
		int rep =sc.nextInt();
		int par = 0;
		int impar=0;
		
		for(int i=0;i<rep;i++) {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			if (numero%2==0) {
				par =par+1;
			}else {
				impar=impar+1;
			}
		}
		System.out.println("temos "+par+" numeros pares");
		System.out.println("temos "+impar+" numeros impares");

	}

}
