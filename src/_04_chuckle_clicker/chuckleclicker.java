package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	public static void main(String[] args) {
	}
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	JButton button2=new JButton();
	
	public chuckleclicker() {
		frame.setVisible(true);
		button.addActionListener(this);
		button2.addActionListener(this);
		button.setText("Joke");
		button2.setText("Punchline");
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(100,100);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (button==arg0.getSource()) {
			JOptionPane.showMessageDialog(null, "Never trust an atom...");
		}
		if (button==arg0.getSource()) {
			JOptionPane.showMessageDialog(null, "They make up everything!");
		}
	}
	}
	


