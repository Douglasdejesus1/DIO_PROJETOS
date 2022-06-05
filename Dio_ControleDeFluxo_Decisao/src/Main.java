import java.util.Scanner;

public class Main {
	 
		Scanner sc = new Scanner(System.in);

		System.out.print("Escolha um mês de 1 a 12: ");
		int esc = sc.nextInt();

		if (esc == 1) {
			System.out.println("janeiro");
		} else if (esc == 2) {
			System.out.println("fevereiro");
		} else if (esc == 3) {
			System.out.println("marco");
		} else if (esc == 4) {
			System.out.println("abril");
		} else if (esc == 5) {
			System.out.println("maio");
		} else if (esc == 6) {
			System.out.println("junho");
		} else if (esc == 7) {
			System.out.println("julho");
		} else if (esc == 8) {
			System.out.println("agosto");
		} else if (esc == 9) {
			System.out.println("setembro");
		} else if (esc == 10) {
			System.out.println("outubro");
		} else if (esc == 11) {
			System.out.println("novembro");
		} else if (esc == 12) {
			System.out.println("dezembro");
		}
		if(esc==1||esc==7||esc==12) {
			System.out.println("Férias");
		}
		
		

	}
}