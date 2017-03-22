package hueic.edu.vn.test;

import java.util.ArrayList;

import hueic.edu.vn.io.TextFileFactory;
import hueic.edu.vn.model.KhachHang;

public class TestKhachHang {

	public static void testLuuFile(){
		ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Trần Văn Lanh"));
		dsKH.add(new KhachHang("KH02", "Phạm Hữu Lộc"));
		dsKH.add(new KhachHang("KH03", "Bùi Thiện"));
		
		//Lưu file
		boolean kt=TextFileFactory.luuFile(dsKH, "d:\\dulieu.txt");
		//Đối số 1 dữ liệu muốn lưu, đối số 2 là nơi lưu
		//Kiểm tra đã lưu file được hay chưa
		if(kt==true){
			System.out.println("Đã lưu file thành công");
		}else{
			System.out.println("Lưu file thất bại");
		}
		
	}
	public static void main(String[] args) {
		testLuuFile();
		ArrayList<KhachHang>dsKH=TextFileFactory.docFile("d:\\dulieu.txt");
		System.out.println("Danh sách khách hàng nạp vào máy tính là:");
		System.out.println("Mã\t Tên");
		for(KhachHang kh: dsKH){
			System.out.println(kh);
		}
	}

}
