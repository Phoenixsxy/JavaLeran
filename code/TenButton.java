import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class TenButton {
	public static void main(String[] args){
		new MyFrame("Java Frame", 300, 400, 300, 200);
	}
}

class MyFrame extends Frame{
	MyFrame(String s,int x,int y,int w,int h) {
		// TODO Auto-generated constructor stub
		Frame f= new Frame(s);
		f.setLayout(new GridLayout(2,1));
		Panel p1=new Panel(new BorderLayout());
		Panel p2=new Panel(new BorderLayout());
		f.add(p1);
		f.add(p2);
		
		
		Button b1=new Button("BUTTON");
		Button b2=new Button("BUTTON");
		Button b3=new Button("BUTTON");
		Button b4=new Button("BUTTON");
		Button b5=new Button("BUTTON");
		Button b6=new Button("BUTTON");
		Button b7=new Button("BUTTON");
		Button b8=new Button("BUTTON");
		Button b9=new Button("BUTTON");
		Button b10=new Button("BUTTON");
		
		Panel panel=new Panel(new GridLayout(2, 1));
		p1.add(b1,BorderLayout.WEST );
		p1.add(b2, BorderLayout.EAST);
		p1.add(panel, BorderLayout.CENTER);
		panel.add(b3);
		panel.add(b4);
	
		Panel pp=new Panel(new GridLayout(2, 2));
		p2.add(b5, BorderLayout.WEST);
		p2.add(b6, BorderLayout.EAST);
		p2.add(pp, BorderLayout.CENTER);
		pp.add(b7);
		pp.add(b8);
		pp.add(b9);
		pp.add(b10);
		f.setLocation(x, y);
		f.setSize(w, h);
		f.pack();
		f.setVisible(true);
	}
}
