package hueic.edu.vn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HocXuLyToanHoc {
	
	public static void main(String[] args) {
		int x1, x2, y1, y2;
		double dis;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời nhập tọa độ x1:");
		x1 = sc.nextInt();
		System.out.println("Mời nhập tọa độ y1:");
		y1 = sc.nextInt();
		System.out.println("Mời nhập tọa độ x2:");
		x2 = sc.nextInt();
		System.out.println("Mời nhập tọa độ y2:");
		y2 = sc.nextInt();
		
		dis = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		
		DecimalFormat df=new DecimalFormat("0.###");
		
		System.out.println("Khoảng cách giữa 2 điểm ("+x1+","+y1+") và ("+x2+","+y2+"): "+df.format(dis));
	}
	
	public static void main02(String[] args) {
		int a,b,c;
		double s,dt,cv;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời nhập a:");
		a = sc.nextInt();
		System.out.println("Mời nhập b:");
		b = sc.nextInt();
		System.out.println("Mời nhập c:");
		c = sc.nextInt();
		
		if((a+b)>c&&(a+c)>b&&(b+c)>a&&a>=0&&b>=0&&c>=0){
			System.out.println("a,b,c tạo thành một tam giác!");
			cv = a+b+c;
			s = cv/2;
			dt = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			System.out.println("Diện tích tam giác là: "+dt);
		}else{
			System.out.println("a,b,c không tạo thành một tam giác");
		}
		
	}
	
	public static void main01(String[] args) {
		//Tính căn bậc 2
		int n=25;
		System.out.println("Căn bậc 2 của "+n+" là "+Math.sqrt(n));
		
		//Tính số lũy thừa
		int x=3;
		int y=2;
		System.out.println(x+"^"+y+"="+Math.pow(x, y));
		
		//Tính giá trị tuyệt đối
		int k=-123;
		System.out.println("|"+k+"| = "+Math.abs(k));
		
		//Tính chu vi và diện tích hình tròn
		int banKinh=5;
		double cv=2*Math.PI*banKinh;
		double dt=Math.PI*Math.pow(banKinh, 2);
		//Định dạng số
		DecimalFormat dfm=new DecimalFormat("#.##");
		System.out.println("Chu vi hình tròn là: "+dfm.format(cv));
		System.out.println("Diện tích hình tròn là: "+dfm.format(dt));
		
		//Tính lượng giác
		int goc=55;
		double rad=Math.PI*goc/180;
		System.out.println("sin("+goc+")= "+Math.sin(rad));
		System.out.println("cos("+goc+")= "+Math.cos(rad));
		System.out.println("tan("+goc+")= "+Math.tan(rad));
		System.out.println("cotan("+goc+")= "+Math.cos(rad)/Math.sin(rad));
		System.out.println("cotan("+goc+")= "+1/Math.tan(rad));
	}
}
