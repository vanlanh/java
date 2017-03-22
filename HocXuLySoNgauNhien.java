package hueic.edu.vn;

import java.util.Random;

public class HocXuLySoNgauNhien {
	public static void main(String[] args) {
		int M[]=new int[10];
		Random rd=new Random();
		for (int i = 0; i < M.length; i++) {	//Nhập mảng ngẫu nhiên
			M[i]=-100+rd.nextInt(151);
		}
		System.out.println("Mảng ngẫu nhiên là:");
		for (int i = 0; i < M.length; i++) {	//Xuất mảng ngẫu nhiên
			System.out.print(M[i]+"\t");
		}
	}
}
