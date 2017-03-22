package hueic.edu.vn;

import java.util.Scanner;

public class HocSwitch {
	public static void main(String[] args){
		int a = 5, b = 7;
		
		int z = a++ + ++b -8;
		//
		
		System.out.println("a = " + a + " b = " + b + " z = " + z);
		
		Scanner sc = new Scanner (System.in);
//		System.out.println("Mời nhập i:");
//		int i = sc.nextInt();
//		String s = (i%2==0) ? "Số chẵn" : "Số lẻ";
	//	
//		System.out.println(s);
		
		
		
		int month, year;
		
		System.out.println("Mời nhập tháng:");
		month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng "+ month +" có 31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng "+ month +" có 30 ngày");
			break;
		case 2:
			System.out.println("Mời nhập năm:");
			year = sc.nextInt();
			if((year%4==0 && year%100!=0)){
				System.out.println(year + " là năm nhuận");
				System.out.println("Tháng "+ month +" có 29 ngày");
			}else{
				System.out.println(year + " không phải là năm nhuận");
				System.out.println("Tháng "+ month +" có 28 ngày");
			}	
			break;
		default:
			System.out.println("Bạn nhập sai tháng rồi, mời nhập lại");
			break;
		}
	}
}
