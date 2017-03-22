package hueic.edu.vn;

public class HocClass {
	//public: khả năng truy xuất bất kỳ mọi nơi đâu
	//private: tạo thuộc tính(bắt buộc phải để private, để đảm bảo tính đóng gói)
	private String ten;
	public String getTen(){
		return this.ten;
	}
	public void setTen(String ten){
		this.ten=ten;
	}
	//Constructor là 1 phương thức có tên trùng với tên lớp và không có kiểu trả về
	public HocClass(){	//Constructor mặc định không có đối số
		System.out.println("Mặc định");
	}
	public HocClass(String ten){	//Constructor đầy đủ đối số
		this.ten=ten;
	}
	
	//overloading method
	/*
	 * Trong cùng 1 lớp có nhiều phương thức cùng tên nhưng khác về signature
	 * Signature:
	 * 	1.Số lượng các đối số khác nhau
	 * 	2.Hoặc kiểu dữ liệu các đối số khác nhau
	 * 	3.Kiểu trả về không phải là signature
	 */
	//Học Overloading
	public static int fn(int x, int y){
		return x+y;
	}
	public static double fn(double x, double y){
		return x+y+100;
	}
	public static int fn2(int x, int y, int z){
		return x+y+z;
	}
	public static int fn2(int x){
		return x;
	}
	/*public static int fn3(int x, int y){
		
	}
	public static double fn3(int x, int y){
		
	}
	==> sai kiểu trả về không được coi là signature*/
	//parameter list(Mảng 1 chiều linh động)
	public static int fn4(int ...arr){
		int sum=0;
		for(int x:arr)
			sum+=x;
		return sum;
	}
	
	//Alias: Tại 1 ô nhớ có hơn 1 biến đối tượng quản lý --> gọi là alias
	//Khi 1 ô nhớ không có biến đối tượng quản lý thì hệ thống sẽ Gom rác tự động(Thu hồi ô nhớ đã cấp phát)
	
	//Học Overloading
	public static void main(String[] args) {
		System.out.println(fn(1.0, 1.0));
		System.out.println(fn(1, 1));
		System.out.println(fn2(1, 2, 3));
		System.out.println(fn2(1));
		
		System.out.println(fn4(1,2,3));
		System.out.println(fn4(1,2,3,4));
	}
}
