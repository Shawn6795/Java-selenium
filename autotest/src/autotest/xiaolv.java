package autotest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class xiaolv {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_4;
	 String rt="0";
	 String rtt="0";
	 private JLabel label_5;
	 private JLabel label_6;
	 private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xiaolv window = new xiaolv();
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
	public xiaolv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u6548\u7387\u8D8B\u52BF");
		frame.setBounds(100, 100, 372, 404);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8BBE\u5907\u7F16\u53F7");
		label.setBounds(66, 43, 94, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.setBounds(170, 40, 132, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u65E5\u671F");
		label_1.setBounds(66, 88, 94, 15);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_1.setBounds(170, 85, 132, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setEnabled(false);
		textField_4.setBounds(170, 179, 132, 21);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton radioButton = new JRadioButton("\u6309\u5929");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u6309\u73ED\u6B21");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					textField_4.setEnabled(false);
					textField_4.setBackground(Color.LIGHT_GRAY);
					textField_4.setText(null);
					
			}
			}
		});
		radioButton.setBounds(170, 137, 54, 23);
		frame.getContentPane().add(radioButton);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					radioButton.setSelected(false);
					textField_4.setEnabled(true);
					textField_4.setBackground(Color.WHITE);
					
				}
				
			}
		});
		rdbtnNewRadioButton.setBounds(226, 137, 76, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioButton.isSelected()) {
				xiaolv_day.result=textField.getText();
				xiaolv_day.resulttime=textField_1.getText();
				xiaolv_day.main(null);
				textField_2.setText(" "+xiaolv_day.runrate);
				textField_3.setText(" "+xiaolv_day.activation);
				xiaolv_day.Total=0;
				xiaolv_day.Run=0;
				xiaolv_day.JNei=0;
				xiaolv_day.JWai=0;
				for(int j = 0;j<100;j++){
					xiaolv_day.Tarr[j]=0;
					xiaolv_day.Rarr[j]=0;
					xiaolv_day.JNarr[j]=0;
				     xiaolv_day.JWarr[j]=0;
				}
				}else if(rdbtnNewRadioButton.isSelected()) {
					xiaolv_work.Bresult=textField.getText();
					xiaolv_work.Bresulttime=textField_1.getText();
					xiaolv_work.Bbanciname=textField_4.getText();
					xiaolv_work.main(null);
					textField_2.setText(" "+xiaolv_work.Brunrate);
					textField_3.setText(" "+xiaolv_work.Bactivation);
					xiaolv_work.BTotal=0;
					xiaolv_work.BRun=0;
					xiaolv_work.BJNei=0;
					xiaolv_work.BJWai=0;
					for(int j = 0;j<100;j++){
						xiaolv_work.BTarr[j]=0;
						xiaolv_work.BRarr[j]=0;
						xiaolv_work.BJNarr[j]=0;
						xiaolv_work.BJWarr[j]=0;
					
				}
				
			}
			}
		});
		btnNewButton.setBounds(143, 220, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label_2 = new JLabel("\u8FD0\u884C\u7387");
		label_2.setBounds(106, 278, 54, 15);
		frame.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_2.setBounds(170, 268, 132, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7A3C\u52A8\u7387");
		label_3.setBounds(106, 319, 54, 15);
		frame.getContentPane().add(label_3);
		
		
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		textField_3.setForeground(Color.BLACK);
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_3.setBounds(170, 309, 132, 32);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		label_4 = new JLabel("\u683C\u5F0F\uFF1A\u5E74-\u6708-\u65E5");
		label_4.setFont(new Font("ËÎÌו", Font.PLAIN, 10));
		label_4.setBounds(170, 116, 132, 15);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("\u8BF7\u9009\u62E9\u7EDF\u8BA1\u65B9\u5F0F");
		label_5.setBounds(66, 140, 94, 15);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21\u540D\u79F0");
		label_6.setBounds(66, 182, 94, 15);
		frame.getContentPane().add(label_6);
		
		
		
		
	}
}
