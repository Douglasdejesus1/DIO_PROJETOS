import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GatosOrdenados {

	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
				add(new Gato("Jon", 8, "preto"));
				add(new Gato("Augusto", 6, "tigrado"));
				add(new Gato("jon", 6, "amarelo"));
				add(new Gato("Tigrao", 6, "branco"));
			}};
			
			
			
		System.out.println(meusGatos);
		System.out.println();
		
		System.out.println("Ordem aleatória: ");

		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem natural: ");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem por idade: ");
		//Collections.sort(meusGatos,new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem por cor: ");
		//Collections.sort(meusGatos,new ComparatorIdade());
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("Ordem por nome-cor-idade: ");
		//Collections.sort(meusGatos,new ComparatorIdade());
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}

}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String raca;

	public Gato(String nome, Integer idade, String raca) {
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "{"+"nome=" + nome + ", idade=" + idade + ", raca=" + raca+"}";
	}
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}

}
class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}}
class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getRaca().compareToIgnoreCase(g2.getRaca());
	}}
class ComparatorNomeCorIdade implements Comparator<Gato>{

@Override
public int compare(Gato g1, Gato g2) {
	int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
	if(nome !=0) return nome;
	int cor= g1.getRaca().compareToIgnoreCase(g2.getRaca());
	if(cor !=0) return cor;
	
	return Integer.compare(g1.getIdade(), g2.getIdade());
}}