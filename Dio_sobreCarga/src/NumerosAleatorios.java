import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] numerosAleatorios = new int[4][4];

		
		for(int i =0; i<numerosAleatorios.length;i++) {
			for(int j =0; j<numerosAleatorios[i].length;j++) {
			int numero = random.nextInt(9);
			numerosAleatorios[i][j]=numero;
		}
		}
		System.out.println("numeros aleatorios:");
		for (int[] linha: numerosAleatorios) {
			for(int coluna: linha) {
			System.out.print(coluna+" ");	
		}
		System.out.println();
		}
	}

}
