
public class Mensagem {

	public static void mensagem(int hora) {
		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia! agora são " + hora);
		}
		else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde! agora são " + hora);
		}
		else if ((hora >= 18 && hora < 24)||(hora >= 0 && hora < 6)) {
			System.out.println("Boa noite! agora são " + hora);
		}
		
	}

}
