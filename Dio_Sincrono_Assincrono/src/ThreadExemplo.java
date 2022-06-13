
public class ThreadExemplo {

	public static void main(String[] args) {

		GeradorPDF iniciarGerarPdf = new GeradorPDF();
		BarradeCarregamento iniciarBarraDeCarregamento = new BarradeCarregamento(iniciarGerarPdf);
		// Thread thread =new Thread(new BarradeCarregamento2());
		// Thread thread2 = new Thread(new BarradeCarregamento3());

		iniciarGerarPdf.start();
		iniciarBarraDeCarregamento.start();
		// thread2.start();
		// System.out.println("Nome da thread: " + iniciarGerarPdf.getName());
		// System.out.println("Nome da thread: " + thread2.getName());

	}
}

class GeradorPDF extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Iniciando geração de documento");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PDF gerado com sucesso!");
	}
}

class BarradeCarregamento extends Thread {
	private Thread iniciarGerarPdf;

	public BarradeCarregamento(Thread iniciarGerarPdf) {
		this.iniciarGerarPdf = iniciarGerarPdf;
	}

	@Override
	public void run() {
		int soma=0;
		while (true) {
			
			try {
				Thread.sleep(100);
				if (!iniciarGerarPdf.isAlive()) {
					break;
				}
				System.out.println("Loading...");
				soma+=1;
				if(soma==5) {
					System.out.println("Vai logo giringonça");
				}
				if(soma==10) {
					System.out.println("PQP!");
				}
				if(soma==15) {
					System.out.println("É UMA CARROÇA");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class BarradeCarregamento2 implements Runnable {
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Rodei Barra de Carregamento2: ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BarradeCarregamento3 implements Runnable {
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Rodei barra de carregamento3: ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
