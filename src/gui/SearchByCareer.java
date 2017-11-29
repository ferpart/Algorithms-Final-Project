package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JButton;


public class SearchByCareer {

	private JFrame frame;
	
	private CareerPlan plan = new CareerPlan();

	public SearchByCareer() {
		initialize();
	}
	
	public void Start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchByCareer window = new SearchByCareer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel title = new JPanel();
		frame.getContentPane().add(title);
		title.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCareers = new JLabel("Careers: ");
		lblCareers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCareers.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.add(lblCareers);
		
		JPanel careers = new JPanel();
		frame.getContentPane().add(careers);
		careers.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnISC = new JButton("ISC");
		careers.add(btnISC);
		btnISC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				plan.Start("ISC");
				
			}
		});
		
		JButton btnLDI = new JButton("LDI");
		careers.add(btnLDI);
		btnLDI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				plan.Start("LDI");
			}
		});
		
		JButton btnMC = new JButton("MC");
		careers.add(btnMC);
		btnMC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				plan.Start("MC");
			}
		});
	}

}
