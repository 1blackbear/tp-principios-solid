package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class NotificacaoPedido extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public NotificacaoPedido(String msg) {
		setTitle("Pedido Pronto");
		setUndecorated(true);
		setModal(true);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 220);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(68, 0, 0));
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel(msg);
		lbl.setForeground(Color.WHITE);
		lbl.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lbl.setBounds(145, 30, 400, 100);
		contentPane.add(lbl);
		
		
		JButton btnRetirar = new JButton("OK");
		btnRetirar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		btnRetirar.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnRetirar.setBackground(Color.ORANGE);
		btnRetirar.setBounds(213, 120, 167, 44);
		contentPane.add(btnRetirar);

	}

}
