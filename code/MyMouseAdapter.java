import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class MyMouseAdapter {
	public static void main(String[] args){
		new MyFrame("drawing...");
	}
}

class MyFrame extends Frame{
	ArrayList points=null;
	MyFrame(String s) {
		super(s);//���ø��ࣨFrame�����캯����sΪ����Ĳ���
		points=new ArrayList();
		setLayout(null);
		setBounds(300,300,400,300);
		this.setBackground(new Color(204, 204, 255));
		setVisible(true);
		this.addMouseListener(new Monitor());
	}
	
	public void paint(Graphics g){
		Iterator i=points.iterator();
		while (i.hasNext()) {
			Point p=(Point)i.next();
			g.setColor(Color.BLUE);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
	
	public void addPoint(Point p){
		points.add(p);
	}
}

class Monitor extends MouseAdapter{
	public void mousePressed(MouseEvent e){
		MyFrame f=(MyFrame)e.getSource();
		f.addPoint(new Point(e.getX(), e.getY()));
		f.repaint();//ǿ�ƽ����ػ������û�У���ʱ�޷���ʾ���ø��Ǻ����»���ʱ������ʾ��
	}
}
