package estruturas;

public class Pilha implements Estrutura {
	
	private No referenciaTopo;

	@Override
	public void adicionar(No no) {
		no.setProximo(referenciaTopo);
		referenciaTopo = no;
	}

	@Override
	public No remover() {
		
		No auxiliar = referenciaTopo;
		referenciaTopo = referenciaTopo.getProximo();
		return auxiliar;
	}
	public void imprimir(){
		No aux = referenciaTopo;
		System.out.println("Gibis");
		while (aux!= null) {
			aux.imprimirNo();
			aux = aux.getProximo();
		}
		System.out.println("-------------------");
	}
}