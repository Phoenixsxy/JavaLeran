import java.io.File;
import java.io.IOException;

public class testFile {
	public static void main (String args[]){
		String operate=File.separator;//windows的符号是反斜杠\ Linux的是正斜杠/
		String filename="myFile.txt";
		String directory="mydir1"+operate+"mydir2";
		
		File f=new File(directory,filename);
		if(f.exists()){
			System.out.println("文件名"+f.getAbsolutePath());
			System.out.println("文件大小"+f.length());
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
