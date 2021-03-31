package _01_nasty_surprise;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel=new JPanel(); 
	JButton treatbutton=new JButton();
	JButton trickbutton=new JButton();
	public nastysurprise() {
		frame.setVisible(true);
		treatbutton.addActionListener(this);
		trickbutton.addActionListener(this);
		treatbutton.setText("treat");
		trickbutton.setText("trick");
	panel.add(treatbutton);
	panel.add(trickbutton);
	frame.add(panel);
		frame.pack();
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	if (treatbutton==arg0.getSource()) {
		showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg");
	}
	if(trickbutton==arg0.getSource()) {
		showPictureFromTheInternet("https://i.ebayimg.com/images/g/NpEAAOSwr7ZW3ru5/s-l400.jpg");
	}
	}
}
