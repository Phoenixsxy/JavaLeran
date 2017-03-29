import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldMath {
	public static void main(String[] args) {
		new TFFrame().launchFrame();
	}
}

class TFFrame extends Frame {

	TextField num1, num2, num3;

	public void launchFrame() {
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lbPlus = new Label("+");
		Button btnEqual = new Button("=");
		btnEqual.addActionListener(new MyMonitor());// 持有对方的引用

		setLayout(new FlowLayout());
		add(num1);
		add(lbPlus);
		add(num2);
		add(btnEqual);
		add(num3);
		pack();
		setVisible(true);
	}

	class MyMonitor implements ActionListener {
		public void actionPerformed(ActionEvent e){
			// TODO Auto-generated method stub
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
		    num3.setText("" + (n1 + n2));
		}

	}
}

/*
 * class MyMonitor implements ActionListener {
 * 
 * // TextField num1, num2, num3; // // MyMonitor(TextField num1, TextField
 * num2, TextField num3) { // // TODO Auto-generated constructor stub //
 * this.num1 = num1; // this.num2 = num2; // this.num3 = num3; // }
 * 
 * TFFrame tf=null;
 * 
 * public MyMonitor(TFFrame tf) { // TODO Auto-generated constructor stub
 * this.tf=tf; }
 * 
 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
 * method stub int n1 = Integer.parseInt(tf.num1.getText()); int n2 =
 * Integer.parseInt(tf.num2.getText()); tf.num3.setText("" + (n1 + n2)); }
 * 
 * }
 */