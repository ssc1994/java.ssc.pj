package mac.ssc.java.cal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calc extends JFrame{
	public String pro = "";
	public String res = "";

	public Calc(String title) {
		//기본틀 지정
		this.setTitle(title);
		//프레임 크기 350x500출력
		this.setSize(350, 500);
		//프레임 출력 위치 800에 250으로 고정
		this.setLocation(800, 250);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//패널지정 

		JPanel P_all = new JPanel();	//전체 틀 설정
		JPanel P_old = new JPanel();	//기존 연산 출력
		JPanel P_con = new JPanel();  	//버튼 설정
		JPanel P_cal = new JPanel();	//출력창 설정

		Font bold = new Font("맑은 고딕", Font.BOLD, 40);
		Font bt_bold = new Font("맑은 고딕", Font.BOLD, 35);
		Font num_bold = new Font("맑은 고딕", Font.BOLD, 35);
		Font calfont = new Font("맑은 고딕", Font.BOLD,20);
		Font res_bold = new Font("맑은 고딕", Font.BOLD,30);

		//색깔 생성
		Color gray = new Color(204,204,204);
		Color white = new Color(255,255,255);
		Color light_blue = new Color(204,204,255);


		//전체 레이아웃 설정
		this.add(P_all);
		P_all.setLayout(new FlowLayout());

		//P_cal 레이아웃 설정 
		P_cal.setLayout(new GridLayout(2,1));
		P_cal.setPreferredSize(new Dimension(290, 120));	//출력창 레이아웃 설정
		JLabel process = new JLabel(pro,JLabel.RIGHT);		//계산식 출력 
		JLabel result = new JLabel(res,JLabel.RIGHT);		//결과값 출력 


		//P_cal 레이블 정렬
		process.setAlignmentX(RIGHT_ALIGNMENT); 	//process 오른정렬
		result.setAlignmentX(RIGHT_ALIGNMENT);		//result 오른정렬


		//P_cal에 폰트 적용
		process.setFont(calfont);
		result.setFont(res_bold);

		//P_cal에 색상 적용
		process.setForeground(gray);

		//P_cal 레이블에 추가
		P_cal.add(process);			//P_cal에 계산식 출력란 추가
		P_cal.add(result);			//P_cal에 결과값 출력란 추가

		//P_con 레이아웃
		P_con.setLayout(new GridLayout(4,4));
		P_con.setPreferredSize(new Dimension(290,300));


		//1번줄
		JButton seven = new JButton("7");
		P_con.add(seven);
		JButton eight = new JButton("8");
		P_con.add(eight);
		JButton nine = new JButton("9");
		P_con.add(nine);
		JButton cancle = new JButton("ce");
		P_con.add(cancle);

		//2번줄
		JButton four = new JButton("4");
		P_con.add(four);
		JButton five = new JButton("5");
		P_con.add(five);
		JButton six = new JButton("6");
		P_con.add(six);
		JButton mul = new JButton("x");
		P_con.add(mul);

		//3번줄
		JButton one = new JButton("1");
		P_con.add(one);
		JButton two = new JButton("2");
		P_con.add(two);
		JButton three = new JButton("3");
		P_con.add(three);
		JButton div = new JButton("%");
		P_con.add(div);

		//4번줄
		JButton min = new JButton("-");
		P_con.add(min);
		JButton zero = new JButton("0");
		P_con.add(zero);
		JButton plus = new JButton("+");
		P_con.add(plus);
		JButton equal = new JButton("=");
		P_con.add(equal);

		//숫자 폰트 사이즈 설정
		zero.setFont(num_bold);
		one.setFont(num_bold);
		two.setFont(num_bold);
		three.setFont(num_bold);
		four.setFont(num_bold);
		five.setFont(num_bold);
		six.setFont(num_bold);
		seven.setFont(num_bold);
		eight.setFont(num_bold);
		nine.setFont(num_bold);

		//기호 폰트 사이즈 설정
		cancle.setFont(bt_bold);
		div.setFont(bt_bold);
		mul.setFont(bt_bold);
		plus.setFont(bt_bold);
		equal.setFont(bt_bold);
		min.setFont(bt_bold);

		//숫자 배경색 설정
		zero.setBackground(white);
		one.setBackground(white);
		two.setBackground(white);
		three.setBackground(white);
		four.setBackground(white);
		five.setBackground(white);
		six.setBackground(white);
		seven.setBackground(white);
		eight.setBackground(white);
		nine.setBackground(white);

		//기호 버튼 배경색 설정
		cancle.setBackground(light_blue);
		div.setBackground(gray);
		mul.setBackground(gray);
		plus.setBackground(gray);
		min.setBackground(gray);
		equal.setBackground(light_blue);

		//P_all프레임에 만들어둔 P_cal & P_con 추가
		P_all.add(P_cal);
		P_all.add(P_con);
		setVisible(true);

		one.addActionListener(event -> {
			pro+="1";
			process.setText(pro);
		});

		two.addActionListener(event -> {
			pro+="2";
			process.setText(pro);
		});

		three.addActionListener(event -> {
			pro+="3";
			process.setText(pro);
		});

		four.addActionListener(event -> {
			pro+="4";
			process.setText(pro);
		});

		five.addActionListener(event -> {
			pro+="5";
			process.setText(pro);
		});

		six.addActionListener(event -> {
			pro+="6";
			process.setText(pro);
		});

		seven.addActionListener(event -> {
			pro+="7";
			process.setText(pro);
		});

		eight.addActionListener(event -> {
			pro+="8";
			process.setText(pro);
		});

		nine.addActionListener(event -> {
			pro+="9";
			process.setText(pro);
		});

		zero.addActionListener(event -> {
			pro+="0";
			process.setText(pro);
		});
//		if(pro.charAt(pro.length()-1)=='%') {
//			
//		};
		div.addActionListener(event -> {
			pro+="%";
			process.setText(pro);
		});
		mul.addActionListener(event -> {
			pro+="x";
			process.setText(pro);
		});
		plus.addActionListener(event -> {
			pro+="+";
			process.setText(pro);
		});
		min.addActionListener(event -> {
			pro+="-";
			process.setText(pro);
		});
		equal.addActionListener(event -> {
			pro+="=";
			process.setText(pro);
		});

		cancle.addActionListener(event -> {
			pro="";
			process.setText(pro);
		});





	}
	public static void main(String[] args) {
		new Calc("ssc.계산기");
	}

}
