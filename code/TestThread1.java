
public class TestThread1 {
	public static void main(String args[]) {
		Runner1 r = new Runner1();
		r.start();
		// r.run();  ���ָ�������ã�ָ���߳��ж�ִ�з����ٻ���
		//Thread t = new Thread(r);  ʵ���̵߳�һ�ַ���
		//t.start();    ʵ���̵߳�һ�ַ���

		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread:------" + i);
		}

	}
}

//class Runner1 implements Runnable {   ʵ���̵߳�һ���÷�
class Runner1 extends Thread{ //ʵ���̵߳���һ���÷�
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1 : " + i);
		}
	}
}

/*!!!�Ƽ�ʹ�ýӿڣ���̳бȽ������ӿڼ̳бȽ����*/
