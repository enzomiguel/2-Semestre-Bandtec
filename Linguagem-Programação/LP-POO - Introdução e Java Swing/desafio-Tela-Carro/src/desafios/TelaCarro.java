package desafios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class TelaCarro extends JFrame {

	private JPanel contentPane;
	Carro carro = new Carro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarro frame = new TelaCarro();
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
	public TelaCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(10, 30, 81, 14);
		contentPane.add(lblAviso);
		
		JLabel lblNewLabel = new JLabel("Combust\u00EDvel");
		lblNewLabel.setBounds(10, 76, 81, 14);
		contentPane.add(lblNewLabel);
		
		JProgressBar pgbCombustivel = new JProgressBar();
		pgbCombustivel.setBounds(10, 106, 146, 23);
		pgbCombustivel.setValue(100);
		contentPane.add(pgbCombustivel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00E2mbio");
		lblNewLabel_1.setBounds(272, 76, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(258, 106, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Velocimetro");
		lblNewLabel_3.setBounds(486, 76, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblResultadoKm = new JLabel("0.00");
		lblResultadoKm.setBounds(486, 106, 46, 14);
		contentPane.add(lblResultadoKm);
		
		JLabel lblNewLabel_5 = new JLabel("KM/H");
		lblNewLabel_5.setBounds(542, 106, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		
		
		boolean avuso = false;
		if(avuso == true) {
			lblAviso.setText(getName());
		}
		else {
			lblAviso.setText(getName());
		}
		
		JButton btnAumentarMarcha = new JButton("+");
		btnAumentarMarcha.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				carro.passarMarchas();

				for(Integer i = 1; i<=5; i++) {
					
					if(carro.getMachas() == 1) {
						lblNewLabel_2.setText("1º Primeira");
					}else if(carro.getMachas() ==2) {
						lblNewLabel_2.setText("2º Segunda");
					}else if(carro.getMachas() == 3) {
						lblNewLabel_2.setText("3º Terceira");
					}else if(carro.getMachas() == 4) {
						lblNewLabel_2.setText("4º Quarta");
					}else if(carro.getMachas() == 5) {
						lblNewLabel_2.setText("5º Quinta");
					}else if(carro.getMachas() == 6) {
						lblNewLabel_2.setText("6º ré");
					}
				}
			}
		});
		btnAumentarMarcha.setBounds(293, 161, 46, 37);
		contentPane.add(btnAumentarMarcha);
		
		JButton btnDiminuirMarcha = new JButton("-");
		btnDiminuirMarcha.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				carro.diminuirMarchas();
				
					for(Integer i = 1; i<=5; i++) {
					
					if(carro.getMachas() == 1) {
						lblNewLabel_2.setText("1º Primeira");
					}else if(carro.getMachas() ==2) {
						lblNewLabel_2.setText("2º Segunda");
					}else if(carro.getMachas() == 3) {
						lblNewLabel_2.setText("3º Terceira");
					}else if(carro.getMachas() == 4) {
						lblNewLabel_2.setText("4º Quarta");
					}else if(carro.getMachas() == 5) {
						lblNewLabel_2.setText("5º Quinta");
					}else if(carro.getMachas() == 6) {
						lblNewLabel_2.setText("6º ré");
					}
				}
				
			}
		});
		btnDiminuirMarcha.setBounds(293, 210, 46, 37);
		contentPane.add(btnDiminuirMarcha);
		
		JLabel lblNewLabel_6 = new JLabel("Ligar/Desligar Carro");
		lblNewLabel_6.setBounds(486, 172, 137, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnAcelerador = new JButton("ACELERADOR");
		btnAcelerador.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				carro.acelerar();
				
				if(carro.getCombustivel() ==0) {
					btnAcelerador.setEnabled(false);
				}
				
				
				lblResultadoKm.setText(carro.getVelocidade().toString());
				pgbCombustivel.setValue(carro.getCombustivel());
			}
		});
		btnAcelerador.setBounds(10, 161, 133, 23);
		contentPane.add(btnAcelerador);
		
		JButton btnFreio = new JButton("FREIO");
		btnFreio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carro.freiar();
				lblResultadoKm.setText(carro.getVelocidade().toString());
				
				if(carro.getCombustivel() == 0) {
					lblResultadoKm.setText(carro.getCombustivel().toString());
				}
			}
		});
		btnFreio.setBounds(166, 161, 89, 23);
		contentPane.add(btnFreio);
		
		JButton btnAbastecer = new JButton("ABASTECER");
		btnAbastecer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				carro.abastecer();
				pgbCombustivel.setValue(carro.getCombustivel());
				btnAcelerador.setEnabled(true);
				
			}
		});
		btnAbastecer.setBounds(72, 210, 110, 23);
		contentPane.add(btnAbastecer);
		
		
		
		JButton btnNewButton_5 = new JButton("Ligar");
		btnNewButton_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				carro.setMachas(0);
				lblNewLabel_2.setText(carro.getMachas().toString());
				lblNewLabel_2.setVisible(true);
				lblAviso.setText("Ligado");
				btnAbastecer.setEnabled(true);
				btnAcelerador.setEnabled(true);
				btnFreio.setEnabled(true);
				btnAumentarMarcha.setEnabled(true);
				btnDiminuirMarcha.setEnabled(true);
				
			}
		});
		btnNewButton_5.setBounds(456, 217, 81, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Desligar");
		btnNewButton_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				carro.setVelocidade(0.0);
				carro.setMachas(0);
				lblNewLabel_2.setVisible(false);
				lblAviso.setText("Desligado");
				lblResultadoKm.setText(carro.getVelocidade().toString()); // quero saber como voltar pra 0
				btnAbastecer.setEnabled(false);
				btnAcelerador.setEnabled(false);
				btnFreio.setEnabled(false);
				btnAumentarMarcha.setEnabled(false);
				btnDiminuirMarcha.setEnabled(false);
			}
		});
		btnNewButton_6.setBounds(565, 217, 89, 23);
		contentPane.add(btnNewButton_6);
	}
}
