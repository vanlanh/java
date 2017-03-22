package hueic.edu.vn;

import java.util.Scanner;

public class HocXuLyChuoi {
	
	public static void main(String[] args){
		String s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời nhập chuỗi:");
		s = sc.nextLine();
		
		char []a=s.toCharArray();
		
		for(int i=0; i<a.length; i++){
			char kt = s.charAt(i);
			System.out.println("Các ký tự trong chuỗi là: "+kt);
		}
	}
	
	public static void main01(String[] args){
		String s1 = "Tran ";
		String s2 = "Van ";
		String s3 = "17 Tran Van Lanh 59";
		String s4 = "      Van Lanh     ";
		
		//Tính chiều dài chuỗi
		int len = s3.length();
		System.out.println("Độ dài chuỗi là: "+len);
		
		//Nối chuỗi s1 với s2
		String noi = s1.concat(s2);
		System.out.println(noi);
		System.out.println(s1+s2);
		
		//Lấy ký tự tại 1 vị trí nào đó
//		char kyTu = s2.charAt(4);
//		System.out.println("Ký tự được lấy là: "+kyTu);
		
		//So sánh 2 chuỗi
		int sosanh = s1.compareTo(s2);
		System.out.println(sosanh);
		
		//Tìm vị trí xuất hiện đầu tiên của chuỗi s2 trong chuỗi s3
		int vtdau = s3.indexOf(s2);
		System.out.println(vtdau);
		
		//Tìm vị trí xuất hiện cuối cùng của chuỗi s2 trong chuỗi s3
		int vtcuoi = s3.lastIndexOf(s2);	//Trả về -1 nếu không tìm thấy
		System.out.println(vtcuoi);
		
		//Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s3
		String thaythe = s3.replace(s1, s2);
		System.out.println(thaythe);
		
		//Loại bỏ khoảng trắng thừa của s4
		String trang = s4.trim();
		System.out.println(s4);
		System.out.println(trang);
		
		//Tạo chuỗi con s5 từ chuỗi s1 tại vị trí 4
		String s5 = s3.substring(5);
		System.out.println(s5);
		
		//Đếm xem có bao nhiêu chữ số in hoa, thường, số
		char []arr = s3.toCharArray();
		int soInHoa=0;
		int soInThuong=0;
		int soChuSo=0;
		for (int i = 0; i < arr.length; i++) {
			char c=arr[i];	//Lấy ra phần tử thứ i chạy từ 0->n-1
			if(Character.isUpperCase(c)){	//Kiểm tra xem có phải chữ in Hoa hay không
				soInHoa++;
			}
			if(Character.isLowerCase(c)){	//Kiểm tra xem có phải chữ in Thường hay không
				soInThuong++;
			}
			if(Character.isDigit(c)){		//Kiểm tra xem ký tự có chữ số hay không
				soChuSo++;
			}
		}
		System.out.println("Chuỗi có "+soInHoa+" ký tự hoa");
		System.out.println("Chuỗi có "+soInThuong+" ký tự thường");
		System.out.println("Chuỗi có "+soChuSo+" chữ số");
		
		String bh1="d:/music/phiasaumotcogai.mp3";
//		String bh2="d:\\music\\phiasaumotcogai.mp3";
		int vtcuoi2=bh1.lastIndexOf('/');	//Tìm vị trí xuất hiện cuối cùng của ký tự '/' trong chuỗi bh1
		String tenbaihat=bh1.substring(vtcuoi2+1);//Lấy hết các chuỗi con bên phải từ vtcuoi2 trong chuỗi bh1
		System.out.println("Tên bài hát = "+tenbaihat);
		
		int vtCuoiDauCham=bh1.lastIndexOf('.');
		tenbaihat=bh1.substring(vtcuoi2+1, vtCuoiDauCham);//Lấy chuỗi từ vị trí bắt đầu đến vị trí cuối cần lấy trong chuỗi bh1
		System.out.println("Tên bài hát không có đuôi = "+tenbaihat);
	}
}
