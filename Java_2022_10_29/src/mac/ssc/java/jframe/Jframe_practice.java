package mac.ssc.java.jframe;
import javax.swing.*;

public class Jframe_practice {
	
	public static void main(String[] args) {
		
		JFrame f1 = new JFrame();
		
		JButton b1 = new JButton("Button");

		b1.setBounds(120, 100, 100, 40);		//
		
		f1.add(b1);					//버튼을 f1에 올려준다
		f1.setSize(300,400);		//출력창의 사이즈
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	

}
