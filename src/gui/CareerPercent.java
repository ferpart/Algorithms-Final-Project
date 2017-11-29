package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CareerPercent {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public CareerPercent() {
		initialize();
	}
	
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CareerPercent window = new CareerPercent();
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
		frame.getContentPane().setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel iscPanel = new JPanel();
		frame.getContentPane().add(iscPanel);
		iscPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblIscCompatibility = new JLabel("ISC Compatibility: ");
		lblIscCompatibility.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIscCompatibility.setHorizontalAlignment(SwingConstants.TRAILING);
		iscPanel.add(lblIscCompatibility);
		
		JButton btnISC = new JButton("Check Courses");
		iscPanel.add(btnISC);
		
		JPanel ldiPanel = new JPanel();
		frame.getContentPane().add(ldiPanel);
		ldiPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lablldiCompatibility = new JLabel("LDI Compatibility: ");
		lablldiCompatibility.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lablldiCompatibility.setHorizontalAlignment(SwingConstants.TRAILING);
		ldiPanel.add(lablldiCompatibility);
		
		JButton btnLDI = new JButton("Check Courses");
		ldiPanel.add(btnLDI);
		
		JPanel mcPanel = new JPanel();
		frame.getContentPane().add(mcPanel);
		mcPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lablmcCompatibility = new JLabel("MC Compatibility: ");
		lablmcCompatibility.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mcPanel.add(lablmcCompatibility);
		lablmcCompatibility.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JButton btnMC = new JButton("Check Courses");
		mcPanel.add(btnMC);
	}

}
