import java.util.function.Supplier;

public class Supridores {

	public static void main(String[] args) {

		Supplier<Pessoa>suppliers = () -> new Pessoa();
		Supplier<Pessoa>suppliers2 = Pessoa::new;
		System.out.println(suppliers2.get());
	}

}
class Pessoa{
	private String nome;
	private Integer idade;
	public Pessoa() {
		nome = "Douglas";
		idade = 31;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
