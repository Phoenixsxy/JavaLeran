
public class TestSync implements Runnable {
	Timer timer = new Timer();

	public static void main(String args[]) {
		TestSync test = new TestSync();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}

	public void run() {
		timer.add(Thread.currentThread().getName());
	}
}

class Timer {
	private static int num = 0;

	public synchronized void add(String name) { //简便写法，当前对象被锁定
		//synchronized (this) {//锁定，当一个进程执行时，就锁定
			num++;
			try {
				Thread.sleep(1);// 为了另一个程序执行，看出被打断的效果。
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name + ", 你是第" + num + "个使用timer的线程");
		}

}