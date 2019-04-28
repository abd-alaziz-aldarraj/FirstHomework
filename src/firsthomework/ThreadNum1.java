// 2 marks
package firsthomework;

//النيسب الاول
public class ThreadNum1 extends Thread {

	BlockingQueue q1; // 1/2 marks

	public ThreadNum1(BlockingQueue q) { // 1/2 marks
		this.q1 = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) { // 1/2 marks
			try {
				q1.add("f" + i + ".txt"); // 1/2 marks
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
