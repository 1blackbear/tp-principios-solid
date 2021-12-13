package gui;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.LEsperaSingleton;
import business.Pedido;
import business.exception.PedidoException;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Retirar extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtDigiteASenha;

	public Retirar() {
		setTitle("Retirar Pedido");
		setUndecorated(true);
		setModal(true);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(68, 0, 0));
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblSenha = new JLabel("SENHA DO PEDIDO");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblSenha.setBounds(213, 108, 167, 44);
		contentPane.add(lblSenha);
		
		txtDigiteASenha = new JTextField();
		lblSenha.setLabelFor(txtDigiteASenha);
		txtDigiteASenha.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtDigiteASenha.setBackground(Color.WHITE);
		txtDigiteASenha.setBounds(171, 163, 251, 44);
		contentPane.add(txtDigiteASenha);
		txtDigiteASenha.setColumns(10);
		
		JButton btnRetirar = new JButton("RETIRAR");
		btnRetirar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LEsperaSingleton lista_de_espera = LEsperaSingleton.getInstancia();
				NotificacaoPedido janela = new NotificacaoPedido("O pedido não foi encontrado :(");
				if (txtDigiteASenha.getText() != "")
					for(Pedido p : lista_de_espera.getPedidos()) {
						if (Integer.valueOf(txtDigiteASenha.getText()) == p.getNum_pedido()) {
							try {
								p.setStatus("Pedido Retirado");
							} catch (PedidoException e1) {
								e1.printStackTrace();
							}
							janela = new NotificacaoPedido("Pedido retirado com sucesso!");
							break;
						}
					}		
				dispose();
				janela.setVisible(true);
			}
		});
		btnRetirar.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnRetirar.setBackground(Color.ORANGE);
		btnRetirar.setBounds(213, 218, 167, 44);
		contentPane.add(btnRetirar);

	}
}
