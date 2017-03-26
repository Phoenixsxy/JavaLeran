import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class CenterPanel {
	public static void main(String[] args){
		//MyFrame myFrame=new MyFrame("MyFrame", 300, 300, 400, 300);
		new MyFrame("MyFrame", 500, 300, 500, 300);
	}
}

class MyFrame extends Frame{
	MyFrame(String s,int x,int y,int w,int h) {
		// TODO Auto-generated constructor stub
		super(s);
		setLayout(null);
		Panel p=new Panel();
		p.setBackground(Color.YELLOW);
		p.setBounds(x/4, y/4, w/2, h/2);
		add(p);
		setBackground(Color.BLUE);
		setBounds(x,y,w,h);
		setVisible(true);
	}
}
