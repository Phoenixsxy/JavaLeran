import java.util.Date;

public class TestInterrupt {
	public static void main(String args[]) {
		MyThread thread=new MyThread();
		thread.start();//从thread类继承的,否则需要new一个thread对象
		try{
			Thread.sleep(10000);//在哪个线程使用sleep方法，哪个线程睡眠
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
			//thread.interrupt(); 这样不好，相当于给睡眠的线程泼凉水，会进到InterruptedException异常
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
				return;//线程结束
			}
		}
	}
}