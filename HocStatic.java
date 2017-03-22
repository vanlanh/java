package hueic.edu.vn;

public class HocStatic {
	/*Thuộc tính khai báo là static --> class member/class variable
	  Phương thức là static --> class method
	  --> Cả 2 trường hợp này đều được cấp phát bộ nhớ 1 lần, duy nhất và ra đời trước đối tượng
	  --> Các phương thức static không thể gọi phương thức hay thuộc tính không phải static
	  	  (Vì static ra đời trước, non-static ra đời sau --> trong static chưa thấy được non-static)
	  --> Các biến, thuộc tính static được truy xuất trực tiếp từ tên lớp --> TenLop.tên thuộc tính/tên phương thức
	  Static chia sẻ một phần ô nhớ
	*/
	
	public static int x=5;//x chính là class member
	public int y;
	
	public static void fn(){
//		System.out.println(y);//không được
		System.out.println(x);
	}
	public void fn2(){
		System.out.println(y);
		System.out.println(x);
	}
	public static void main(String[] args) {
		fn();
	}
}
