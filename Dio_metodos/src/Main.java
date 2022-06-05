import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.print("Digite o primeiro valor: ");
		double a = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double b = scan.nextDouble();
		System.out.print(
				"Digite o tipo de operação que deve ser realizada(1-para soma, 2-subtracao, 3-multiplicacao, 4-divisao");
		int operacao = scan.nextInt();
		Calculadora cal = null;

		cal.calcula(a, b, operacao);*/
		Mensagem msg=null;
		msg.mensagem(7);
		msg.mensagem(14);
		msg.mensagem(23);
		
		Emprestimo emp = null;
		emp.emprestimo(1000, 1, 12);
		emp.emprestimo(1000, 1, 13);
		emp.emprestimo(1000, 3, 25);
		scan.close();
	}

}
