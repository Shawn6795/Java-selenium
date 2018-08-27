package autotest;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class panel {

	private JFrame frame;
	private JTextField MDCtextField;
	private JTextField DMPtextField;
	private JTextField DatabasetextField;
	
	
	public static String MDCurl;
	public static String DMPurl;
	public static String Databasename;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel window = new panel();
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
	public panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u81EA\u52A8\u5316\u6D4B\u8BD5\u5DE5\u5177");
		frame.setBounds(100, 100, 520, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel MDCLabel = new JLabel("MDC\u7F51\u5740");
		MDCLabel.setBounds(13, 12, 54, 15);
		frame.getContentPane().add(MDCLabel);
		
		MDCtextField = new JTextField();
		MDCtextField.setBounds(81, 9, 154, 21);
		frame.getContentPane().add(MDCtextField);
		MDCtextField.setColumns(10);
		
		JLabel DMPLabel = new JLabel("DMP\u7F51\u5740");
		DMPLabel.setBounds(271, 12, 54, 15);
		frame.getContentPane().add(DMPLabel);
		
		DMPtextField = new JTextField();
		DMPtextField.setBounds(335, 9, 159, 21);
		frame.getContentPane().add(DMPtextField);
		DMPtextField.setColumns(10);
		
		JLabel Databaselabel = new JLabel("\u6570\u636E\u5E93\u540D\u79F0");
		Databaselabel.setBounds(10, 51, 73, 15);
		frame.getContentPane().add(Databaselabel);
		
		DatabasetextField = new JTextField();
		DatabasetextField.setBounds(81, 48, 154, 21);
		frame.getContentPane().add(DatabasetextField);
		DatabasetextField.setColumns(10);
		
		
		
		JButton Shebeibutton = new JButton("\u8BBE\u5907\u4E0E\u8BBE\u5907\u7EC4");
		Shebeibutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					shebei.main(null);
					Shebeibutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Shebeibutton.setBackground(Color.RED);
				}
			
			}
		});
		Shebeibutton.setBounds(26, 118, 114, 38);
		frame.getContentPane().add(Shebeibutton);
		
		JButton Bancibutton = new JButton("\u73ED\u6B21\u4E0E\u6392\u73ED");
		Bancibutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					banci.main(null);
					Bancibutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Bancibutton.setBackground(Color.RED);
				}
			}
		});
		Bancibutton.setBounds(197, 118, 114, 38);
		frame.getContentPane().add(Bancibutton);
		
		JButton Kehuduanbutton = new JButton("\u5FEB\u901F\u5BA2\u6237\u7AEF");
		Kehuduanbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					kehuduan.main(null);
					Kehuduanbutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Kehuduanbutton.setBackground(Color.RED);
				}
			}
		});
		Kehuduanbutton.setBounds(368, 118, 114, 38);
		frame.getContentPane().add(Kehuduanbutton);
		
		JButton Zhibiaobutton = new JButton("\u5B9E\u65F6\u751F\u4EA7\u6307\u6807");
		Zhibiaobutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					zhibiao.main(null);
					Zhibiaobutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Zhibiaobutton.setBackground(Color.RED);
				}
			}
		});
		Zhibiaobutton.setBounds(26, 210, 114, 38);
		frame.getContentPane().add(Zhibiaobutton);
		
		JButton Xiaolvbutton = new JButton("\u6548\u7387\u8D8B\u52BF");
		Xiaolvbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					xiaolv.main(null);
					Xiaolvbutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Xiaolvbutton.setBackground(Color.RED);
				}
			}
		});
		Xiaolvbutton.setBounds(198, 209, 114, 38);
		frame.getContentPane().add(Xiaolvbutton);
		
		JButton Chanliangbutton = new JButton("\u4EA7\u91CF\u7EDF\u8BA1");
		Chanliangbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					chanliang.main(null);
					Chanliangbutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Chanliangbutton.setBackground(Color.RED);
				}
			}
		});
		Chanliangbutton.setBounds(368, 210, 114, 38);
		frame.getContentPane().add(Chanliangbutton);
		
		JButton Gongdanbutton = new JButton("\u5DE5\u5355");
		Gongdanbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					gongdan.main(null);
					Gongdanbutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Gongdanbutton.setBackground(Color.RED);
				}
			}
		});
		Gongdanbutton.setBounds(26, 296, 114, 38);
		frame.getContentPane().add(Gongdanbutton);
		
		JButton Daojubutton = new JButton("\u5200\u5177\u7BA1\u7406");
		Daojubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					daoju.main(null);
					Daojubutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Daojubutton.setBackground(Color.RED);
				}
			}
		});
		Daojubutton.setBounds(197, 297, 114, 38);
		frame.getContentPane().add(Daojubutton);
		
		JButton Visionbutton = new JButton("\u770B\u677F");
		Visionbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					vision.main(null);
					Visionbutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Visionbutton.setBackground(Color.RED);
				}
			}
		});
		Visionbutton.setBounds(366, 298, 114, 38);
		frame.getContentPane().add(Visionbutton);
		
		JLabel lblDesignByShawn = new JLabel("Developed by Shawn\u00B7Shao");
		lblDesignByShawn.setForeground(Color.LIGHT_GRAY);
		lblDesignByShawn.setBounds(335, 371, 159, 15);
		frame.getContentPane().add(lblDesignByShawn);
		
		JButton Baobiaobutton = new JButton("\u62A5\u8868");
		Baobiaobutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MDCurl=MDCtextField.getText();
				DMPurl=DMPtextField.getText();
				Databasename=DatabasetextField.getText();
				
				try {
					baobiao.main(null);
					Baobiaobutton.setBackground(Color.GREEN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
                 	e.printStackTrace();
                 	Baobiaobutton.setBackground(Color.RED);
				}
			}
		});
		Baobiaobutton.setBounds(368, 47, 114, 38);
		frame.getContentPane().add(Baobiaobutton);
	}
}
