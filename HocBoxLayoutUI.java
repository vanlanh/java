package hueic.edu.vn.ui;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBoxLayoutUI extends JFrame {
	public HocBoxLayoutUI(String tieude){
		super(tieude);
		
		addControls();
	}
	public void addControls(){
		Container con=getContentPane();
		//Tạo 1 JPanel:
		JPanel pnBox=new JPanel();
		//BoxLayout là tạo panel theo dạng cột(X_AXIS) hay dạng dòng(Y_AXIS)
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
//		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		
		Button btn1=new Button("Demo Button 1");
		Button btn2=new Button("Demo Button 2");
		Button btn3=new Button("Demo Button 3");
		pnBox.add(btn1);
		pnBox.add(btn2);
		pnBox.add(btn3);
		con.add(pnBox);
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
