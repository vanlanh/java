package hueic.edu.vn;

public class TestMyThread2 {

	public static void main(String[] args) {
		Thread th3=new Thread(new MyThread2());
		th3.setName("Tiến trình 3");
		th3.start();
		
		Thread th4=new Thread(new MyThread2());
		th4.setName("Tiến trình 4");
		th4.start();
	}

}
