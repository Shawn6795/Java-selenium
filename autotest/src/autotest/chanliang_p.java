package autotest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chanliang_p {

	private JFrame frame;
	private JTextField Tshebeihao;
	private JTextField Triqi;
	private JTextField Tchengxuming;
	private JTextField Tbanciming;
	private JTextField Tchanliang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chanliang_p window = new chanliang_p();
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
	public chanliang_p() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4EA7\u91CF\u7EDF\u8BA1");
		frame.setBounds(100, 100, 343, 443);
		frame.dispose();
		frame.getContentPane().setLayout(null);
		
		JLabel Ishebeihao = new JLabel("\u8BF7\u8F93\u5165\u8BBE\u5907\u7F16\u53F7");
		Ishebeihao.setBounds(53, 25, 98, 15);
		frame.getContentPane().add(Ishebeihao);
		
		Tshebeihao = new JTextField();
		Tshebeihao.setBounds(161, 22, 118, 21);
		frame.getContentPane().add(Tshebeihao);
		Tshebeihao.setColumns(10);
		
		JLabel Iriqi = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u65E5\u671F");
		Iriqi.setBounds(53, 68, 98, 15);
		frame.getContentPane().add(Iriqi);
		
		Triqi = new JTextField();
		Triqi.setBounds(161, 65, 118, 21);
		frame.getContentPane().add(Triqi);
		Triqi.setColumns(10);
		
		JLabel Ichengximing = new JLabel("\u8BF7\u8F93\u5165\u7A0B\u5E8F\u540D");
		Ichengximing.setBounds(53, 111, 98, 15);
		frame.getContentPane().add(Ichengximing);
		
		Tchengxuming = new JTextField();
		Tchengxuming.setBounds(161, 108, 118, 21);
		frame.getContentPane().add(Tchengxuming);
		Tchengxuming.setColumns(10);
		
		JLabel Ifangshi = new JLabel("\u8BF7\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F");
		Ifangshi.setBounds(53, 156, 98, 15);
		frame.getContentPane().add(Ifangshi);
		
		JRadioButton Rbanci = new JRadioButton("\u6309\u73ED\u6B21");
		JRadioButton Rtian = new JRadioButton("\u6309\u5929");
		JRadioButton Rzhou = new JRadioButton("\u6309\u5468");
		JRadioButton Ryue = new JRadioButton("\u6309\u6708");
		JRadioButton Rnian = new JRadioButton("\u6309\u5E74");
		Rnian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Rnian.isSelected()) {
					Rbanci.setSelected(false);
					Rtian.setSelected(false);
					Rzhou.setSelected(false);
					Ryue.setSelected(false);
					Tbanciming.setEnabled(false);
					Tbanciming.setBackground(Color.LIGHT_GRAY);
					Tbanciming.setText(null);
			}
			}
		});
		
		
		Ryue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Ryue.isSelected()) {
					Rbanci.setSelected(false);
					Rtian.setSelected(false);
					Rzhou.setSelected(false);
					Rnian.setSelected(false);
					Tbanciming.setEnabled(false);
					Tbanciming.setBackground(Color.LIGHT_GRAY);
					Tbanciming.setText(null);
			}
			}
		});
		
		
		Rzhou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Rzhou.isSelected()) {
					Rbanci.setSelected(false);
					Rtian.setSelected(false);
					Ryue.setSelected(false);
					Rnian.setSelected(false);
					Tbanciming.setEnabled(false);
					Tbanciming.setBackground(Color.LIGHT_GRAY);
					Tbanciming.setText(null);
			}
			}
		});
		
		
		Rtian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Rtian.isSelected()) {
					Rbanci.setSelected(false);
					Rzhou.setSelected(false);
					Ryue.setSelected(false);
					Rnian.setSelected(false);
					Tbanciming.setEnabled(false);
					Tbanciming.setBackground(Color.LIGHT_GRAY);
					Tbanciming.setText(null);
			}
			}
		});
		
		
		Rbanci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Rbanci.isSelected()) {
					Rtian.setSelected(false);
					Rzhou.setSelected(false);
					Ryue.setSelected(false);
					Rnian.setSelected(false);
					Tbanciming.setEnabled(true);
					Tbanciming.setBackground(Color.WHITE);
					//Tbanciming.setText(null);
			}
			}
			});
		Rbanci.setBounds(161, 152, 66, 23);
		frame.getContentPane().add(Rbanci);
		
		
		Rtian.setBounds(229, 152, 66, 23);
		frame.getContentPane().add(Rtian);
		
		
		Rzhou.setBounds(161, 177, 66, 23);
		frame.getContentPane().add(Rzhou);
		
		
		Ryue.setBounds(229, 177, 66, 23);
		frame.getContentPane().add(Ryue);
		
		
		Rnian.setBounds(161, 202, 66, 23);
		frame.getContentPane().add(Rnian);
		
		JLabel Ibanciming = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21\u540D\u79F0");
		Ibanciming.setBounds(53, 246, 98, 15);
		frame.getContentPane().add(Ibanciming);
		
		Tbanciming = new JTextField();
		Tbanciming.setBackground(Color.LIGHT_GRAY);
		Tbanciming.setEnabled(false);
		Tbanciming.setBounds(161, 243, 118, 21);
		frame.getContentPane().add(Tbanciming);
		Tbanciming.setColumns(10);
		Tchanliang = new JTextField();
		JButton Bchaxun = new JButton("\u67E5\u8BE2");
		Bchaxun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chanliang_algorithm.MachineCode=Tshebeihao.getText();
				chanliang_algorithm.time=Triqi.getText();
				chanliang_algorithm.programname=Tchengxuming.getText();
				if(Rtian.isSelected()) {
					
					
					chanliang_algorithm.main(null);
				    Tchanliang.setText(" "+chanliang_algorithm.Ysum);
				    for(int j=0;j<100;j++) {
				    	chanliang_algorithm.Yarr[j]=0;
				    	chanliang_algorithm.BYarr[j]=0;
				    }
				    chanliang_algorithm.BYsum=0;
				    chanliang_algorithm.Ysum=0;
				    
				}else if(Rbanci.isSelected()){
					
					
					
					chanliang_algorithm.banciname=Tbanciming.getText();
				    chanliang_algorithm.main(null);
				    Tchanliang.setText(" "+chanliang_algorithm.BYsum);
				    
				    for(int j=0;j<100;j++) {
				    	chanliang_algorithm.BYarr[j]=0;
				    	chanliang_algorithm.Yarr[j]=0;
				    }
				    chanliang_algorithm.Ysum=0;
				    chanliang_algorithm.BYsum=0;
					
				}
			
			}
		});
		Bchaxun.setBounds(111, 299, 93, 23);
		frame.getContentPane().add(Bchaxun);
		
		JLabel Ichanliang = new JLabel("\u4EA7\u91CF");
		Ichanliang.setBounds(111, 355, 54, 15);
		frame.getContentPane().add(Ichanliang);
		
		Tchanliang = new JTextField();
		Tchanliang.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		Tchanliang.setBackground(Color.LIGHT_GRAY);
		Tchanliang.setBounds(161, 347, 93, 31);
		frame.getContentPane().add(Tchanliang);
		Tchanliang.setColumns(10);
	}
}
