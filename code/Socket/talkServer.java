import java.io.*;
import java.net.*;

public class talkServer {
	public static void main(String[] args) throws IOException {
		
		//建立通信通道
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);//设置监听一个端口 port
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Can't listen to " + e);
		}
		Socket socket = null;
		try {
			socket = server.accept();//自己创建一个socket(插销），允许远程client可以访问。
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//建立对话机制
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os=new PrintWriter(socket.getOutputStream());
		BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String readLine=in.readLine();
		while(!readLine.equals("bye")){
			os.println(readLine);
			os.flush();
			System.out.println("Server:"+readLine);
			System.out.println("Client:"+is.readLine());
			readLine=in.readLine();
		}
		os.close();
		is.close();
		socket.close();
	}
}
