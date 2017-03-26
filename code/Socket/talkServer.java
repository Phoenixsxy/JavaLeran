import java.io.*;
import java.net.*;

public class talkServer {
	public static void main(String[] args) throws IOException {
		
		//����ͨ��ͨ��
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);//���ü���һ���˿� port
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Can't listen to " + e);
		}
		Socket socket = null;
		try {
			socket = server.accept();//�Լ�����һ��socket(������������Զ��client���Է��ʡ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�����Ի�����
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
