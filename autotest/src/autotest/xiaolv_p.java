package autotest;

import java.awt.BorderLayout;
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
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class xiaolv_p {

	private JFrame frame;
	private JTextField Tshebeihao;
	private JTextField Triqi;
	private JTextField Tbanciming;
	private JTable table;

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
		frame.setBounds(100, 100, 607, 311);
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
		Iriqi.setBounds(306, 10, 102, 15);
		frame.getContentPane().add(Iriqi);
		
		Triqi = new JTextField();
		Triqi.setBounds(418, 7, 134, 21);
		frame.getContentPane().add(Triqi);
		Triqi.setColumns(10);
		
		Tbanciming = new JTextField();
		Tbanciming.setBackground(Color.WHITE);
		
		JLabel Ibanciming = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21\u540D\u79F0");
		Ibanciming.setBounds(29, 49, 102, 15);
		frame.getContentPane().add(Ibanciming);
		
		
		Tbanciming.setBounds(141, 46, 134, 21);
		frame.getContentPane().add(Tbanciming);
		Tbanciming.setColumns(10);
		
		JButton Bchaxun = new JButton("\u67E5\u8BE2");
		Bchaxun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					xiaolv_day.result=Tshebeihao.getText();
					xiaolv_day.resulttime=Triqi.getText();
					xiaolv_day.main(null);
				
				
					xiaolv_work.Bresult=Tshebeihao.getText();
					xiaolv_work.Bresulttime=Triqi.getText();
					xiaolv_work.Bbanciname=Tbanciming.getText();
					xiaolv_work.main(null);
				
				
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
	
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					//清空之前显示
					dtm.setRowCount(0);
					Vector v = new Vector();
					Vector v2 = new Vector();
					Vector v3 = new Vector();
					Vector v4 = new Vector();
					Vector v5 = new Vector();
					
					v.add("按班次--"+xiaolv_work.Bbanciname+"");v.add(xiaolv_work.Brunrate);v.add(xiaolv_work.Bactivation);
					v2.add("按天");v2.add(xiaolv_day.runrate);v2.add(xiaolv_day.activation);
					v3.add("按周");v3.add(yunxinglv_zyn.runrateweek);v3.add(jiadonglv_zyn.activation);
					v4.add("按月");v4.add(yunxinglv_zyn.runratemonth);v4.add(jiadonglv_zyn.activationmonth);
					v5.add("按年");v5.add(yunxinglv_zyn.runrateyear);v5.add(jiadonglv_zyn.activationyear);
					dtm.addRow(v);
					dtm.addRow(v2);
					dtm.addRow(v3);
					dtm.addRow(v4);
					dtm.addRow(v5);
					
					xiaolv_day.Total=0;
					xiaolv_day.Run=0;
					xiaolv_day.JNei=0;
					xiaolv_day.JWai=0;
					xiaolv_work.BTotal=0;
					xiaolv_work.BRun=0;
					xiaolv_work.BJNei=0;
					xiaolv_work.BJWai=0;
					for(int j = 0;j<100;j++){
						xiaolv_day.Tarr[j]=0;
						xiaolv_day.Rarr[j]=0;
						xiaolv_day.JNarr[j]=0;
					     xiaolv_day.JWarr[j]=0;
					     xiaolv_work.BTarr[j]=0;
							xiaolv_work.BRarr[j]=0;
							xiaolv_work.BJNarr[j]=0;
							xiaolv_work.BJWarr[j]=0;
					}
					
					
				
			}
		});
		Bchaxun.setBounds(237, 95, 93, 23);
		frame.getContentPane().add(Bchaxun);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(173, 129, 235, 133);
		frame.getContentPane().add(panel);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"查询方式", "运行率", "稼动率"
			}
		));
		panel.add(table.getTableHeader(), BorderLayout.NORTH);
		panel.add(table, BorderLayout.CENTER);
	}
}
