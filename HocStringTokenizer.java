package hueic.edu.vn;

import java.util.StringTokenizer;

public class HocStringTokenizer {
	public static void main(String[] args) {
		String s="   học, học , học, nữa, học, mãi   ";
		
		StringTokenizer token=new StringTokenizer(s);
		while(token.hasMoreTokens()){	//hỏi xem có còn dữ liệu để lấy ra hay không
			System.out.println(token.nextToken());	//Lấy ra và di chuyển qua phần tử kế tiếp
		}
		System.out.println("============");
		StringTokenizer token2=new StringTokenizer(s, ",");
		//Đối số 1 là chuỗi, đối số 2 là ký tự muốn tách
		while(token2.hasMoreTokens()){
			System.out.println(token2.nextToken());
		}
		System.out.println("============");
		StringTokenizer token3=new StringTokenizer(s, ", ");
		while(token3.hasMoreTokens()){
			System.out.println(token3.nextToken());
		}
	}
}
