import java.util.Date;

public class TestInterrupt {
	public static void main(String args[]) {
		MyThread thread=new MyThread();
		thread.start();//��thread��̳е�,������Ҫnewһ��thread����
		try{
			Thread.sleep(10000);//���ĸ��߳�ʹ��sleep�������ĸ��߳�˯��
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
			//thread.interrupt(); �������ã��൱�ڸ�˯�ߵ��߳�����ˮ�������InterruptedException�쳣
			thread.flag=false;
	}
}

class MyThread extends Thread {
	boolean flag=true;
	public void run() {
		while (flag) {
			System.out.println("===" + new Date() + "===");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;//�߳̽���
			}
		}
	}
}