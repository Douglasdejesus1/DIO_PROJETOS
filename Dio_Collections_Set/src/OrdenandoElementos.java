import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenandoElementos {

	public static void main(String[] args) {
		System.out.println("Ordem aleatoria: ");
		Set<Serie> minhasSeries = new HashSet<>() {
			{
				add(new Serie("Got", "fantasia", 60));
				add(new Serie("Dark", "drama", 60));
				add(new Serie("that '70s show", "comedia", 25));
			}
		};

		for (Serie serie : minhasSeries) {
			System.out.println(serie);
		}
		
		System.out.println();
		System.out.println("Set ordenado: ");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
			{
				add(new Serie("Got", "fantasia", 60));
				add(new Serie("Dark", "drama", 61));
				add(new Serie("that '70s show", "acomedia", 26));
				add(new Serie("Friends", "comedia", 25));
			}
		};
		for (Serie serie : minhasSeries1) {
			System.out.println(serie);
		}
		System.out.println();
		System.out.println("Ordem natural(Tempo de Epsodio): ");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		//System.out.println(minhasSeries2);
		for (Serie serie : minhasSeries2) {
			System.out.println(serie);
		}
	}

}

class Serie implements Comparable<Serie> {

	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;

	}

	@Override
	public String toString() {
		return "{nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "}";
	}

	/*@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0)
			return tempoEpisodio;
		int genero = getGenero().compareTo(serie.getGenero());
		if (genero != 0)
			return genero;
		return this.getNome().compareTo(serie.getNome());

	}*/
	@Override
	public int compareTo(Serie serie) {
		int genero = getGenero().compareTo(serie.getGenero());
		if (genero != 0)
			return genero;
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0)
			return tempoEpisodio;
		return this.getNome().compareTo(serie.getNome());

	}

}
