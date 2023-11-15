import java.util.HashMap;
import javax.swing.JOptionPane;
import entidades.Gibi;
import entidades.Pessoa;
import estruturas.Fila;
import estruturas.No;
import estruturas.NoGibi;
import estruturas.NoPessoa;
import estruturas.Pilha;

/**
 * Na Main, implemente um menu onde se possa adicionar pessoas no fim da fila,
 * adicionar gibis no topo da pilha e atender pessoas (entregar um gibi). Quando
 * uma pessoa é atendida, deve-se armazenar no HashMap operacoes a relação
 * Pessoa x Gibi.
 * 
 * @author Lucas
 * @author Mauricio
 * @author Evelin
 * @author Mateus
 */
public class Main {

	static HashMap<Pessoa, Gibi> operacoes = new HashMap<Pessoa, Gibi>();

	public static void main(String[] args) {

		
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		int a = 1;
		do {
			switch(Integer.parseInt(JOptionPane.showInputDialog("1: Adicionar Gibi"+"\n"+"2: Inserir pessoas na fila"+
					"\n"+"3: Entregar Gibi"+
					"\n"+"4: Imprimir a pilha"+
					"\n"+"5: Imprimir a fila"+
					"\n"+"6: Sair"+"\n"))){
			case 1:
				Gibi GibizinhoDaXuxa = new Gibi(JOptionPane.showInputDialog("T�tulo do Gibi: " + "\n"));
				NoGibi noGibi = new NoGibi(GibizinhoDaXuxa);
				
				pilha.adicionar(noGibi);
			break;
			case 2:
				Pessoa LuquinhasDaGalera = new Pessoa(JOptionPane.showInputDialog("Nome da Pessoa: " + "\n"));
				NoPessoa noPessoa = new NoPessoa(LuquinhasDaGalera);
				
				fila.adicionar(noPessoa);
			break;
			case 3:
				NoPessoa noAuxiliar1 = (NoPessoa)fila.remover();
				NoGibi noAuxiliar2 = (NoGibi)pilha.remover();
				
				operacoes.put(noAuxiliar1.getPessoa(), noAuxiliar2.getGibi());
			break;
			case 4:
				pilha.imprimir();
			break;	
			case 5:
				fila.imprimir();
			break;
			case 6:
				a = 0;
			break;
			}
		}while(a == 1);
		
	}
	
}