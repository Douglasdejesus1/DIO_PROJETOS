
public class Main {

	public static void main(String[] args) {
		/*	Os lambdas obdecem obdecem o conceito do paradigma funcional,
		 * com eles podemos facilitar legibilidade do nosso código, 
		 * alem disso com a nova API Funcional do java podemos ter 
		 * uma alta produtividade para lidar com objetos.
		 * Primeiramente, devemos entender o que são inferfaces 
		 * funcionais.
		 */
		
		/*As Interfaces funcionais sao intefaces que possuem apenas
		 * um método abstrato
		 */
		
		/*InterfaceFuncional nomeVariavel = parametro ->logica
		 * 
		 */
		
		Funcao1 gerarUmaSaida =valor -> {
		System.out.println("Sr. "+valor);
		System.out.println("ou melhor, Mestre "+valor);
		};
		gerarUmaSaida.gerar("Douglas");
		//System.out.println(gerarUmaSaida.gerar("Jaao Paulo"));
		
		
	}

}
@FunctionalInterface
interface Funcao1{
	void gerar(String valor);
	// String gerar2(String valor);
	
}
