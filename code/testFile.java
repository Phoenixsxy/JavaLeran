import java.io.File;
import java.io.IOException;

public class testFile {
	public static void main (String args[]){
		String operate=File.separator;//windows�ķ����Ƿ�б��\ Linux������б��/
		String filename="myFile.txt";
		String directory="mydir1"+operate+"mydir2";
		
		File f=new File(directory,filename);
		if(f.exists()){
			System.out.println("�ļ���"+f.getAbsolutePath());
			System.out.println("�ļ���С"+f.length());
		}
		else {
			f.getParentFile().mkdirs();
			try{
				f.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
