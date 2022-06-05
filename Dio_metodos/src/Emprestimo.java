
public class Emprestimo {
	public static void emprestimo(double valorPego, double juros, int parcelas) {
		if (parcelas>=6 &&parcelas<=12) {
			double resultado = valorPego*(1+(juros/100)*.9)*parcelas;
			System.out.println(resultado);
		}
		else if (parcelas>=12 &&parcelas<=24) {
			double resultado = valorPego*(1+(juros/100))*parcelas;
			System.out.println(resultado);
		}
		else {
			System.out.println("Valor de parcelas excedido ao permitido!");
		}
	
		}
}
