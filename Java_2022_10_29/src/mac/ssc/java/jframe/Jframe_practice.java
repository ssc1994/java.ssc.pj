package mac.ssc.java.jframe;
import java.awt.Font;

import javax.swing.*;

public class Jframe_practice {
	
	public static void main(String[] args) {
		
		JFrame f1 = new JFrame();
		
		JButton b1 = new JButton("Button");
		JLabel l1 = new JLabel("라벨");

		b1.setBounds(100, 100, 100, 40);		//
		l1.setBounds(100, 150, 100, 50);		//
		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		//		l1.getFont("")
		
		l1.setFont(font1);
		f1.add(b1);					//버튼을 f1에 올려준다
		f1.add(l1);
		
		f1.setSize(300,400);		//출력창의 사이즈
		f1.setLocation(800, 300);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	

}
