package swingtest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.time.temporal.JulianFields;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SampleTextFiield extends JFrame {
	public static void main(String[] args) {
		SampleTextFiield frame = new SampleTextFiield();
		frame.setTitle("SampleTextFiield");
		frame.setBounds(550, 350, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	SampleTextFiield(){
		JTextField text = new JTextField();
		text.setColumns(25);
		
		JPanel p = new JPanel();
		p.add(text);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
