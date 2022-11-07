package mac.ssc.java.jframe;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Jframe_practice {
	private static String temp = "";
	
	static void Jpractice() {
		JFrame f1 = new JFrame();
		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		
		JCheckBox jbox = new JCheckBox("선택");
		JLabel label = new JLabel("");
		jbox.setLocation(100,100);
		jbox.setFont(font1);
		f1.add(jbox);
		label.setText(temp);
		
		//		l1.getFont("")
		f1.add(label);
		
		f1.setSize(300,400);		//출력창의 사이즈
		f1.setLocation(800, 300);
		
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
		
	}
		
	public static void main(String[] args) {
		Jframe_practice jp = new Jframe_practice();
		jp.Jpractice();
	}
	
}
