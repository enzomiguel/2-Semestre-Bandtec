package lista5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class TelaElevadores extends JFrame {

	private JPanel contentPane;
	
	Elevadores passageiros = new Elevadores();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaElevadores frame = new TelaElevadores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaElevadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total de passageiros no Elevador:");
		lblNewLabel.setBounds(10, 148, 196, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblTotalPassageiros = new JLabel("0");
		lblTotalPassageiros.setBounds(216, 150, 45, 18);
		contentPane.add(lblTotalPassageiros);
		
		JLabel lblNewLabel_1 = new JLabel("Peso total no Elevador:");
		lblNewLabel_1.setBounds(10, 182, 171, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPesoTotalElevador = new JLabel("0");
		lblPesoTotalElevador.setBounds(163, 182, 37, 14);
		contentPane.add(lblPesoTotalElevador);
		
		JLabel lblNewLabel_2 = new JLabel("kg");
		lblNewLabel_2.setBounds(191, 182, 14, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnEntrarHomem = new JButton("ENTRAR HOMEM");
		btnEntrarHomem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				passageiros.entrarHomem();
				
				lblPesoTotalElevador.setText(passageiros.peso.toString());
				lblTotalPassageiros.setText(passageiros.passageiro.toString());
			}
			
		});
		btnEntrarHomem.setBounds(10, 81, 133, 23);
		contentPane.add(btnEntrarHomem);
		
		JButton btnEntrarMulher = new JButton("ENTRAR MULHER");
		btnEntrarMulher.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				passageiros.entrarMulher();
				
				lblPesoTotalElevador.setText(passageiros.peso.toString());
				lblTotalPassageiros.setText(passageiros.passageiro.toString());
				
			}
			
		});
		btnEntrarMulher.setBounds(179, 81, 133, 23);
		contentPane.add(btnEntrarMulher);
		
		JButton btnEntrarCrianca = new JButton("ENTRAR  CRIAN\u00C7A");
		btnEntrarCrianca.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				passageiros.entrarCrianca();
				
				lblPesoTotalElevador.setText(passageiros.peso.toString());
				lblTotalPassageiros.setText(passageiros.passageiro.toString());
				
			}
			
			
		});
		btnEntrarCrianca.setBounds(345, 81, 149, 23);
		contentPane.add(btnEntrarCrianca);
	}

}
