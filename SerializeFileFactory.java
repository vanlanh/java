package hueic.edu.vn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import hueic.edu.vn.model.KhachHang;

public class SerializeFileFactory {
	//Lưu file theo đối tượng
	public static boolean luuFile(ArrayList<KhachHang>dsKH, String path){
		try{
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			//Cho phép ghi hình nguyên đối tượng xuống ổ cứng
			oos.writeObject(dsKH);	//map nguyên đối tượng xuống ổ cứng
			//Đóng file
			oos.close();
			fos.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	//Đọc file theo đối tượng
	public static ArrayList<KhachHang>docFile(String path){
		ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
		try{
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data=ois.readObject();
			dsKH=(ArrayList<KhachHang>) data;
			//Đóng file
			ois.close();
			fis.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return dsKH;
	}
}
