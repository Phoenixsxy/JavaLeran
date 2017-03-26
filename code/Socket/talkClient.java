
import java.io.*;
import java.net.*;;

public class talkClient {
	public static void main(String[] args) throws IOException {
		
		//建立插销
		Socket s=null;
		try {
			s = new Socket("127.0.0.1", 7777);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//建立对话机制
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os=new PrintWriter(s.getOutputStream());
		BufferedReader is=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String readLine=in.readLine();
		while(!readLine.equals("bye")){
			os.println(readLine);
			os.flush();
			System.out.println("Client:"+readLine);
			System.out.println("Server:"+is.readLine());
			readLine=in.readLine();
		}
		os.close();
		is.close();
		s.close();
	}
}
