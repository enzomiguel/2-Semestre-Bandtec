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

public class TelaDadinho extends JFrame {

	private JPanel contentPane;
//	private JLabel lblPrimeira;
	
	// criei um objeto instanciando a classe a Dadinho
	Dadinho dadinho01 = new Dadinho();
	Dadinho dadinho02 = new Dadinho();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDadinho frame = new TelaDadinho();
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
	public TelaDadinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dadinho 1:");
		lblNewLabel.setBounds(88, 87, 99, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dadinho 2:");
		lblNewLabel_1.setBounds(88, 112, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrimeira = new JLabel("-");
		lblPrimeira.setBounds(197, 87, 46, 14);
		contentPane.add(lblPrimeira);
		
		JLabel lbl2 = new JLabel("-");
		lbl2.setBounds(197, 112, 32, 14);
		contentPane.add(lbl2);
		
		JLabel lblVitorias02 = new JLabel("0");
		lblVitorias02.setBounds(321, 112, 46, 14);
		contentPane.add(lblVitorias02);
		
		JLabel lblVitorias01 = new JLabel("0");
		lblVitorias01.setBounds(321, 87, 46, 14);
		contentPane.add(lblVitorias01);
		
		JLabel lblNewLabel_2 = new JLabel("Vitorias");
		lblNewLabel_2.setBounds(239, 87, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vitorias");
		lblNewLabel_3.setBounds(239, 112, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblFraseEmpate = new JLabel("-");
		lblFraseEmpate.setBounds(154, 171, 150, 14);
		contentPane.add(lblFraseEmpate);
		
		
		JButton btnSorteio = new JButton("SORTEAR");
		btnSorteio.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dadinho01.sortearDadinho();
				lblPrimeira.setText(dadinho01.numero.toString());
				
				dadinho02.sortearDadinho();
				lbl2.setText(dadinho02.numero.toString());
				
				if(dadinho01.numero > dadinho02.numero) {
					
					dadinho01.vitorias++;
					
					lblVitorias01.setText(dadinho01.vitorias.toString());
					lblFraseEmpate.setText("Dadinho 1 ganhou!");
				}
				else if(dadinho01.numero < dadinho02.numero) {
					
					dadinho02.vitorias++;
					
					lblVitorias02.setText(dadinho02.vitorias.toString());
					lblFraseEmpate.setText("Dadinho 2 ganhou!");
				}
				else {
					lblFraseEmpate.setText("Empate");
				}
				
				
			}
		});
		btnSorteio.setBounds(154, 37, 89, 23);
		contentPane.add(btnSorteio);
		
		
		
		
		
		
	}
}
