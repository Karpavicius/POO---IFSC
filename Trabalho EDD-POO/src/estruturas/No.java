package estruturas;

public abstract class  No {
	private No proximo;	
	
	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public abstract void imprimirNo();
}