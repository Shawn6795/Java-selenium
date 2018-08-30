package autotest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class chanliang_p {

	private JFrame frame;
	private JTextField Tshebeihao;
	private JTextField Triqi;
	private JTextField Tchengxuming;
	private JTextField Tbanciming;
	private JTextField Tchanliang;
	private JTable table;

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
		frame.setBounds(100, 100, 621, 322);
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
		Iriqi.setBounds(303, 25, 98, 15);
		frame.getContentPane().add(Iriqi);
		
		Triqi = new JTextField();
		Triqi.setBounds(411, 22, 118, 21);
		frame.getContentPane().add(Triqi);
		Triqi.setColumns(10);
		
		JLabel Ichengximing = new JLabel("\u8BF7\u8F93\u5165\u7A0B\u5E8F\u540D");
		Ichengximing.setBounds(53, 67, 98, 15);
		frame.getContentPane().add(Ichengximing);
		
		Tchengxuming = new JTextField();
		Tchengxuming.setBounds(161, 64, 118, 21);
		frame.getContentPane().add(Tchengxuming);
		Tchengxuming.setColumns(10);
		
		JLabel Ibanciming = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21\u540D\u79F0");
		Ibanciming.setBounds(303, 67, 98, 15);
		frame.getContentPane().add(Ibanciming);
		
		Tbanciming = new JTextField();
		Tbanciming.setBackground(Color.WHITE);
		Tbanciming.setBounds(411, 64, 118, 21);
		frame.getContentPane().add(Tbanciming);
		Tbanciming.setColumns(10);
		Tchanliang = new JTextField();
		JButton Bchaxun = new JButton("\u67E5\u8BE2");
		Bchaxun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chanliang_algorithm.MachineCode=Tshebeihao.getText();
				chanliang_algorithm.time=Triqi.getText();
				chanliang_algorithm.programname=Tchengxuming.getText();
					chanliang_algorithm.banciname=Tbanciming.getText();
				    chanliang_algorithm.main(null);
	
					try {
						chanliang_zyn.main(null);
					} catch (ClassNotFoundException | SQLException | ParseException e1) {
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
					v.add("按班次");v.add(chanliang_algorithm.BYsum);
					v2.add("按天");v2.add(chanliang_algorithm.Ysum);
					v3.add("按周");v3.add(chanliang_zyn.Ysumweek);
					v4.add("按月");v4.add(chanliang_zyn.Ysummonth);
					v5.add("按年");v5.add(chanliang_zyn.Ysumyear);
					dtm.addRow(v);
					dtm.addRow(v2);
					dtm.addRow(v3);
					dtm.addRow(v4);
					dtm.addRow(v5);
					
					for(int j=0;j<100;j++) {
				    	chanliang_zyn.Yarrweek[j]=0;
				    	chanliang_zyn.Yarrmonth[j]=0;
				    	chanliang_zyn.Yarryear[j]=0;
				    	chanliang_algorithm.BYarr[j]=0;
				    	chanliang_algorithm.Yarr[j]=0;
				    	chanliang_algorithm.Yarr[j]=0;
				    	chanliang_algorithm.BYarr[j]=0;
				    }
				    chanliang_zyn.Ysumweek=0;		
				    chanliang_zyn.Ysummonth=0;
				    chanliang_zyn.Ysumyear=0;
					    chanliang_algorithm.Ysum=0;
					    chanliang_algorithm.BYsum=0;
		}
		});
		Bchaxun.setBounds(249, 109, 93, 23);
		frame.getContentPane().add(Bchaxun);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(219, 145, 162, 121);
		frame.getContentPane().add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"查询方式", "产量"
			}
		));
		panel.add(table.getTableHeader(), BorderLayout.NORTH);
		panel.add(table, BorderLayout.CENTER);
	}
}
