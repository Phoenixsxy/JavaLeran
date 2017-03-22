
public class TestThread1 {
	public static void main(String args[]) {
		Runner1 r = new Runner1();
		r.start();
		// r.run();  这个指方法调用，指主线程中断执行方法再回来
		//Thread t = new Thread(r);  实现线程的一种方法
		//t.start();    实现线程的一种方法

		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread:------" + i);
		}

	}
}

//class Runner1 implements Runnable {   实现线程的一种用法
class Runner1 extends Thread{ //实现线程的另一种用法
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1 : " + i);
		}
	}
}

/*!!!推荐使用接口，类继承比较死，接口继承比较灵活*/
