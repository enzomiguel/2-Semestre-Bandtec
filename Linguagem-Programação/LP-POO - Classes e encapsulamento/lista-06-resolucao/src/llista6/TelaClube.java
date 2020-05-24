package llista6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TelaClube extends JFrame {

	private JPanel contentPane;
	
	Clube jogo = new Clube();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaClube frame = new TelaClube();
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
	public TelaClube() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vi\u00F3rias:");
		lblNewLabel.setBounds(60, 233, 57, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pontua\u00E7\u00E3o:");
		lblNewLabel_1.setBounds(60, 268, 70, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblVitorias = new JLabel("0");
		lblVitorias.setBounds(107, 238, 31, 14);
		contentPane.add(lblVitorias);
		
		JLabel lblPontuacao = new JLabel("0");
		lblPontuacao.setBounds(127, 273, 31, 14);
		contentPane.add(lblPontuacao);
		
		JLabel lblNewLabel_2 = new JLabel("-Derrotas:");
		lblNewLabel_2.setBounds(137, 236, 57, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDerrotas = new JLabel("0");
		lblDerrotas.setBounds(196, 238, 23, 14);
		contentPane.add(lblDerrotas);
		
		JLabel lblNewLabel_3 = new JLabel("-Empates:");
		lblNewLabel_3.setBounds(147, 268, 57, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblEmpate = new JLabel("0");
		lblEmpate.setBounds(206, 273, 46, 14);
		contentPane.add(lblEmpate);
		
		JButton btnRegistrarVitoria = new JButton("REGISTRAR VIT\u00D3RIA");
		btnRegistrarVitoria.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				jogo.registrarVitoria();
				lblVitorias.setText(jogo.quantidadeVitoria.toString());
				lblPontuacao.setText(jogo.pontos.toString());
			
			}
			
		});
		btnRegistrarVitoria.setBounds(60, 75, 159, 36);
		contentPane.add(btnRegistrarVitoria);
		
		JButton btnRegistrarEmpate = new JButton("REGISTRAR EMPATE");
		btnRegistrarEmpate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				jogo.registrarEmpate();
				lblPontuacao.setText(jogo.pontos.toString());
				lblEmpate.setText(jogo.empate.toString());
			}
			
		});
		btnRegistrarEmpate.setBounds(60, 122, 159, 36);
		contentPane.add(btnRegistrarEmpate);
		
		JButton btnRegistrarDerrota = new JButton("REGISTRAR DERROTA");
		btnRegistrarDerrota.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				jogo.registrarDerrota();
				lblDerrotas.setText(jogo.derrota.toString());
				
			}
			
		});
		btnRegistrarDerrota.setBounds(60, 169, 159, 36);
		contentPane.add(btnRegistrarDerrota);
		
		
	}
}
