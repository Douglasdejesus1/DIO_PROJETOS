
public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		
		Calculo soma=(a,b)->a+b;
		Calculo subtr=(a,b)->a-b;
		System.out.println(execultarOperacao(soma,1,3));
		System.out.println(execultarOperacao(subtr,1,3));
	}
	public static int execultarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}

}
interface Calculo {
	public int calcular(int a, int b);
}