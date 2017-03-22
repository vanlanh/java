package hueic.edu.vn;

public class MyThread2 implements Runnable {
	// Khi chia sẻ biến giữa các tiểu trình trong ứng dụng thì sử dụng implements Runnable
	
		private int x=0;
		public void run() {
			for(int i=0; i<5; i++){
				System.out.println(Thread.currentThread().getName()+" i= "+i+"\n\tx="+x);
				x++;
			}
		}
		public int getX(){
			return this.x;
		}
}
