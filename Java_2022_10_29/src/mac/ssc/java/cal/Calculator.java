package mac.ssc.java.cal;
//GUI 구현을 위해 사용하는 클래스들(awt, swing)
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {

	public Calculator(String title) {
		
		// 기본 프로그램 설정(제목, 크기, 위치)
		this.setTitle(title);
		this.setSize(350, 450);
		this.setLocation(800, 280);
		
		//종료(EXIT_ON_CLOSE를 사용)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		/* 1. 배치 관리자 종류
		 * 1) FlowLayout : 왼쪽에서 오른쪽으로 배치, 오른쪽 공간 없으면 아래로 자동 배치
		 *  - 사용 예제 : FlowLatout(FlowLayout.LEFT, 10, 20); // 왼쪽 정렬, 좌우간격 10, 상하간격 20
		 * 2) BorderLayout : 상하좌우 + 중앙 5개의 영역으로 나눠 배치
		 *  - 사용 예제 : BorderLayout(30,20); //좌우간격 30, 상하간격 20
		 * 3) GridLayout : 2차원 그리드로서 n x n 으로 설정, 왼->오, 위->아래 순 배치 
		 *  - 사용 예제 : GridLayout(4,3,5,50); // 4 x 3 그리드, 좌우간격 5, 상하간격 50
		 * 4) CardLayout : 컴포넌트를 포개어 배치
		 * 5) Null : 레이아웃을 쓰지 않고 각 컴포넌트마다 수동으로 위치 설정해줄 때 사용
		 */
		
		//Panel 선언
		JPanel p_all = new JPanel();		//전체 틀 설정 
		JPanel p_cal = new JPanel();  		//출력창 설정 	
		JPanel p_cont = new JPanel(); 		//버튼 설정 
		
		//폰트 생성
		Font bold = new Font("맑은 고딕", Font.BOLD, 40);
		Font bt_bold = new Font("맑은 고딕", Font.BOLD, 30);
		
		//색깔 생성
		Color gray = new Color(204,204,204);
		Color white = new Color(255,255,255);
		Color light_blue = new Color(153,153,255);
		
		//p_all(전체적인 레이아웃) 설정
		this.add(p_all);
		p_all.setLayout(new FlowLayout());
	
		//p_cal 레이아웃  c
		p_cal.setLayout(new GridLayout(2,1));
		p_cal.setPreferredSize(new Dimension(290,120)); // 레이아웃 크기 설정
		JLabel process = new JLabel("ㅇㅇㅇ",JLabel.RIGHT);		//계산식 출력 
		JLabel result = new JLabel("0",JLabel.RIGHT);			//결과값 출력 
		p_cal.add(process);
		p_cal.add(result);
		
		//p_cal 레이블 정렬
		process.setAlignmentX(RIGHT_ALIGNMENT);
		result.setAlignmentX(RIGHT_ALIGNMENT);
		
		//p_cal 폰트 적용
		result.setFont(bold);
		
		//p_cal 색상 적용
		process.setForeground(Color.gray);
		
		//p_cont 레이아웃
		p_cont.setLayout(new GridLayout(6,4));
		p_cont.setPreferredSize(new Dimension(290,300));
		
		//p_cont 1번줄
		JButton rem = new JButton("%");
		p_cont.add(rem);
		JButton ce = new JButton("CE");
		p_cont.add(ce);
		JButton c = new JButton("C");
		p_cont.add(c);
		JButton b_space = new JButton("←");
		p_cont.add(b_space);
		
		//p_cont 3번줄
		JButton seven = new JButton("7");
		p_cont.add(seven);
		JButton eight = new JButton("8");
		p_cont.add(eight);
		JButton nine = new JButton("9");
		p_cont.add(nine);
		JButton point = new JButton(".");
		p_cont.add(point);
		
		//p_cont 4번줄
		JButton four = new JButton("4");
		p_cont.add(four);
		JButton five = new JButton("5");
		p_cont.add(five);
		JButton six = new JButton("6");
		p_cont.add(six);
		JButton minus = new JButton("-");
		p_cont.add(minus);
		
		//p_cont 5번줄
		JButton one = new JButton("1");
		p_cont.add(one);
		JButton two = new JButton("2");
		p_cont.add(two);
		JButton three = new JButton("3");
		p_cont.add(three);
		JButton plus = new JButton("+");
		p_cont.add(plus);
				
		//p_cont 6번줄
		JButton div = new JButton("%");
		p_cont.add(div);
		JButton zero = new JButton("0");
		p_cont.add(zero);
		JButton mul = new JButton("x");
		p_cont.add(mul);
		JButton equal = new JButton("=");
		p_cont.add(equal);
		
		//p_cont 폰트 사이즈 설정
		zero.setFont(bt_bold);
		one.setFont(bt_bold);
		two.setFont(bt_bold);
		three.setFont(bt_bold);
		four.setFont(bt_bold);
		five.setFont(bt_bold);
		six.setFont(bt_bold);
		seven.setFont(bt_bold);
		eight.setFont(bt_bold);
		nine.setFont(bt_bold);
		
		//p_cont 버튼 배경색 설정
		rem.setBackground(gray);
		ce.setBackground(gray);
		c.setBackground(gray);
		b_space.setBackground(gray);
		div.setBackground(gray);
		mul.setBackground(gray);
		minus.setBackground(gray);
		plus.setBackground(gray);
		point.setBackground(gray);
		
		equal.setBackground(light_blue);
		
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
		
		//전체내용
		p_all.add(p_cal);
		p_all.add(p_cont);
		
		//창 보이기 설정(true : 보임 , false 안보임)
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// Corine의 계산기 실행
		new Calculator("계산기");
	}

}