
public class FatorialTailCall {

	public static void main(String[] args) {
		System.out.println(fatorial(12130));

	}

	public static double fatorial(double valor) {
			return fatorialComTailCall(valor,1);
	}
	public static double 	fatorialComTailCall(double valor, double numero) {
		if(valor==0) {
			return numero;
		}
	return fatorialComTailCall(valor-1,numero*valor);
	}

}
