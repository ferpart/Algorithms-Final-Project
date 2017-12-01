package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;

public class CareerPercent {
	
	public Integer[] temp= {0,0,0};

	private JFrame frame;
	private CareerPlan plan = new CareerPlan();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the application.
	 */
	public CareerPercent(Integer[] x) {
		initialize(x);
	}
	
	public void start(Integer[] x) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CareerPercent window = new CareerPercent(x);
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
	private void initialize(Integer[] x) {
		//System.out.println(x.toString());
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel topPanel = new JPanel();
		frame.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblIngenieriaEnSistemas = new JLabel("Ingenieria en Sistemas Computacionales");
		lblIngenieriaEnSistemas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngenieriaEnSistemas.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(lblIngenieriaEnSistemas);
		
		JButton btnISC = new JButton("Career Plan");
		topPanel.add(btnISC);
		
		btnISC.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					plan.Start("ISC");
				}
			
		});
		
		JPanel middlePanel = new JPanel();
		frame.getContentPane().add(middlePanel);
		middlePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblLicenciaturaEnDiseo = new JLabel("Licenciatura en Dise\u00F1o Industrial");
		lblLicenciaturaEnDiseo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLicenciaturaEnDiseo.setHorizontalAlignment(SwingConstants.CENTER);
		middlePanel.add(lblLicenciaturaEnDiseo);
		
		JButton btnLDI = new JButton("Career Plan");
		middlePanel.add(btnLDI);
		
		btnLDI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					plan.Start("LDI");
				}
			
		});
		
		JPanel bottomPanel = new JPanel();
		frame.getContentPane().add(bottomPanel);
		bottomPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblMedicoCirugano = new JLabel("Medico Cirugano");
		lblMedicoCirugano.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMedicoCirugano.setHorizontalAlignment(SwingConstants.CENTER);
		bottomPanel.add(lblMedicoCirugano);
		
		JButton btnMC = new JButton("Career Plan");
		bottomPanel.add(btnMC);
		
		JPanel backPanel = new JPanel();
		frame.getContentPane().add(backPanel);
		backPanel.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack = new JButton("Back");
		backPanel.add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new SearchByCourse().Start();
			}
		});
		
		btnMC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					plan.Start("MC");
				}
			
		});
		
		String stringArray = Arrays.toString(x);
		
		//System.out.println(stringArray);
		
		switch (stringArray) {
			case "[0, 0, 0]" : 
				lblIngenieriaEnSistemas.setVisible(false);
				btnISC.setVisible(false);
				lblLicenciaturaEnDiseo.setVisible(false);
				btnLDI.setVisible(false);
				lblMedicoCirugano.setVisible(false);
				btnMC.setVisible(false);
				break;
			case "[0, 0, 1]" :
				lblIngenieriaEnSistemas.setVisible(false);
				btnISC.setVisible(false);
				lblLicenciaturaEnDiseo.setVisible(false);
				btnLDI.setVisible(false);
				lblMedicoCirugano.setVisible(true);
				btnMC.setVisible(true);
				break;
			case "[0, 1, 1]" :
				lblIngenieriaEnSistemas.setVisible(false);
				btnISC.setVisible(false);
				lblLicenciaturaEnDiseo.setVisible(true);
				btnLDI.setVisible(true);
				lblMedicoCirugano.setVisible(true);
				btnMC.setVisible(true);
				break;
			case "[0, 1, 0]" :
				lblIngenieriaEnSistemas.setVisible(false);
				btnISC.setVisible(false);
				lblLicenciaturaEnDiseo.setVisible(true);
				btnLDI.setVisible(true);
				lblMedicoCirugano.setVisible(false);
				btnMC.setVisible(false);
				break;
			case "[1, 0, 0]" :
				lblIngenieriaEnSistemas.setVisible(true);
				btnISC.setVisible(true);
				lblLicenciaturaEnDiseo.setVisible(false);
				btnLDI.setVisible(false);
				lblMedicoCirugano.setVisible(false);
				btnMC.setVisible(false);
				break;
			case "[1, 0, 1]" :
				lblIngenieriaEnSistemas.setVisible(true);
				btnISC.setVisible(true);
				lblLicenciaturaEnDiseo.setVisible(false);
				btnLDI.setVisible(false);
				lblMedicoCirugano.setVisible(true);
				btnMC.setVisible(true);
				break;
			case "[1, 1, 1]" :
				lblIngenieriaEnSistemas.setVisible(true);
				btnISC.setVisible(true);
				lblLicenciaturaEnDiseo.setVisible(true);
				btnLDI.setVisible(true);
				lblMedicoCirugano.setVisible(true);
				btnMC.setVisible(true);
				break;
			case "[1, 1, 0]" :
				lblIngenieriaEnSistemas.setVisible(true);
				btnISC.setVisible(true);
				lblLicenciaturaEnDiseo.setVisible(true);
				btnLDI.setVisible(true);
				lblMedicoCirugano.setVisible(false);
				btnMC.setVisible(false);
				break;
		}
	}

}
