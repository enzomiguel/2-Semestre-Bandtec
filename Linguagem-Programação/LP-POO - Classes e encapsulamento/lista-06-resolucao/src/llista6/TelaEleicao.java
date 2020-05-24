package llista6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEleicao extends JFrame {

	private JPanel contentPane;
	Eleicao candidatos = new Eleicao();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEleicao frame = new TelaEleicao();
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
	public TelaEleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elei\u00E7\u00E3o para representante da sala");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(177, 27, 251, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Candidato 01");
		lblNewLabel_1.setBounds(41, 90, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jos\u00E9");
		lblNewLabel_2.setBounds(61, 115, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_7 = new JLabel("Votos totais:");
		lblNewLabel_7.setBounds(34, 268, 73, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Resultado:");
		lblNewLabel_8.setBounds(41, 341, 66, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setBounds(110, 341, 122, 14);
		contentPane.add(lblResultado);
		
		JLabel lblVotosJose = new JLabel("0");
		lblVotosJose.setBounds(176, 218, 46, 14);
		contentPane.add(lblVotosJose);
		
		JLabel lblVotosGabriel = new JLabel("0");
		lblVotosGabriel.setBounds(186, 243, 46, 14);
		contentPane.add(lblVotosGabriel);
		
		JLabel lblVotosTotais = new JLabel("0");
		lblVotosTotais.setBounds(110, 268, 46, 14);
		contentPane.add(lblVotosTotais);
		
		JButton btnVotarCandidato1 = new JButton("VOTAR");
		btnVotarCandidato1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				candidatos.votarCandidato1();
				candidatos.somaTotal();
				lblVotosJose.setText(candidatos.getCandidato1().toString());
				lblVotosTotais.setText(candidatos.getTotalVotos().toString());
			}
			
		});
		btnVotarCandidato1.setBounds(34, 140, 89, 23);
		contentPane.add(btnVotarCandidato1);
		
		JLabel lblNewLabel_3 = new JLabel("Candidato 02");
		lblNewLabel_3.setBounds(404, 90, 82, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gabriel");
		lblNewLabel_4.setBounds(424, 115, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnVotarCandidato2 = new JButton("VOTAR");
		btnVotarCandidato2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				candidatos.votarCandidato2();
				candidatos.somaTotal();
				lblVotosGabriel.setText(candidatos.getCandidato2().toString());
				lblVotosTotais.setText(candidatos.getTotalVotos().toString());
				
			}
			
		});
		btnVotarCandidato2.setBounds(404, 140, 89, 23);
		contentPane.add(btnVotarCandidato2);
		
		JLabel lblNewLabel_5 = new JLabel("Total de votos do Jos\u00E9: ");
		lblNewLabel_5.setBounds(34, 218, 137, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total de votos do Gabriel:");
		lblNewLabel_6.setBounds(34, 243, 152, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Encerrar Elei\u00E7\u00F5es");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				candidatos.encerrarVotacao();
				lblResultado.setText(candidatos.getVencedor());
				btnVotarCandidato1.setEnabled(false);//estou desabilitando o botao 
				btnVotarCandidato2.setEnabled(false);//desabelitando o botao
			}
			
		});
		btnNewButton.setBounds(207, 288, 157, 23);
		contentPane.add(btnNewButton);
		
		
	}

}
