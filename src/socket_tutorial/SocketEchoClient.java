package socket_tutorial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketEchoClient {

	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("127.23.64.1",9999);
			System.out.println("Connection Success!");
			
			Scanner scan = new Scanner(System.in);
			
			String message = scan.nextLine();
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF(message);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("Receive : "+dis.readUTF());
			
			dis.close();
			dos.close();
			socket.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
