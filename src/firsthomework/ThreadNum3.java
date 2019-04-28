// 2 marks
package firsthomework;


import java.io.IOException;
//النيسب الثالث
public class ThreadNum3 extends Thread {

	BlockingQueue q2; // 1/2 marks
	private String processedData;

	public ThreadNum3(BlockingQueue q2) {
		this.q2 = q2; // 1/2 marks
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) { // 1/2 marks
			try {

				processedData = (String) q2.pop(); // 1/2 marks
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				FileUtils.appendStringToFile("OutPut.txt", processedData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
