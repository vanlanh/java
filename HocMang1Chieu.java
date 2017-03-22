package hueic.edu.vn;

import java.util.Arrays;

public class HocMang1Chieu {
	public static void main(String[] args){
		int M[] =new int[4];
		M[0] = 7;
		M[1] = 5;
		M[2] = 4;
		M[3] = 0;
		System.out.println("Mảng của bạn là:");
		//Xuất mảng
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		
		Arrays.sort(M);		//Sắp xếp mảng
		System.out.println("\nMảng sau khi sắp xếp là:");
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		
		//Xuất các số nguyên tố trong mảng
		System.out.println("\nCác số nguyên tố là:");
		for (int i = 0; i < M.length; i++) {
			int dem=0;
			for (int j = 1; j <= M[i]; j++) {
				if(M[i]%j == 0){
					dem++;
				}
			}
			if(dem==2)
				System.out.print(M[i]+"\t");
		}
	}
}
