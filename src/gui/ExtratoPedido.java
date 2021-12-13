package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import business.Pedido;

public class ExtratoPedido extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;


	public ExtratoPedido(Pedido pedido) {
		setTitle("Extrato do Pedido");
		setUndecorated(true);
		setModal(true);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(68, 0, 0));
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("EXTRATO DO PEDIDO");
		lbl.setForeground(Color.WHITE);
		lbl.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lbl.setBounds(190, 30, 300, 100);
		contentPane.add(lbl);
		
		JTextArea lblExtrato = new JTextArea(pedido.exibirExtrato());
		lblExtrato.setForeground(Color.BLACK);
		lblExtrato.setWrapStyleWord(true);
		lblExtrato.setLineWrap(true);
		lblExtrato.setEditable(false);
		lblExtrato.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblExtrato.setBounds(150, 140, 300, 200);
		contentPane.add(lblExtrato);
		
		JButton btnRetirar = new JButton("TUDO CERTO!");
		btnRetirar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnRetirar.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnRetirar.setBackground(Color.ORANGE);
		btnRetirar.setBounds(213, 370, 167, 44);
		contentPane.add(btnRetirar);

	}

}
