import java.io.IOException;

public class Main {

	public static void main(String[] args) {		

		boolean ehServidor = true;
		ehServidor = false;

		if (ehServidor) {			
			try {				
				Servidor servidor = new Servidor();
				servidor.iniciarServidor();
			} catch (IOException e) {
				
				System.out.println("Erro no servidor.");
			}			
		} else {
			try {
				Cliente cliente = new Cliente();
				cliente.iniciarCliente("localhost", 1024);
			} catch (IOException e) {				
				System.out.println("Erro no cliente.");
			}
		}
	}
}