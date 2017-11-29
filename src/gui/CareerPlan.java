package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CareerPlan {

	
	
	private JFrame frame;
	
	/**
	 * Create the application.
	 */
	public CareerPlan() {
		initialize("");
	}
	
	public CareerPlan(String x) {
		initialize(x);
	}
	
	public void Start(String x) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CareerPlan window = new CareerPlan(x);
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
	private void initialize(String x) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel TopPanel = new JPanel();
		frame.getContentPane().add(TopPanel, BorderLayout.NORTH);
		
		JLabel lblPlanDeCarrera = new JLabel("Plan de Carrera: ");
		lblPlanDeCarrera.setFont(new Font("Tahoma", Font.PLAIN, 24));
		TopPanel.add(lblPlanDeCarrera);
		
		JPanel bottomPanel = new JPanel();
		frame.getContentPane().add(bottomPanel, BorderLayout.CENTER);
		bottomPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel leftPanel = new JPanel();
		bottomPanel.add(leftPanel);
			
		JLabel troncoComun = new JLabel(TroncoComun());
		troncoComun.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(troncoComun);
		
		JPanel rightPanel = new JPanel();
		bottomPanel.add(rightPanel);
		
		JLabel espesializadas = new JLabel(Options(x));
		espesializadas.setHorizontalAlignment(SwingConstants.CENTER);
		rightPanel.add(espesializadas);
	}
	
	private String Options(String key) {
		
		String fin = "";
		
		switch (key) {
		case "ISC":
			fin = ISC();
			break;	
		case "LDI":
			fin = LDI();
			break;		
		case "MC":
			fin = MC();
			break;
		}
		return fin;
	}
	
	private String TroncoComun() {
	       String pt1 = 
	    	   "<html><body width='";
           String pt2 =
               "'><h2>Tronco Común</h2>" +
               "<ul>" + 
               "<li>Math</li>" + 
               "<li>Physics 1</li>" + 
               "<li>EVAP</li>" +
               "<li>English</li>" +
               "<li>Ethics</li>" +
               "</ul>";
           int width = 175;
           
           String s = pt1 + width + pt2;
           
           return s;
	}
	
	private String ISC() {
	       String pt1 = 
		    	   "<html><body width='";
	           String pt2 =
	               "'><h2>Materias Especiales</h2>" +
	               "<ul>" + 
	               "<li>POO</li>" + 
	               "<li>Mobile Apps</li>" + 
	               "<li>Algorithms</li>" +
	               "<li>Data Structures</li>" +
	               "<li>Operative Systems</li>" +
	               "</ul>";
	           int width = 175;
	           
	           String s = pt1 + width + pt2;
	           
	           return s;
	}
	
	private String LDI() {
	       String pt1 = 
		    	   "<html><body width='";
	           String pt2 =
	               "'><h2>Materias Especiales</h2>" +
	               "<ul>" + 
	               "<li>Drawing</li>" + 
	               "<li>Descriptive Geometry</li>" + 
	               "<li>Computarized Drawing</li>" +
	               "<li>Creativity and Innovation</li>" +
	               "<li>Prototypes Workshop</li>" +
	               "</ul>";
	           int width = 175;
	           
	           String s = pt1 + width + pt2;
	           
	           return s;
	}
	
	private String MC() {
	       String pt1 = 
		    	   "<html><body width='";
	           String pt2 =
	               "'><h2>Materias Especiales</h2>" +
	               "<ul>" + 
	               "<li>Metabolism</li>" + 
	               "<li>Biostatistics</li>" + 
	               "<li>Morfofisiology</li>" +
	               "<li>Pediatrics</li>" +
	               "<li>Gynecology</li>" +
	               "</ul>";
	           int width = 175;
	           
	           String s = pt1 + width + pt2;
	           
	           return s;
	}
	
}
