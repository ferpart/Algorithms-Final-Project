package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SearchByCourse {

	private JFrame frame;

	public SearchByCourse() {
		initialize();
	}
	
	public void Start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchByCourse window = new SearchByCourse();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel topTitle = new JPanel();
		frame.getContentPane().add(topTitle);
		topTitle.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblTroncoComn = new JLabel("Tronco Com\u00FAn: ");
		lblTroncoComn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTroncoComn.setFont(new Font("Tahoma", Font.PLAIN, 24));
		topTitle.add(lblTroncoComn);
		
		JPanel topSelection = new JPanel();
		frame.getContentPane().add(topSelection);
		topSelection.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
		
		
		String[] com_1 = {"-Selecciona-","Math"};
		String[] com_2 = {"-Selecciona-","Physics 1"};
		String[] com_3 = {"-Selecciona-","EVAP"};
		String[] com_4 = {"-Selecciona-","English"};
		String[] com_5 = {"-Selecciona-","Ethics"};
		
		
		
		
		JComboBox troncoBox1 = new JComboBox(com_1);
		topSelection.add(troncoBox1);
		
		JComboBox troncoBox2 = new JComboBox(com_2);
		topSelection.add(troncoBox2);
		
		JComboBox troncoBox3 = new JComboBox(com_3);
		topSelection.add(troncoBox3);
		
		JComboBox troncoBox4 = new JComboBox(com_4);
		topSelection.add(troncoBox4);
		
		JComboBox troncoBox5 = new JComboBox(com_5);
		topSelection.add(troncoBox5);
		
		JPanel bottomTitle = new JPanel();
		FlowLayout flowLayout = (FlowLayout) bottomTitle.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(bottomTitle);
		
		JLabel lblEspecializadas = new JLabel("Especializadas");
		lblEspecializadas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEspecializadas.setHorizontalAlignment(SwingConstants.CENTER);
		bottomTitle.add(lblEspecializadas);
		
		JPanel bottomSelection = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) bottomSelection.getLayout();
		flowLayout_1.setHgap(25);
		frame.getContentPane().add(bottomSelection);
		
		String[] esp_1 = {"-Selecciona-", "POO", "Drawing", "Metabolism"};
		String[] esp_2 = {"-Selecciona-", "Mobile Apps", "Descriptive Geometry", "Biostatistics"};
		String[] esp_3 = {"-Selecciona-", "Algorithms", "Computarized Drawing", "Morfofisiology"};
		String[] esp_4 = {"-Selecciona-", "Data Structures", "Creativity and Innovartion", "Pediatrics"};
		String[] esp_5 = {"-Selecciona-", "Operative Systems", "Prototypes Workshop", "Gynecology"};
		
		JComboBox EspecializadaBox1 = new JComboBox(esp_1);
		bottomSelection.add(EspecializadaBox1);
		
		JComboBox EspecializadaBox2 = new JComboBox(esp_2);
		bottomSelection.add(EspecializadaBox2);
		
		JComboBox EspecializadaBox3 = new JComboBox(esp_3);
		bottomSelection.add(EspecializadaBox3);
		
		JComboBox EspecializadaBox4 = new JComboBox(esp_4);
		bottomSelection.add(EspecializadaBox4);
		
		JComboBox EspecializadaBox5 = new JComboBox(esp_5);
		bottomSelection.add(EspecializadaBox5);
		
		JPanel submitOrCancel = new JPanel();
		frame.getContentPane().add(submitOrCancel);
		submitOrCancel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCancel = new JButton("Cancel");
		submitOrCancel.add(btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		submitOrCancel.add(btnSubmit);
	}

}
