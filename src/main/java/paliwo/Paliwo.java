package paliwo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Paliwo {

	private JFrame frame;
	private JTextField textField_CenaPaliwa;
	private JTextField textField_Spalanie;
	private JTextField textField_Trasa;
	private JTextField textField_Wynik;
	private JTextField textField_CenaNaOsobe;
	private JSpinner spinner_liczbaOsob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paliwo window = new Paliwo();
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
	public Paliwo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("PALIWKO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		textField_CenaPaliwa = new JTextField();
		textField_CenaPaliwa.setColumns(10);
		
		textField_Spalanie = new JTextField();
		textField_Spalanie.setColumns(10);
		
		textField_Trasa = new JTextField();
		textField_Trasa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CENA PALIWA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("SPALANIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("TRASA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblZll = new JLabel("zl/l");
		lblZll.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblLKm = new JLabel("l/100 km");
		lblLKm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblKm = new JLabel("km");
		lblKm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		//TU ZACZALEM DZIALAC
		//....................
		
		JButton btnOblicz = new JButton("OBLICZ");
		btnOblicz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double cenaPaliwa = Double.parseDouble(textField_CenaPaliwa.getText());
			double spalanie = Double.parseDouble(textField_Spalanie.getText());
			double trasa = Double.parseDouble(textField_Trasa.getText());
			
			double wynik = spalanie * (trasa/100) * cenaPaliwa;
			
			int liczbaOsob = (int) spinner_liczbaOsob.getValue();
			double wynikNaOsobe = wynik / liczbaOsob;
			
			textField_Wynik.setText("" + wynik);
			
			textField_CenaNaOsobe.setText("" + wynikNaOsobe);
				
			}
		});
		
		//DOTAD
		//.........
		
		
		textField_Wynik = new JTextField();
		textField_Wynik.setColumns(10);
		
		spinner_liczbaOsob = new JSpinner();
		spinner_liczbaOsob.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		
		textField_CenaNaOsobe = new JTextField();
		textField_CenaNaOsobe.setColumns(10);
		
		JLabel lblPln = new JLabel("PLN");
		lblPln.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		JLabel lblLiczbaOsob = new JLabel("LICZBA OSOB");
		lblLiczbaOsob.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCenaNaOsobe = new JLabel("CENA NA OSOBE");
		lblCenaNaOsobe.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_Spalanie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_CenaPaliwa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_Trasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKm, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblZll, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLKm, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblLiczbaOsob, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(spinner_liczbaOsob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblCenaNaOsobe, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textField_CenaNaOsobe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGap(48)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOblicz, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addGap(107))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(textField_Wynik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblPln)
							.addGap(113)))
					.addGap(157))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_CenaPaliwa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblZll)
						.addComponent(lblLiczbaOsob, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner_liczbaOsob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Spalanie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblLKm)
						.addComponent(lblCenaNaOsobe, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_CenaNaOsobe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Trasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblKm))
					.addGap(18)
					.addComponent(btnOblicz, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Wynik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPln))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
