
public class Calculadora {
	public static void calcula(double a, double b, int operacao) {
		if (operacao == 1) {
			double resultado = a + b;
			System.out.println(resultado);
		}
		if (operacao == 2) {
			double resultado = a - b;
			System.out.println(resultado);
		}
		if (operacao == 3) {
			double resultado = a * b;
			System.out.println(resultado);
		}
		if (operacao == 4) {
			double resultado = a/ b;
			System.out.println(resultado);
		}
	}
}
