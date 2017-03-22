package hueic.edu.vn.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocFlowLayoutUI extends JFrame {
	//Tạo Constructor
	public HocFlowLayoutUI(String tieude){
		super(tieude);
		
		addControls();
	}
	public void addControls(){
		Container con=getContentPane();
		//Tạo 1 JPanel:
		JPanel pnFlowLayout=new JPanel();
		//FlowLayout là sắp xếp các Controls xuống dòng khi không đủ chỗ chứa trên 1 dòng
		pnFlowLayout.setLayout(new FlowLayout());
		JButton btn1=new JButton("Demo button 1");
		JButton btn2=new JButton("Demo button 2");
		JButton btn3=new JButton("Demo button 3");
		JButton btn4=new JButton("Demo button 4");
		//Đưa button lên panel
		pnFlowLayout.add(btn1);
		pnFlowLayout.add(btn2);
		pnFlowLayout.add(btn3);
		pnFlowLayout.add(btn4);
		//Đưa panel lên giao diện
		con.add(pnFlowLayout);
	}
	public void showWindow(){
		//Tạo kích thước của cửa sổ
		this.setSize(600, 400);
		//Cho phép click 'x' để tắt cửa sổ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Mặc định hiển thị cửa sổ giữa màn hình
		this.setLocationRelativeTo(null);
		//Mặc định không cho phép thay đổi kích thước cửa sổ
//		this.setResizable(false);
		//Hiển thị cửa sổ lên màn hình desktop
		this.setVisible(true);
	}
}
