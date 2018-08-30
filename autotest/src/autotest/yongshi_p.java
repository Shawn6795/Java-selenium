package autotest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class yongshi_p {

	private JFrame frame;
	private JTextField Tshebeihao;
	private JTextField Triqi;
	private JTextField Tbanciming;
	public static String Stopday;
	private JPanel panel;
	private JTable table_1;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yongshi_p window = new yongshi_p();
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
	public yongshi_p() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 352);
		frame.dispose();
		frame.getContentPane().setLayout(null);
		
		JLabel Ishebeihao = new JLabel("\u8BF7\u8F93\u5165\u8BBE\u5907\u7F16\u53F7");
		Ishebeihao.setBounds(45, 37, 105, 15);
		frame.getContentPane().add(Ishebeihao);
		
		Tshebeihao = new JTextField();
		Tshebeihao.setBounds(140, 34, 128, 21);
		frame.getContentPane().add(Tshebeihao);
		Tshebeihao.setColumns(10);
		
		JLabel Iriqi = new JLabel("\u8BF7\u8F93\u5165\u67E5\u8BE2\u65E5\u671F");
		Iriqi.setBounds(297, 37, 105, 15);
		frame.getContentPane().add(Iriqi);
		
		Triqi = new JTextField();
		Triqi.setColumns(10);
		Triqi.setBounds(398, 34, 128, 21);
		frame.getContentPane().add(Triqi);
		
		JLabel Ibanciming = new JLabel("\u8BF7\u8F93\u5165\u73ED\u6B21");
		Ibanciming.setBounds(45, 90, 105, 15);
		frame.getContentPane().add(Ibanciming);
		
		Tbanciming = new JTextField();
		Tbanciming.setBounds(140, 87, 128, 21);
		frame.getContentPane().add(Tbanciming);
		Tbanciming.setColumns(10);
		
		JButton Bchaxun = new JButton("\u67E5\u8BE2");
		Bchaxun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				yongshi_tzny.shebeihao=Tshebeihao.getText();
				yongshi_tzny.riqi=Triqi.getText();
				yongshi_work.shebeihao=Tshebeihao.getText();
				yongshi_work.riqi=Triqi.getText();
				yongshi_work.banciming=Tbanciming.getText();
				try {
					yongshi_tzny.main(null);
					yongshi_work.main(null);
				} catch (ClassNotFoundException | SQLException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table_1.getModel();
				//清空之前显示
				dtm.setRowCount(0);
				Vector v = new Vector();
				Vector v2 = new Vector();
				Vector v3 = new Vector();
				Vector v4 = new Vector();
				Vector v5 = new Vector();
				v.add("按班次");v.add(yongshi_work.Stopday);v.add(yongshi_work.RunTimeday);v.add(yongshi_work.Freeday);v.add(yongshi_work.Offlineday);v.add(yongshi_work.Debugday);
				v2.add("按天");v2.add(yongshi_tzny.Stopday);v2.add(yongshi_tzny.RunTimeday);v2.add(yongshi_tzny.Freeday);v2.add(yongshi_tzny.Offlineday);v2.add(yongshi_tzny.Debugday);
				v3.add("按周");v3.add(yongshi_tzny.Stopweek);v3.add(yongshi_tzny.RunTimeweek);v3.add(yongshi_tzny.Freeweek);v3.add(yongshi_tzny.Offlineweek);v3.add(yongshi_tzny.Debugweek);
				v4.add("按月");v4.add(yongshi_tzny.Stopmonth);v4.add(yongshi_tzny.RunTimemonth);v4.add(yongshi_tzny.Freemonth);v4.add(yongshi_tzny.Offlinemonth);v4.add(yongshi_tzny.Debugmonth);
				v5.add("按年");v5.add(yongshi_tzny.Stopyear);v5.add(yongshi_tzny.RunTimeyear);v5.add(yongshi_tzny.Freeyear);v5.add(yongshi_tzny.Offlineyear);v5.add(yongshi_tzny.Debugyear);
				dtm.addRow(v);
				dtm.addRow(v2);
				dtm.addRow(v3);
				dtm.addRow(v4);
				dtm.addRow(v5);
				
				 for(int i=0;i<5;i++) {
	            	 yongshi_tzny.Offline[i]=0;
	            	 yongshi_tzny.Free[i]=0;
	            	 yongshi_tzny.Totaltime[i]=0;
	            	 yongshi_tzny.Debug[i]=0;
	            	 yongshi_tzny.RunTime[i]=0;
	            	 yongshi_tzny.Stop[i]=0;
	              }
				 yongshi_tzny.Offlinesum=0;
				 yongshi_tzny.Freesum=0;
				 yongshi_tzny.Totaltimesum=0;
				 yongshi_tzny.Debugsum=0;
				 yongshi_tzny.RunTimesum=0;
				 yongshi_tzny.Stopsum=0;
			}
		});
		Bchaxun.setBounds(243, 128, 93, 23);
		frame.getContentPane().add(Bchaxun);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(45, 170, 492, 121);
		frame.getContentPane().add(panel);
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"查询方式","停机", "运行", "空闲", "离线", "设定"
			}
		));
		panel.add(table_1.getTableHeader(), BorderLayout.NORTH);
		panel.add(table_1, BorderLayout.CENTER);
		

        // 表格所有行数据
        
//		Object[] columnNames = {"查询方式","停机", "运行", "空闲", "离线", "设定"};
//		
//		Object [][] rowData = {
//                {"按班次", 80, 80, 80, 240,0},
//                {"按天", Stopday,yongshi_tzny.RunTimeday,yongshi_tzny.Freeday,yongshi_tzny.Offlineday,yongshi_tzny.Debugday},
//                {"按周", yongshi_tzny.Stopweek,yongshi_tzny.RunTimeweek,yongshi_tzny.Freeweek,yongshi_tzny.Offlineweek,yongshi_tzny.Debugweek},
//                {"按月", yongshi_tzny.Stopmonth,yongshi_tzny.RunTimemonth,yongshi_tzny.Freemonth,yongshi_tzny.Offlinemonth,yongshi_tzny.Debugmonth},
//                {"按年", yongshi_tzny.Stopyear,yongshi_tzny.RunTimeyear,yongshi_tzny.Freeyear,yongshi_tzny.Offlineyear,yongshi_tzny.Debugyear}
//        };
		
		
		
		
		
		
	}
}
