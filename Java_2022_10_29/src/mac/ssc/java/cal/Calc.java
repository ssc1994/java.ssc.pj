package mac.ssc.java.cal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calc extends JFrame{
	
	public void Calculator(String title) {
		//기본틀 지정
		this.setTitle(title);
		//프레임 크기 400x500출력
		this.setSize(350, 450);
		this.setLocation(800, 250);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//패널지정 
		JPanel P_all = new JPanel();  //베이스 
		JPanel P_con = new JPanel();  //콘텐
		JPanel P_cal = new JPanel();
		
		Font bold = new Font("맑은 고딕", Font.BOLD, 40);
		Font bt_bold = new Font("맑은 고딕", Font.BOLD, 30);
		
		//색깔 생성
		Color gray = new Color(204,204,204);
		Color white = new Color(255,255,255);
		Color light_blue = new Color(153,153,255);
		
		//전체 레이아웃 설정
		this.add(P_all);
		P_all.setLayout(new FlowLayout());
		
		//P_cal 레이아웃 설정 
		P_cal.setLayout(getLayout());
		
		
		
		P_con.setLayout(new GridLayout(6,4));
		P_con.setPreferredSize(new Dimension(290,300));
		
		
		
		
		//2번
		JButton seven = new JButton("7");
		P_con.add(seven);
		JButton eight = new JButton("8");
		P_con.add(eight);
		JButton nine = new JButton("9");
		P_con.add(nine);
		JButton cancle = new JButton("ce");
		P_con.add(cancle);
		
		//3번
		JButton four = new JButton("4");
		P_con.add(four);
		JButton five = new JButton("5");
		P_con.add(five);
		JButton six = new JButton("6");
		P_con.add(six);
		JButton mul = new JButton("x");
		P_con.add(mul);
		
		//4번
		JButton one = new JButton("1");
		P_con.add(one);
		JButton two = new JButton("2");
		P_con.add(two);
		JButton three = new JButton("3");
		P_con.add(three);
		JButton div = new JButton("%");
		P_con.add(div);
		
		//1번
		JButton min = new JButton("-");
		P_con.add(min);
		JButton zero = new JButton("0");
		P_con.add(zero);
		JButton plus = new JButton("+");
		P_con.add(plus);
		JButton equal = new JButton("=");
		P_con.add(equal);
		
		
		P_all.add(P_con);
		
		
		setVisible(true);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Calc();
	}

}
