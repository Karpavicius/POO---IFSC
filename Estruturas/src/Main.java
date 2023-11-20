import java.util.HashMap;

import entidades.Gibi;
import entidades.Pessoa;

/**
 * No restante do projeto, implemente os métodos faltantes.
 * 
 * Na Main, implemente um menu onde se possa adicionar pessoas no fim da fila,
 * adicionar gibis no topo da pilha e atender pessoas (entregar um gibi). Quando
 * uma pessoa é atendida, deve-se armazenar no HashMap operacoes a relação
 * Pessoa x Gibi.
 * 
 * @author Lucas
 * @author Mauricio
 * @author IntegranteA
 * @author IntegranteB
 */
public class Main {

	private static HashMap<Pessoa, Gibi> operacoes;

	public static void main(String[] args) {

		operacoes = new HashMap<Pessoa, Gibi>();
	}
}