import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {

	public void iniciarCliente(String ip, int porta) throws IOException {

		enviarMensagem(ip, porta, "oi");
		enviarMensagem(ip, porta, "me responde!");
		enviarMensagem(ip, porta, "por favor...");
		enviarMensagem(ip, porta, "tchau");
	}

	private void enviarMensagem(String ip, int porta, String mensagem) throws IOException {

		InetAddress addr = InetAddress.getByName(ip);
		DatagramPacket pkg = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, addr, porta);
		DatagramSocket ds = new DatagramSocket();
		ds.send(pkg);
		ds.close();
	}

}
