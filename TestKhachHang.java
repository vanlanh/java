package hueic.edu.vn;

public class TestKhachHang {
	public static void main(String[] args) {
		KhachHang lanh=new KhachHang();
		
		lanh.setMa("NV1");
		lanh.setTen("Trần Văn Lanh");
		lanh.setTuoi(19);
		lanh.setDiaChi("Huế");
		System.out.println(lanh);
		
		System.out.println("Tôi chỉ lấy tuổi = "+lanh.getTuoi());
		
		KhachHang ly=new KhachHang();
		ly.setTen("Phạm Thị Ly");
		
		System.out.println("Tên của Lanh = "+lanh.getTen());
		System.out.println("Tên của Ly = "+ly.getTen());
		
		lanh=ly;
		lanh.setTen("Nguyễn Văn Loạn");
		System.out.println("Tên của Ly = "+ly.getTen());
		
		System.out.println("x= "+lanh.layThongTinX());
		KhachHang an=new KhachHang();
		an.doiThongTinCuaX(100);
		System.out.println("x= "+lanh.layThongTinX());
		
		KhachHang lap=new KhachHang();
		System.out.println("x của lap = "+lap.layThongTinX());
	}
}
