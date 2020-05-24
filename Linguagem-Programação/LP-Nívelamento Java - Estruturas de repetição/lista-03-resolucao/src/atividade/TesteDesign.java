package atividade;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TesteDesign extends JFrame {

	private JPanel contentPane;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteDesign frame = new TesteDesign();
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
	
	// SET E PRA MUDAR ALGO
	//GET 
	public TesteDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("texto padr\u00E3o");
		lblTitulo.setBounds(24, 23, 123, 34);
		contentPane.add(lblTitulo);
		
		JButton btnBotao = new JButton("ATUALIZAR");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textoAtualizado = "Texto via codigos";
				
				lblTitulo.setText(textoAtualizado); //para mudar o texto
				
				lblTitulo.setForeground(Color.red);// colocando cor no texto
				//lblTitulo.setForeground(Color.decode(#5f));// colocando cor no texto

				
                //String textoAtualizado = lblTitulo.getText();concatenando
				
				//lblTitulo.setText(textoAtualizado + "123"); CONCATENANDO
			}
		});
		btnBotao.setBounds(10, 68, 109, 34);
		contentPane.add(btnBotao);
		
		textValor = new JTextField();
		textValor.setBounds(10, 135, 137, 34);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JButton btnSomar = new JButton("somar 10");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer numeroDigitado = Integer.valueOf(textValor.getText()); //convertendo para numero inteiro 
				
				numeroDigitado += 10;
				
				lblTitulo.setText(numeroDigitado.toString()); // devolvendo valor como numero
			}
		});
		btnSomar.setBounds(24, 203, 89, 23);
		contentPane.add(btnSomar);
	}
}
