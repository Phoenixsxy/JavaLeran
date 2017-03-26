import java.io.IOException;
import java.net.*;

public class testUDPServer {
	public static void main(String[] args) throws IOException{
		byte buf[]=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		DatagramSocket ds = new DatagramSocket(5678);
		while(true){
			ds.receive(dp);
			System.out.println(new String(buf,0,dp.getLength()));
		}
	}
}
