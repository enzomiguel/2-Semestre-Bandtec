import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MonitoramentoSo extends JFrame {

	Integer N;
	JLabel iblResultCpu = new JLabel("Resultado");
	JLabel iblResultMemo = new JLabel("Resultado");
	JLabel iblResultDisco = new JLabel("Resultado");
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonitoramentoSo frame = new MonitoramentoSo();
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
	public MonitoramentoSo() {
		
		
		Random gerador = new Random();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel iblCpu = new JLabel("CPU-");
		iblCpu.setForeground(Color.BLUE);
		iblCpu.setIcon(new ImageIcon(MonitoramentoSo.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		iblCpu.setFont(new Font("Georgia", Font.ITALIC, 11));
		iblCpu.setBounds(67, 33, 52, 14);
		contentPane.add(iblCpu);
		
		JLabel iblMemoria = new JLabel("MEMORIA-");
		iblMemoria.setForeground(Color.BLUE);
		iblMemoria.setIcon(new ImageIcon(MonitoramentoSo.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		iblMemoria.setFont(new Font("Georgia", Font.ITALIC, 11));
		iblMemoria.setBounds(67, 61, 82, 14);
		contentPane.add(iblMemoria);
		
		JLabel iblDisco = new JLabel("DISCO-");
		iblDisco.setForeground(Color.BLUE);
		iblDisco.setIcon(new ImageIcon(MonitoramentoSo.class.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
		iblDisco.setFont(new Font("Georgia", Font.ITALIC, 11));
		iblDisco.setBounds(67, 86, 64, 14);
		contentPane.add(iblDisco);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(N =0; N<1; N++) {
					
					iblResultCpu.setText(gerador.nextInt(101) + "%");
					iblResultMemo.setText(gerador.nextInt(101) + "%");
					iblResultDisco.setText(gerador.nextInt(101) + "%");
				}
				
			}
		});
		btnAtualizar.setForeground(Color.RED);
		btnAtualizar.setBorder(null);
		btnAtualizar.setBackground(Color.DARK_GRAY);
		btnAtualizar.setFont(new Font("Georgia", Font.ITALIC, 11));
		btnAtualizar.setBounds(232, 57, 97, 23);
		contentPane.add(btnAtualizar);
		
		
		iblResultCpu.setForeground(Color.RED);
		iblResultCpu.setFont(new Font("Georgia", Font.ITALIC, 11));
		iblResultCpu.setBounds(115, 33, 58, 14);
		contentPane.add(iblResultCpu);
		
		
		iblResultMemo.setForeground(Color.RED);
		iblResultMemo.setFont(new Font("Georgia", Font.ITALIC, 11));
		iblResultMemo.setBounds(151, 61, 58, 14);
		contentPane.add(iblResultMemo);
		
		
		iblResultDisco.setForeground(Color.RED);
		iblResultDisco.setFont(new Font("Georgia", Font.ITALIC, 11));
		iblResultDisco.setBounds(127, 86, 58, 14);
		contentPane.add(iblResultDisco);
		
		for(N =0; N<1; N++) {
			
			iblResultCpu.setText(gerador.nextInt(101) + "%");
			iblResultMemo.setText(gerador.nextInt(101) + "%");
			iblResultDisco.setText(gerador.nextInt(101) + "%");
		}
	}
}
