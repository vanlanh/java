package hueic.edu.vn.test;

import java.util.ArrayList;

import hueic.edu.vn.io.SerializeFileFactory;
import hueic.edu.vn.model.KhachHang;

public class TestKhachHang2 {
	public static void testLuuFile(){
		ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Trần Văn Lanh"));
		dsKH.add(new KhachHang("KH02", "Phạm Hữu Lộc"));
		dsKH.add(new KhachHang("KH03", "Bùi Thiện"));
		boolean kq=SerializeFileFactory.luuFile(dsKH, "d:\\dulieu2.txt");
		if(kq==true){
			System.out.println("Đã lưu file thành công");
		}else{
			System.out.println("Lưu file thất bại");
		}
		
	}
	public static void main(String[] args) {
		testLuuFile();
		ArrayList<KhachHang>dsKH=SerializeFileFactory.docFile("d:\\dulieu2.txt");
		System.out.println("Danh sách khách hàng nạp vào máy tính là:");
		System.out.println("Mã\t Tên");
		for(KhachHang kh: dsKH){
			System.out.println(kh);
		}
	}
}
