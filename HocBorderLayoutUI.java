package hueic.edu.vn.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBorderLayoutUI extends JFrame {
	public HocBorderLayoutUI(String tieude){
		this.setTitle(tieude);
		addControls();
	}
	public void addControls(){
		Container con=getContentPane();
		//BorderLayout là tạo panel có 5 vùng: đông, tây, nam, bắc, trung tâm
		JPanel pnBorderLayout=new JPanel();
		pnBorderLayout.setLayout(new BorderLayout());
		
		JPanel pnNorth=new JPanel();
		pnNorth.setBackground(Color.BLUE);
		//pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
		//Thiết lập kích thước của vùng đó
		pnNorth.setPreferredSize(new Dimension(0, 100));
		
		JPanel pnSouth=new JPanel();
		pnSouth.setBackground(Color.GRAY);
		//pnBorderLayout.add(pnSouth, BorderLayout.SOUTH);
		pnSouth.setPreferredSize(new Dimension(0, 100));
		
		JPanel pnWest=new JPanel();
		pnWest.setBackground(Color.GREEN);
		//pnBorderLayout.add(pnWest, BorderLayout.WEST);
		pnWest.setPreferredSize(new Dimension(100, 0));
		
		JPanel pnEast=new JPanel();
		pnEast.setBackground(Color.YELLOW);
		//pnBorderLayout.add(pnEast, BorderLayout.EAST);
		pnEast.setPreferredSize(new Dimension(100, 0));
		
		JPanel pnCenter=new JPanel();
		pnCenter.setBackground(Color.RED);
		pnBorderLayout.add(pnCenter, BorderLayout.CENTER);
		
		con.add(pnBorderLayout);
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
