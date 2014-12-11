import java.util.HashSet;
import java.util.Set;


public class Colecoes2 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		nomes.add("Guilherme");
		nomes.add("Renan");
		nomes.add("Aerton");
		nomes.add("Beatriz");
		nomes.add("Renan");
		
		System.out.println(nomes.size());
		
		Set<Conta> contas = new HashSet<Conta>();
		Conta c1 = new Conta(100.0, "Guilherme");
		Conta c2 = new Conta(100.0, "Leonardo");
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());

	}
}