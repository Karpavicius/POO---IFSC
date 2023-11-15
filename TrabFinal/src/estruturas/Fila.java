package estruturas;

public class Fila implements Estrutura {
	
	private No referenciaUltimo;
	private No referenciaPrimeiro;

	@Override
	public void adicionar(No no) {
		if(referenciaPrimeiro != null) {
			
			referenciaUltimo.setProximo(no);
			referenciaUltimo = no;
		}else {
			referenciaPrimeiro = referenciaUltimo = no;
		}
	}

	@Override
	public No remover() {
		
		No auxiliar = referenciaPrimeiro;
		referenciaPrimeiro = referenciaPrimeiro.getProximo();
		return auxiliar;
	}
	
	public void imprimir() {
		No aux = referenciaPrimeiro;
		System.out.println("Pessoas");
		
		while (aux != null) {
			aux.imprimirNo();
			aux = aux.getProximo();
		}
		System.out.println("-------------------");
	}
}