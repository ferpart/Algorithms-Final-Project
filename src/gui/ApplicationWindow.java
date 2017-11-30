package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class ApplicationWindow {
	
	private SearchByCourse search_course = new SearchByCourse();
	private SearchByCareer search_career = new SearchByCareer();

	private JFrame frame1;
	//private JFrame frame2;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public void startMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void start() {
		frame1.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 500, 250);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		frame1.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSelectAnOption = new JLabel("Select an Option:");
		lblSelectAnOption.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(lblSelectAnOption);
		lblSelectAnOption.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		frame1.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnSearchByCareer = new JButton("Search By Career");
		panel.add(btnSearchByCareer);
		
		btnSearchByCareer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame1.setVisible(false);
				search_career.Start();
			}
		});
		
		
		JButton btnSearchByCourse = new JButton("Search by Course");
		panel.add(btnSearchByCourse);
		
		btnSearchByCourse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame1.setVisible(false);
				search_course.Start();
			}
		});
		
		
	}
}
