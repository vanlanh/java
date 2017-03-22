package hueic.edu.vn;

public class HocXuLyStringBuilder {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder();
		for(int i=0; i<100000; i++){
			builder.append("Phần tử thứ "+i); //append thay thế cho dấu cộng
			builder.append("\n");
		}
		System.out.println(builder.toString());
		
	}
}
