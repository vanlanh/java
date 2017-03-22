package hueic.edu.vn;

public class HocToiUuChuoi {
	public static void main(String[] args){
		String s = "         Tran          Van     Lanh      ";
		//s="Tran Van Lanh";
		System.out.println(s);
		s=s.trim();	//Loại bỏ hết các khoảng trắng dư thừa bên phải và bên trái của chuỗi s
		String []arr = s.split(" ");	//Tách chuỗi theo ký tự nào đó
		String sToiUu= "";
		for(String tu :arr){
			if(tu.trim().length() != 0){
				sToiUu += tu +" ";
			}
		}
		sToiUu = sToiUu.trim();
		System.out.println(sToiUu);
	}
}
