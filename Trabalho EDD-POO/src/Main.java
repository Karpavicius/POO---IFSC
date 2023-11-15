import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

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

		LinkedList<NoPessoa> fila = new LinkedList<NoPessoa>();

		Stack<NoGibi> pilha = new Stack<NoGibi>();

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
				
				pilha.push(noGibi);
			break;
			case 2:
				Pessoa LuquinhasDaGalera = new Pessoa(JOptionPane.showInputDialog("Nome da Pessoa: " + "\n"));
				NoPessoa noPessoa = new NoPessoa(LuquinhasDaGalera);
				
				fila.add(noPessoa);
			break;
			case 3:				
				operacoes.put(fila.poll().getPessoa(), pilha.pop().getGibi());
			break;
			case 4:
				for(int i = 0; i < pilha.size(); i++) {
					JOptionPane.showMessageDialog(null, pilha.get(i).getGibi().getTitulo());
				}
			break;	
			case 5:
				for(int i = 0; i < fila.size(); i++) {
					JOptionPane.showMessageDialog(null, fila.get(i).getPessoa().getNome());
				}
			break;
			case 6:
				a = 0;
			break;
			}
		}while(a == 1);
		
	}
	
}