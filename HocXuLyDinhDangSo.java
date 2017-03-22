package hueic.edu.vn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HocXuLyDinhDangSo {
	
	public static void main(String[] args) {
		int r;
		double tt, dt;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời nhập bán kính(r>=0):");
		r = sc.nextInt();
		
		DecimalFormat dcf=new DecimalFormat("0.####");
		
		dt = 4*Math.PI*r*r;
		tt = (4*Math.PI*r*r*r)/3;
		
		System.out.println("Diện tích hình tròn là: "+dcf.format(dt));
		System.out.println("Thể tích hình tròn là: "+dcf.format(tt));
		
	}
	
	public static void main01(String[] args) {
		double toan=7;
		double ly=6;
		double hoa=7;
		double dtb=(toan+ly+hoa)/3;
		System.out.println("Điểm trung bình: "+dtb);
		
		//Lớp định dạng số
		DecimalFormat dfm=new DecimalFormat("#.##");
		System.out.println("Điểm trung bình: "+dfm.format(dtb));
	}
}
