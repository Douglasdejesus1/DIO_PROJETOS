
public class FuncaoComLambida {
	public static void main(String[] args) {

		Funcao colocarPrefixoNaStrung = valor-> "Sr. "+valor;
		System.out.println(colocarPrefixoNaStrung.gerar("gerar"));
	}
}
