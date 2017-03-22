public class ProducerConsumer {
	public static void main(String[] args) {
		Container cc = new Container();
		Consumer consumer = new Consumer(cc);
		Producer product = new Producer(cc);
		new Thread(product).start();
		new Thread(consumer).start();

	}
}

class Product {
	int id;

	Product(int id) {
		this.id = id;
	}

	public String toString() {
		return "Product :" + id;
	}
}

class Container {
	int index = 0;
	Product[] arrPro = new Product[6];

	public synchronized void push(Product p1) {
		while (index == arrPro.length) {// if危险
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 当前对象上的线程停止住,wait必须有人叫醒，wait时，锁就不再归为自己拥有
		}
		this.notify();// 叫醒一个正在对象上wait的线程
		arrPro[index] = p1;
		index++;
	}

	public synchronized Product pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return arrPro[index];
	}

}

class Producer implements Runnable {
	Container cc = null;

	Producer(Container cc) {
		this.cc = cc;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			Product p = new Product(i);
			cc.push(p);
			System.out.println("Produce:" + p);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Container cc = null;

	Consumer(Container cc) {
		this.cc = cc;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			Product p = cc.pop();
			p.toString();
			System.out.println("Consume:" + p);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}