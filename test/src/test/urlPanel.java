package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class urlPanel {

	private JFrame frame;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					urlPanel window = new urlPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public urlPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u6570\u636E\u5E93\u540D\u79F0");
		label.setBounds(91, 70, 105, 15);
		frame.getContentPane().add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 67, 180, 21);
		frame.getContentPane().add(textField_2);
		
		JButton button = new JButton("\u6548\u7387\u8D8B\u52BF");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				test.database=textField_2.getText();
				panel.main(null);
				
			}
		});
		button.setBounds(103, 126, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u4EA7\u91CF\u7EDF\u8BA1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test.database=textField_2.getText();
				chanlaingPanel.main(null);
			}
		});
		button_1.setBounds(243, 126, 93, 23);
		frame.getContentPane().add(button_1);
	}
}
