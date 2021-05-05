package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
JFrame frame=new JFrame();
JLabel label=new JLabel();
JPanel panel=new JPanel();
JButton add=new JButton();
JButton sub=new JButton();
JButton mult=new JButton();
JButton div=new JButton();
JTextField text1=new JTextField(10);
JTextField text2=new JTextField(10);

public void setup(){
	frame.setVisible(true);
	add.setText("add");
	sub.setText("subtract");
	mult.setText("multiply");
	div.setText("divide");
	label.setText("Calculator");
	panel.add(add);
	panel.add(sub);
	panel.add(mult);
	panel.add(div);
	panel.add(label);
	panel.add(text1);
	panel.add(text2);
	frame.pack();
	
	
}
}
