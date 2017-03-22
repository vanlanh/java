package hueic.edu.vn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocXuLyNgayThang {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();	//Lấy ngày giờ tháng năm hiện tại
		int nam=cal.get(Calendar.YEAR);
		System.out.println("Năm nay là năm "+nam);
		int thang=cal.get(Calendar.MONTH);	//tháng thực là từ 1-->12, tháng trong java là 0-->11
		System.out.println("Hôm nay là tháng "+(thang+1));
		int ngay=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Hôm nay là ngày "+ngay);
		
		Date t=cal.getTime();	//Trả về toàn bộ thông tin liên quan đến ngày tháng năm
		// 18/12/2016
		//Định dạng cho ngày tháng năm
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//d(day): đại diện cho ngày
		//M(month): đại diện cho tháng
		//y(year): đại diện cho năm
		System.out.println("Hôm nay là: "+sdf.format(t));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("d/M/yy");
		System.out.println("Hôm nay là: "+sdf2.format(t));
		
		//Định dạng ngày tháng năm và giờ phút giây
		SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//HH là khi thời gian là 24 giờ và không dùng aaa
		System.out.println("Hôm nay là: "+sdf3.format(t));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("hh:mm:ss aaa");
		//aaa đại diện cho AM và PM dùng khi thời gian là 12 giờ và định dạng giờ là hh
		System.out.println("Bây giờ là "+sdf4.format(t));
	}
}
