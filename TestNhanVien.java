package hueic.edu.vn.nhanvien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien lanh=new NhanVienChinhThuc();
		lanh.setTen("Trần Văn Lanh");
		System.out.println(lanh);
		
		NhanVienChinhThuc ly=new NhanVienChinhThuc();
		ly.setTen("Trần Hữu Lý");
		System.out.println(ly);
		
		lanh=new NhanVienThoiVu();	//tính đa hình từ kế thừa từ lớp
		lanh.setTen("Trần Văn Lanh");
		System.out.println(lanh);
	}

}
