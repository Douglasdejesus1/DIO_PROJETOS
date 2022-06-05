import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//java.util.Set
		//Não permite duplicados nem há indice(posicao)
		
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7.0,8d,5d,9d,9.5,0d,7d));
		System.out.println(notas);
		//nao ficou na ordem de incersao e nao repetiu numeros;
		System.out.println("Exiba a posicao do 5 elemento");
		//nao é possivel acessar determinado elemento e nao há o metodo get
		//tbm nao é possivel trocar um elemento especifico igual o 7.0;
		System.out.println("Confira se a nota 5.0 está contido no conjunto: "+notas.contains(5d));
		System.out.println("Confira se a nota 5.5 está contido no conjunto: "+notas.contains(5.5));
		System.out.println("Exiba a menor nota: "+Collections.min(notas));
		System.out.println("Exiba a maior nota: "+Collections.max(notas));
		
		//usando o iterator para somar elementos
		Iterator<Double>iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()){
			Double next = iterator.next();
			soma+=next;
		}
		System.out.println("Exiba a soma dos valores: "+soma);
		System.out.println("Exiba a media dos valores: "+(soma/notas.size()));
		
		System.out.println("Remova a nota zero: "+notas.remove(0.0));
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que sete: ");
		Iterator<Double>iteratorR = notas.iterator();
		while(iteratorR.hasNext()) {
			Double next = iteratorR.next();
			if(next<7.0) iteratorR.remove();
		}
		System.out.println(notas);
		System.out.println("notas 2: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7.d);
		notas2.add(6.d);
		notas2.add(0.d);
		notas2.add(5.d);
		notas2.add(9.d);
		notas2.add(9.d);
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto");
		notas.clear();
		System.out.println("Conjunto vazio?"+notas.isEmpty());
		
		
		
	}

}
