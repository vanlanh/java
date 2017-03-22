package hueic.edu.vn;

public class KhachHang {
	//Tạo thuộc tính(bắt buộc phải để private, để đảm bảo tính đóng gói)
	private String ma;
	private String ten;
	private int tuoi;
	private String diaChi;
		
	private static double x;
	
	//public: khả năng truy xuất bất kỳ mọi nơi đâu
	
	public void doiThongTinCuaX(int gtmoi){
		x=gtmoi;
	}
	public double layThongTinX(){
		return x;
	}
		
	//Phương thức lấy (không có đối số)
	public String getMa(){
		return this.ma;		//this là từ khóa truy xuất nội tại trong bản thân lớp này
	}
		
	//Phương thức thay đổi thông tin cho thuộc tính
	public void setMa(String ma){
		this.ma=ma;
	}
	public String getTen(){
		return this.ten;
	}
	public void setTen(String ten){
		this.ten=ten;
	}
	public int getTuoi(){
		return this.tuoi;
	}
	public void setTuoi(int tuoi){
		this.tuoi=tuoi;
	}
	public String getDiaChi(){
		return this.diaChi;
	}
	public void setDiaChi(String diaChi){
		this.diaChi=diaChi;
	}
	//Constructor
	public KhachHang(){	//Constructor mặc định không có đối số
		System.out.println("Mặc Định");
	}
	//Constructor đầy đủ đối số
	public KhachHang(String ma, String ten, int tuoi, String diaChi){
		this.ma=ma;
		this.ten=ten;
		this.tuoi=tuoi;
		this.diaChi=diaChi;
	}
	public String toString() {
		return this.ma+";"+this.ten+";"+this.tuoi+";"+this.diaChi;
	}
}
