package hueic.edu.vn;

import java.util.ArrayList;

public class HocArrayList {
	public static void main(String[] args){
		
		/*ArrayList ds=new ArrayList();
		ds.add("x");
		ds.add(5+"");
		
		ArrayList ds2=new ArrayList();
		ds2.add("1.5");*/
		
		//Kiểu không tường minh
		ArrayList ds3=new ArrayList();
		ds3.add("Tran");	//Thêm vào ds mảng
		ds3.add("Lanh");
		ds3.add(1, "Van");	//Chèn vào vị trị 1 từ Van
		
		//Duyệt theo vị trí
		for (int i = 0; i < ds3.size(); i++) {	//Trả về kích thước
			String x=ds3.get(i)+"";				//Lấy giá trị trong ds mảng ra
			System.out.println(x);
		}
		
		System.out.println("=====================");
		//Duyệt theo đối tượng
		for (Object data: ds3) {
			System.out.println(data);
		}
		
		//Kiểu tường minh
		ArrayList<Double> ds4=new ArrayList<Double>();//Không dùng kiểu cơ sở mà phải dùng Wrapper Class
		for (int i = 0; i <= 10; i++) {
			ds4.add(i*2.0);
		}
		System.out.println("Giá trị của ds 4 là:");
		for(double x: ds4){
			System.out.println(x);
		}
		
		ArrayList<Float> ds5=new ArrayList<Float>();
		ds5.add(1.5f);
		ds5.add(1.8f);
		System.out.println("Số phần tử của ds 5= "+ds5.size());
		ds5.add(175.117f);
		System.out.println("Số phần tử của ds 5= "+ds5.size());
		ds5.remove(1.5f);		//Xóa dữ liệu trong mảng
		System.out.println("Số phần tử của ds 5= "+ds5.size());
		
		System.out.println("Các phần tử trong ds 5:");
		for(float x: ds5){
			System.out.println(x);
		}
		
		ds5.set(0, 17.5f);		//Sửa thông tin trong ds mảng
		System.out.println("Các phần tử trong ds 5 sau khi sửa:");
		for(float x: ds5){
			System.out.println(x);
		}
	}
}
