import java.util.LinkedList;
import java.util.List;


public class Colecoes1 {

	public static void main(String[] args) {
		List<String> nomes = new LinkedList<String>();
		nomes.add("Guilherme");
		nomes.add("Renan");
		nomes.add("Aerton");
		nomes.add("Beatriz");
		nomes.add("Renan");
		
		System.out.println(nomes.size());
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(4));

	}
}