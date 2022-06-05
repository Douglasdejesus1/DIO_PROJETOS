import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Livros {
	public static void main(String[] args) {
		System.out.println("Ordem aleatória: ");
		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Howkin,Stephen", new Livro("Uma Breve Historia do tempo", 256));
				put("Duhigg, Charles", new Livro("O poder do hábito", 408));
				put("Harari,Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
			}
		};

		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		System.out.println();
		
		System.out.println("Na ordem de insercao: ");
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {
			{
				put("Howkin,Stephen", new Livro("Uma Breve Historia do tempo", 256));
				put("Duhigg, Charles", new Livro("O poder do hábito", 408));
				put("Harari,Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
			}
		};
		for (Map.Entry<String, Livro> livro1 : meusLivros2.entrySet())
			System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
		System.out.println();
		
		System.out.println("Ordem alfabetica dos autores: ");
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);

		for (Map.Entry<String, Livro> livro2 : meusLivros3.entrySet())
			System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
		System.out.println();
		
		System.out.println("Ordem alfabetica dos livros: ");
		Set<Map.Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
		meusLivros4.addAll(meusLivros.entrySet());
		//System.out.println(meusLivros4);
		for (Map.Entry<String, Livro> livro2 : meusLivros4)
			System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
		
		
		
	}
	
}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

}
class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		
		
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
}