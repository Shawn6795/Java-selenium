package autotest;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class xiaolv_p {

	private JFrame frame;
	private JTextField Tshebeihao;
	private JTextField Triqi;
	private JTextField Tbanciming;
	private JTextField Tyunxinglv;
	private JTextField Tjiadonglv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xiaolv_p window = new xiaolv_p();
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
	public xiaolv_p() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u6548\u7387\u8D8B\u52BF");
		frame.setBounds(100, 100, 348, 409);
		frame.dispose();
		frame.getContentPane().setLayout(null);
		
		JLabel Ishebeihao = new JLabel("\u8BF7\u8F93\u5165\u8BBE\u5907\u7F16\u53F7");
		Ishebeihao.setBounds(29, 10, 102, 15);
		frame.getContentPane().add(Ishebeihao);
		
		Tshebeihao = new JTextField();
		Tshebeihao.setBounds(141, 7, 134, 21);
		frame.getContentPane().add(Tshebeihao);
		Tshebeihao.setColumns(10);
		
		JLabel Iriqi = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u65E5\u671F");
		Iriqi.setBounds(29, 46, 102, 15);
		frame.getContentPane().add(Iriqi);
		
		Triqi = new JTextField();
		Triqi.setBounds(141, 43, 134, 21);
		frame.getContentPane().add(Triqi);
		Triqi.setColumns(10);
		
		JLabel Itongji = new JLabel("\u8BF7\u9009\u62E9\u7EDF\u8BA1\u65B9\u5F0F");
		Itongji.setBounds(29, 85, 102, 15);
		frame.getContentPane().add(Itongji);
		
		Tbanciming = new JTextField();
		Tbanciming.setBackground(Color.LIGHT_GRAY);
		Tbanciming.setEnabled(false);
		JRadioButton Rbanci = new JRadioButton("\u6309\u73ED\u6B21");
		JRadioButton Rzhou = new JRadioButton("\u6309\u5468");
		JRadioButton Ryue = new JRadioButton("\u6309\u6708");
		JRadioButton Rnian = new JRadioButton("\u6309\u5E74");
		JRadioButton Rtian = new JRadioButton("\u6309\u5929");
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
		Rbanci.setBounds(141, 81, 66, 23);
		frame.getContentPane().add(Rbanci);
		
		
		Rtian.setBounds(209, 81, 66, 23);
		frame.getContentPane().add(Rtian);
		
		
		Rzhou.setBounds(141, 110, 66, 23);
		frame.getContentPane().add(Rzhou);
		
		
		Ryue.setBounds(209, 106, 66, 23);
		frame.getContentPane().add(Ryue);
		
		
		Rnian.setBounds(141, 135, 66, 23);
		frame.getContentPane().add(Rnian);
		
		JLabel Ibanciming = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21\u540D\u79F0");
		Ibanciming.setBounds(29, 174, 102, 15);
		frame.getContentPane().add(Ibanciming);
		
		
		Tbanciming.setBounds(141, 171, 134, 21);
		frame.getContentPane().add(Tbanciming);
		Tbanciming.setColumns(10);
		
		JButton Bchaxun = new JButton("\u67E5\u8BE2");
		Bchaxun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Rtian.isSelected()) {
					xiaolv_day.result=Tshebeihao.getText();
					xiaolv_day.resulttime=Triqi.getText();
					xiaolv_day.main(null);
					Tyunxinglv.setText(" "+xiaolv_day.runrate);
					Tjiadonglv.setText(" "+xiaolv_day.activation);
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
				}
				else if(Rbanci.isSelected()) {
					xiaolv_work.Bresult=Tshebeihao.getText();
					xiaolv_work.Bresulttime=Triqi.getText();
					xiaolv_work.Bbanciname=Tbanciming.getText();
					xiaolv_work.main(null);
					Tyunxinglv.setText(" "+xiaolv_work.Brunrate);
					Tjiadonglv.setText(" "+xiaolv_work.Bactivation);
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
				else if(Rzhou.isSelected()) {
					yunxinglv_zyn.result=Tshebeihao.getText();
					yunxinglv_zyn.resulttime=Triqi.getText();
					try {
						yunxinglv_zyn.main(null);
						jiadonglv_zyn.main(null);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Tyunxinglv.setText(" "+yunxinglv_zyn.runrateweek);
					Tjiadonglv.setText(" "+jiadonglv_zyn.activation);
					
				}
				else if(Ryue.isSelected()) {
					yunxinglv_zyn.result=Tshebeihao.getText();
					yunxinglv_zyn.resulttime=Triqi.getText();
					try {
						yunxinglv_zyn.main(null);
						jiadonglv_zyn.main(null);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Tyunxinglv.setText(" "+yunxinglv_zyn.runratemonth);
					Tjiadonglv.setText(" "+jiadonglv_zyn.activationmonth);
				}
				else if(Rnian.isSelected()) {
					yunxinglv_zyn.result=Tshebeihao.getText();
					yunxinglv_zyn.resulttime=Triqi.getText();
					try {
						yunxinglv_zyn.main(null);
						jiadonglv_zyn.main(null);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Tyunxinglv.setText(" "+yunxinglv_zyn.runrateyear);
					Tjiadonglv.setText(" "+jiadonglv_zyn.activationyear);
				}
				
				
			}
		});
		Bchaxun.setBounds(114, 218, 93, 23);
		frame.getContentPane().add(Bchaxun);
		
		JLabel lyunxinglv = new JLabel("\u8FD0\u884C\u7387");
		lyunxinglv.setBounds(77, 277, 54, 15);
		frame.getContentPane().add(lyunxinglv);
		
		Tyunxinglv = new JTextField();
		Tyunxinglv.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		Tyunxinglv.setBackground(Color.LIGHT_GRAY);
		Tyunxinglv.setBounds(141, 268, 93, 29);
		frame.getContentPane().add(Tyunxinglv);
		Tyunxinglv.setColumns(10);
		
		JLabel ljiadonglv = new JLabel("\u7A3C\u52A8\u7387");
		ljiadonglv.setBounds(77, 314, 54, 15);
		frame.getContentPane().add(ljiadonglv);
		
		Tjiadonglv = new JTextField();
		Tjiadonglv.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		Tjiadonglv.setBackground(Color.LIGHT_GRAY);
		Tjiadonglv.setBounds(141, 307, 93, 29);
		frame.getContentPane().add(Tjiadonglv);
		Tjiadonglv.setColumns(10);
	}
}
