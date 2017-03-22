package hueic.edu.vn;

public class XuLyCheckedError {

	public static void main(String[] args) {
		try{
			int x=1/0;
			
			System.out.println(x);
		}
		catch(Exception ex){
			//Xuất chi tiết lỗi để kiểm tra
			ex.printStackTrace();
		}
	}

}
