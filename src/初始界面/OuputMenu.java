package 初始界面;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import 计时.time;

public class OuputMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		OuputMenu frame = new OuputMenu();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public OuputMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7EC6\u80DE\u751F\u547D\u6E38\u620F");
		lblNewLabel.setFont(new Font("微软雅黑 Light", Font.BOLD, 17));
		lblNewLabel.setBounds(190, 13, 116, 38);
		panel.add(lblNewLabel);
		
		JButton button = new JButton("\u5F00\u59CB\u6E38\u620F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                  
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 16));
		button.setBounds(193, 200, 113, 27);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				time tool=new time();
				tool.start();
			}
		});
		panel.add(button);
	}
}
