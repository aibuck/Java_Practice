package guipack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 그리드레이아웃을 이용해 2행 2열 레이아웃을 가진 창을 만들어보자.
 * 창 안에는 텍스트필드, 버튼, 텍스트필드, 버튼 순서로 요소를 추가하자.
 * 그런 다음... 
 * 첫 번째 버튼을 클릭하면 첫 번째 텍스트필드의 내용이
 * 두 번째 버튼을 클릭하면 두 번째 텍스트필드의 내용이
 * 출력되는 메시지박스를 나타나게 하자! 
 * */
public class MySecondSwingApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Second Swing App");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		JTextField tf1=new JTextField();  
	    JButton bt1=new JButton("FIRST"); 
		JTextField tf2=new JTextField();  
	    JButton bt2=new JButton("SECOND"); 
	    
	    bt1.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){ 
	    		JOptionPane.showMessageDialog(frame, tf1.getText(), "FIRST", JOptionPane.INFORMATION_MESSAGE);
	        }  
	    });  
	    
	    bt2.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){ 
	    		JOptionPane.showMessageDialog(frame, tf2.getText(), "SECOND", JOptionPane.INFORMATION_MESSAGE);
	        }  
	    });  
	    
	    frame.add(tf1); frame.add(bt1);
	    frame.add(tf2); frame.add(bt2);
	    
		frame.setLayout(new GridLayout(2,2));    
		frame.setSize(320,100);  
		frame.setVisible(true); 
	}

}
