package hueic.edu.vn;

import java.util.HashMap;

public class HocHashMap {
	public static void main(String[] args){
		HashMap<Integer, String> ds=new HashMap<Integer, String>();
		//Đối số 1 là khóa chính, đối số 2 là tất cả thông tin liên quan tới khóa chính đó
		ds.put(111, "Trần Văn Lanh, 19 tuổi");	//Thêm đối tượng
		ds.put(112, "Phạm Công Luận, 19 tuổi");
		ds.put(113, "Bùi Phước, 20 tuổi");
		//ds.put(khóa chính, thông tin);
		
		String nv=ds.get(113);		//Lấy đối tượng
		
		System.out.println(nv);
		System.out.println("Sinh viên toàn bộ của lớp:");
		for(String ten: ds.values()){
		//ds.value() là trả về toàn bộ các thông tin của vế bên trái(đối số 2)
			System.out.println(ten);
		}
		
		ds.remove(113);		//Xóa đối tượng
		System.out.println("Sinh viên toàn bộ của lớp sau khi xóa:");
		for(String ten: ds.values()){
			System.out.println(ten);
		}
	}
}
