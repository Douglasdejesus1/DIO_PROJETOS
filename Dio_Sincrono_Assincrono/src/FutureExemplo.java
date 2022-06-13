import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;



public class FutureExemplo {
	private static final ExecutorService pessoasParaRealizarAtividades = Executors.newFixedThreadPool(3);
	public static void main(String[] args) {
		Casa casa = new Casa(new Quarto());
	
		List<? extends Future<String>> futuros = 
		new CopyOnWriteArrayList<>(casa.obterAfazeresDeCasa().stream()
				.map(atividade -> pessoasParaRealizarAtividades.submit(()->{
							try {
						return atividade.realizar();
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
							return null;
				})
							)
				.collect(Collectors.toList()));
		
		
		
		
		while(true) {
			int numeroDeAtividadesNaoFinalizadas=0;
			for(Future<?>futuro:futuros) {
				if(futuro.isDone()) {
					try {
						System.out.println("Parabens voce termino de "+futuro.get());
						futuros.remove(futuro);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					numeroDeAtividadesNaoFinalizadas++;
				}
			};
			System.out.println("Numero de atividades nao finalizadas: "+numeroDeAtividadesNaoFinalizadas);
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(futuros.stream().allMatch(Future::isDone)){
				break;
			}
		}
		
		
		
		pessoasParaRealizarAtividades.shutdown();
		
	}

}
class Casa{
	private List<Comodo> comodos;
	
	Casa(Comodo...comodos){this.comodos=Arrays.asList(comodos);}
	
	List<Atividade> obterAfazeresDeCasa(){
		return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
				.reduce(new ArrayList<Atividade>(), (pivo,atividades)->{
				pivo.addAll(atividades);
				return pivo;
	});
	}
}

interface Atividade{
	String realizar() throws InterruptedException;
}

abstract class Comodo{
	abstract List<Atividade> obterAfazeresDoComodo();
	
}
class Quarto extends Comodo{
	@Override
	List<Atividade> obterAfazeresDoComodo() {
		return Arrays.asList(
				this::arrumarACama,
				this::varrerOQuarto,
				this::arrumarGuardaRoupa
				);

}
	
private String arrumarGuardaRoupa() {
	try {
		Thread.sleep(9);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	String arrumar_o_guarda_roupa ="Arrumar o guarda roupa";
	System.out.println(arrumar_o_guarda_roupa);
	return arrumar_o_guarda_roupa;
	}

private String varrerOQuarto() {
	try {
		System.out.println("Arrumar o quarto comecando");
		Thread.sleep(19);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String varrerOQuarto ="Arrumar o quarto finalizado";
	System.out.println(varrerOQuarto);
	return varrerOQuarto;
	}

private String arrumarACama() {
	try {
		Thread.sleep(31);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String arrumarACama = "Arrumar a cama";
	System.out.println(arrumarACama);
	return  arrumarACama;
	}
}