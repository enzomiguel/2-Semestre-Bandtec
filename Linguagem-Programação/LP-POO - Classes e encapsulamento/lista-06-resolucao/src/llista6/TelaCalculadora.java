package llista6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txfNumero1;
	private JTextField txfNumero2;
	
	Calculadora calculadora = new Calculadora();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txfNumero1 = new JTextField();
		txfNumero1.setBounds(10, 68, 86, 20);
		contentPane.add(txfNumero1);
		txfNumero1.setColumns(10);
		
		txfNumero2 = new JTextField();
		txfNumero2.setBounds(10, 110, 86, 20);
		contentPane.add(txfNumero2);
		txfNumero2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setBounds(218, 22, 114, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(183, 88, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setBounds(250, 88, 46, 14);
		contentPane.add(lblResultado);

		
		JButton btnNewButton = new JButton("SOMAR");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				calculadora.soma(Integer.valueOf(txfNumero1.getText()), Integer.valueOf(txfNumero2.getText()));
				
				lblResultado.setText(calculadora.getTotal().toString());
			}
			
		});
		btnNewButton.setBounds(10, 159, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRAIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				calculadora.subtracao(Integer.valueOf(txfNumero1.getText()), Integer.valueOf(txfNumero2.getText()));
				
				lblResultado.setText(calculadora.getTotal().toString());
			}
			
		});
		btnNewButton_1.setBounds(130, 159, 99, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLICAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				calculadora.multiplicacao(Integer.valueOf(txfNumero1.getText()), Integer.valueOf(txfNumero2.getText()));
				lblResultado.setText(calculadora.getTotal().toString());
			}
			
		});
		btnNewButton_2.setBounds(250, 159, 114, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDIR");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				calculadora.divisao(Integer.valueOf(txfNumero1.getText()), Integer.valueOf(txfNumero2.getText()));
				lblResultado.setText(calculadora.getTotal().toString());
			}
			
		});
		btnNewButton_3.setBounds(384, 159, 89, 23);
		contentPane.add(btnNewButton_3);
		
			}
}
