package hueic.edu.vn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import hueic.edu.vn.model.KhachHang;

public class TextFileFactory {
	//Ghi file
	public static boolean luuFile(ArrayList<KhachHang>dsKH, String path){//path là nơi lưu file
		//Tương tác file dễ sinh ra lỗi nên phải có Checked Error để kiểm tra lỗi
		try{
			//Thư viện tạo ra 1 file để ghi từ ram ra ổ cứng
			FileOutputStream fos=new FileOutputStream(path);
			//Thư viện xuất ra với định dạng UTF-8
			OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
			//Thư viện ghi ra bộ đệm để lưu
			BufferedWriter bw=new BufferedWriter(osw);
			//foreach
			for(KhachHang kh: dsKH){
				String line=kh.getMa()+";"+kh.getTen();
				bw.write(line);//Đẩy dữ liệu xuống ổ cứng
				bw.newLine();//Lệnh xuống dòng
			}
			//Đóng file để không mất dữ liệu, nếu thiếu lệnh này thì dữ liệu sẽ = rỗng
			bw.close();
			osw.close();
			fos.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	//Đọc file
	public static ArrayList<KhachHang>docFile(String path){
		ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
		//Tương tác file phải có try{}catch(){}
		try{
			//Thư viện để đọc 1 file từ ổ cứng vào ram
			FileInputStream fis=new FileInputStream(path);
			//Thư viện đọc vào với định dạng UTF-8
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			//Thư viện để đọc file
			BufferedReader br=new BufferedReader(isr);
			
			String line=br.readLine();	//Đọc dòng đầu tiên
			while(line !=null){
				String []arr=line.split(";");//Tách ra bởi ";"
				if(arr.length==2){
					KhachHang kh=new KhachHang(arr[0], arr[1]);
					dsKH.add(kh);
				}
				//Lấy dữ liệu ra và di chuyển tới dòng kế tiếp
				line=br.readLine();//Phải có lệnh này để không rơi vào vòng lặp vĩnh cữu
			}
			//Phải đóng file
			br.close();
			isr.close();
			fis.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return dsKH;
	}
}
