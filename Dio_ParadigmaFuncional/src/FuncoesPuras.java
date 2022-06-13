import java.util.function.BiPredicate;

public class FuncoesPuras {
	public static void main(String[] args) {
		// funções puras sao funções quando chamadas mais de uma vez produzem o mesmo
		// resultado
		BiPredicate<Integer, Integer> verificarSeEMaior =
				(parametro, valorComparacao)-> parametro<valorComparacao;
				
				System.out.println((verificarSeEMaior.test(13, 12)));
				System.out.println((verificarSeEMaior.test(12, 13)));
		//conceitos fundamentais da programacao funcional:
				//imutabilidade: 

	}
}