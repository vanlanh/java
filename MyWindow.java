package hueic.edu.vn.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JFrame {
	//Tạo Constructor
	public MyWindow(String tieude){
		//Gọi lớp của JFrame để hiển thị tiêu đề
		//super(tieude);
		this.setTitle(tieude);
		
		addControls();
	}
	//Hàm gán controls lên giao diện
	public void addControls(){
		//Lấy lớp chứa cửa sổ ra:
		Container con=getContentPane();
		//Tạo 1 lớp chứa controls
		JPanel pn=new JPanel();
		pn.setBackground(Color.GREEN);
		
		JButton btn=new JButton("Đây là nút lệnh");
		//Đưa button lên panel
		pn.add(btn);
		
		//Đưa panel lên giao diện
		con.add(pn);
	}
	//Hàm tạo cửa sổ
	public void showWindow(){
		this.setSize(500, 400);//Tạo kích thước của cửa sổ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cho phép click 'x' để tắt cửa sổ
		this.setLocationRelativeTo(null);//Mặc định hiển thị cửa sổ giữa màn hình
		this.setResizable(false);//Mặc định không cho phép thay đổi kích thước cửa sổ
		this.setVisible(true);//Hiển thị cửa sổ lên màn hình desktop
	}
}
