package lista5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLutadores extends JFrame {

	private JPanel contentPane;
	
	
	Lutadores lutador1 = new Lutadores();
	Lutadores lutador2 = new Lutadores();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLutadores frame = new TelaLutadores();
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
	public TelaLutadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar pbrLutador1 = new JProgressBar();
		pbrLutador1.setBounds(34, 63, 184, 26);
		pbrLutador1.setValue(100); //aqui estou dizendo que minha barra vai começar com o valor 100 setei o valor
		contentPane.add(pbrLutador1);
		
		JProgressBar pbrLutador2 = new JProgressBar();
		pbrLutador2.setBounds(34, 134, 184, 26);
		pbrLutador2.setValue(100); // aqui estou dizendo que minha barra vai começar com o valor 100 setei o valor
		contentPane.add(pbrLutador2);
		
		JLabel lblNewLabel = new JLabel("VIDA DOS LUTADORES");
		lblNewLabel.setBounds(48, 38, 149, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lutador 1");
		lblNewLabel_1.setBounds(253, 63, 64, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lutador 2");
		lblNewLabel_2.setBounds(253, 131, 64, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblResultado = new JLabel("-");
		lblResultado.setBounds(108, 222, 110, 14);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("APANHAR");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(lutador2.vida > 0) {
					lutador1.apanhar();
				}else {
					lblResultado.setText("Lutador 2 perdeu");
				}
				pbrLutador1.setValue(lutador1.getVida());
			}
		});
		btnNewButton.setBounds(10, 100, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONCENTRAR FOR\u00C7A");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				lutador1.concentrarForca();
				pbrLutador1.setValue(lutador1.getVida());
			}
		});
		btnNewButton_1.setBounds(140, 100, 166, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("APANHAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
				if(lutador1.vida > 0 ) {
					
					lutador2.apanhar();
					
				}else  {
					lblResultado.setText("Lutador 1 perdeu");
				}
				
				pbrLutador2.setValue(lutador2.getVida());
			}
		});
		btnNewButton_2.setBounds(10, 171, 106, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CONCENTRAR FOR\u00C7A");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(lutador2.vida != 0) {
					
					lutador2.concentrarForca();
					
				}
			
				pbrLutador2.setValue(lutador2.getVida());
			}
		});
		btnNewButton_3.setBounds(140, 171, 166, 23);
		contentPane.add(btnNewButton_3);
		
		
	}
}
