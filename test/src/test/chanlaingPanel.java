package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chanlaingPanel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chanlaingPanel window = new chanlaingPanel();
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
	public chanlaingPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4EA7\u91CF\u7EDF\u8BA1");
		frame.setBounds(100, 100, 367, 387);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		frame.getContentPane().setLayout(null);
		
		
		
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8BBE\u5907\u7F16\u53F7");
		label.setBounds(54, 45, 93, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u65E5\u671F");
		label_1.setBounds(54, 73, 93, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u7A0B\u5E8F\u540D");
		label_2.setBounds(54, 104, 93, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u8BF7\u9009\u62E9\u7EDF\u8BA1\u65B9\u5F0F");
		label_3.setBounds(54, 135, 93, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21\u540D\u79F0");
		label_4.setBounds(54, 166, 93, 15);
		frame.getContentPane().add(label_4);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u6309\u5929");
		
		JRadioButton radioButton = new JRadioButton("\u6309\u73ED\u6B21");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioButton.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					textField_4.setEnabled(true);
					textField_4.setBackground(Color.WHITE);
				}
			}
		});
		radioButton.setBounds(209, 131, 69, 23);
		frame.getContentPane().add(radioButton);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
					radioButton.setSelected(false);
					textField_4.setEnabled(false);
					textField_4.setBackground(Color.LIGHT_GRAY);
					textField_4.setText(null);
					
				}
			}
		});
		rdbtnNewRadioButton.setBounds(153, 131, 54, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
				chanliang.MachineCode=textField.getText();
				chanliang.time=textField_1.getText();
				chanliang.programname=textField_2.getText();
				chanliang.main(null);
			    textField_3.setText(" "+chanliang.Ysum);
			    for(int j=0;j<100;j++) {
			    	chanliang.Yarr[j]=0;
			    	chanliang.BYarr[j]=0;
			    }
			    chanliang.BYsum=0;
			    chanliang.Ysum=0;
			    
			}else if(radioButton.isSelected()){
				
				chanliang.MachineCode=textField.getText();
				chanliang.time=textField_1.getText();
				chanliang.programname=textField_2.getText();
				chanliang.banciname=textField_4.getText();
			    chanliang.main(null);
			    textField_3.setText(" "+chanliang.BYsum);
			    
			    for(int j=0;j<100;j++) {
			    	chanliang.BYarr[j]=0;
			    	chanliang.Yarr[j]=0;
			    }
			    chanliang.Ysum=0;
			    chanliang.BYsum=0;
				
			}
			}
		});
		button.setBounds(117, 208, 93, 23);
		frame.getContentPane().add(button);
		
		JLabel label_5 = new JLabel("\u4EA7\u91CF");
		label_5.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		label_5.setBounds(93, 251, 54, 15);
		frame.getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setBounds(157, 42, 110, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 70, 110, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 101, 110, 21);
		frame.getContentPane().add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(157, 163, 110, 21);
		frame.getContentPane().add(textField_4);
		
		
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		textField_3.setBounds(157, 241, 110, 31);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
