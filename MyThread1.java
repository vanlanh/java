package hueic.edu.vn;

public class MyThread1 extends Thread {
	// Kế thừa trực tiếp từ Thread
	// Khi không chia sẻ biến giữa các tiểu trình thì sử dụng kế thừa từ Thread
	
	public void run() {		//Phương thức chạy đa tiến trình
		super.run();
		
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName()+"i= "+i);
		}
	}
}
