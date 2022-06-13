
public class FuncaoComClasseAnonima {

	public static void main(String[] args) {
		Funcao colocarPrefixoSenhorNaString = new Funcao() {
			@Override
			public String gerar(String valor) {return "Sr. "+valor;}
			
		};
		System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
		System.out.println(colocarPrefixoSenhorNaString.gerar("Douglas"));
		System.out.println(colocarPrefixoSenhorNaString.gerar("Lucas"));
		System.out.println(colocarPrefixoSenhorNaString.gerar("Rodrigo"));
		System.out.println(colocarPrefixoSenhorNaString.gerar("Marley"));
	}

}
