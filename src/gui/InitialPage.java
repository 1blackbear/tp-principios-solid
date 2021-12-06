package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class InitialPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnFazerPedido;
	private JButton btnRetirar;

	/**
	 * Create the frame.
	 */
	public InitialPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InitialPage.class.getResource("/gui/img/icon.png")));
		
		setResizable(false);
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setTitle("Ramen Shop");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 00, 00));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JLabel lblTitle = new JLabel("Ramen Shop");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTitle, 97, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTitle, 221, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblTitle, 167, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTitle, -182, SpringLayout.EAST, contentPane);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		lblTitle.setForeground(Color.WHITE);
		contentPane.add(lblTitle);

		btnFazerPedido = new JButton("FAZER PEDIDO");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFazerPedido, 36, SpringLayout.SOUTH, lblTitle);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFazerPedido, 221, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFazerPedido, 0, SpringLayout.EAST, lblTitle);
		btnFazerPedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu janela = new Menu();
				janela.setVisible(true);

			}
		});
		btnFazerPedido.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnFazerPedido.setBackground(Color.ORANGE);
		contentPane.add(btnFazerPedido);

		btnRetirar = new JButton("RETIRAR PEDIDO");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnFazerPedido, -25, SpringLayout.NORTH, btnRetirar);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRetirar, 257, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRetirar, 286, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRetirar, 221, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRetirar, 0, SpringLayout.EAST, lblTitle);
		btnRetirar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Retirar janela = new Retirar();
				janela.setVisible(true);
			}
		});
		btnRetirar.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnRetirar.setBackground(Color.ORANGE);
		contentPane.add(btnRetirar);
	}
}
