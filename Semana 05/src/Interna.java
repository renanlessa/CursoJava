
public class Interna {
	private int x = 10;
	private ClasseInterna teste;
	
	Interna() {
		teste = new ClasseInterna();
	}
	public void imprimeMensagem() {
		teste.imprimeMensagem();
	}
	//Classe interna
	class ClasseInterna {
		
		private int x = 10;
		
		ClasseInterna() {
			System.out.println("Chamando construtor...");
		}
		
		public void imprimeMensagem() {
			System.out.println("Imprime mensagem da classe interna.");
		}
	}
}