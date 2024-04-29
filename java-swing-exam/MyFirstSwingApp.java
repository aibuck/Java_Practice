package guipack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// 버튼을 누르면 텍스트필드에 쓰여진 값을 사용할 수 있게 하자!
public class MyFirstSwingApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Java Swing");
		
		// 버튼과 텍스트필드 하나씩 추가하기 
		JTextField textfield = new JTextField();
		JButton button = new JButton("입력 확인");
		
		// 1. 텍스트필드와 버튼의 크기 및 위치 알아서 설정
		textfield.setBounds(50,100,120,30);  
		button.setBounds(170,100,90,30);
		// 2. 버튼을 누르면 텍스트필드의 내용이 콘솔출력되게 하기
		// hint. 텍스트필드.getText() 하면 내용 읽힘 
		button.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		System.out.println(textfield.getText());
	        }  
	    });
		
		frame.add(textfield);
		frame.add(button);
		
		frame.setSize(360, 300); // 프레임 크기 설정
		frame.setLayout(null);
		frame.setVisible(true); // 프레임 보기 설정 
		
	}

}
