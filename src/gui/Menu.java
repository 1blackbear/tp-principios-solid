package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import business.LEsperaSingleton;
import business.exception.PedidoException;

public class Menu extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup tamanhos = new ButtonGroup();
	private final ButtonGroup carne = new ButtonGroup();
	private final ButtonGroup bebida = new ButtonGroup();
	private JRadioButton radioPequeno;
	private JRadioButton radioMedio;
	private JRadioButton radioGrande;
	private JCheckBox checkCarneExtra;
	private JCheckBox checkCremeAlho;
	private JCheckBox checkChilli;
	private JCheckBox checkCroutons;
	private JCheckBox checkShitake;
	private JCheckBox checkTofu;
	private JRadioButton radioVegano;
	private JRadioButton radioPorco;
	private JRadioButton radioBoi;
	private JRadioButton radioRefri;
	private JRadioButton radioOCha;
	private JRadioButton radioKoCha;
	private JButton btnFazerPedido;


	/**
	 * Create the dialog.
	 */
	public Menu() {
		setTitle("Fazer Pedido");
		setAlwaysOnTop(true);
		setUndecorated(true);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 441, 629);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		radioPequeno = new JRadioButton("PEQUENO");
		radioPequeno.setForeground(Color.WHITE);
		tamanhos.add(radioPequeno);
		radioPequeno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		radioPequeno.setBackground(new Color(56, 00, 00));
		radioPequeno.setBounds(25, 170, 115, 23);
		contentPane.add(radioPequeno);

		radioMedio = new JRadioButton("MEDIO");
		radioMedio.setForeground(Color.WHITE);
		tamanhos.add(radioMedio);
		radioMedio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		radioMedio.setBackground(new Color(62, 00, 00));
		radioMedio.setBounds(25, 196, 115, 23);
		contentPane.add(radioMedio);

		radioGrande = new JRadioButton("GRANDE");
		radioGrande.setForeground(Color.WHITE);
		tamanhos.add(radioGrande);
		radioGrande.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		radioGrande.setBackground(new Color(68, 00, 00));
		radioGrande.setBounds(25, 222, 115, 23);
		contentPane.add(radioGrande);

		checkCarneExtra = new JCheckBox("CARNE EXTRA");
		checkCarneExtra.setBackground(new Color(100, 11, 11));
		checkCarneExtra.setForeground(Color.WHITE);
		checkCarneExtra.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		checkCarneExtra.setBounds(32, 294, 108, 23);
		contentPane.add(checkCarneExtra);

		checkCremeAlho = new JCheckBox("CR\u00C8ME ALHO");
		checkCremeAlho.setForeground(Color.WHITE);
		checkCremeAlho.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		checkCremeAlho.setBackground(new Color(100, 11, 11));
		checkCremeAlho.setBounds(32, 320, 108, 23);
		contentPane.add(checkCremeAlho);

		checkChilli = new JCheckBox("CHILLI");
		checkChilli.setForeground(Color.WHITE);
		checkChilli.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		checkChilli.setBackground(new Color(100, 11, 11));
		checkChilli.setBounds(32, 342, 108, 23);
		contentPane.add(checkChilli);

		checkCroutons = new JCheckBox("CROUTONS");
		checkCroutons.setForeground(Color.WHITE);
		checkCroutons.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		checkCroutons.setBackground(new Color(100, 11, 11));
		checkCroutons.setBounds(32, 368, 108, 23);
		contentPane.add(checkCroutons);

		checkShitake = new JCheckBox("SHITAKE");
		checkShitake.setForeground(Color.WHITE);
		checkShitake.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		checkShitake.setBackground(new Color(100, 11, 11));
		checkShitake.setBounds(32, 394, 108, 23);
		contentPane.add(checkShitake);

		checkTofu = new JCheckBox("TOFU");
		checkTofu.setForeground(Color.WHITE);
		checkTofu.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		checkTofu.setBackground(new Color(100, 11, 11));
		checkTofu.setBounds(32, 415, 108, 23);
		contentPane.add(checkTofu);

		radioVegano = new JRadioButton("VEGANO");
		carne.add(radioVegano);
		radioVegano.setForeground(Color.WHITE);
		radioVegano.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioVegano.setBackground(new Color(56, 0, 0));
		radioVegano.setBounds(222, 170, 115, 23);
		contentPane.add(radioVegano);

		radioPorco = new JRadioButton("PORCO");
		carne.add(radioPorco);
		radioPorco.setForeground(Color.WHITE);
		radioPorco.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioPorco.setBackground(new Color(62, 0, 0));
		radioPorco.setBounds(222, 196, 115, 23);
		contentPane.add(radioPorco);

		radioBoi = new JRadioButton("BOI");
		carne.add(radioBoi);
		radioBoi.setForeground(Color.WHITE);
		radioBoi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioBoi.setBackground(new Color(68, 0, 0));
		radioBoi.setBounds(222, 222, 115, 23);
		contentPane.add(radioBoi);

		radioRefri = new JRadioButton("REFRIGERANTE");
		bebida.add(radioRefri);
		radioRefri.setForeground(Color.WHITE);
		radioRefri.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioRefri.setBackground(new Color(100, 11, 11));
		radioRefri.setBounds(222, 291, 129, 23);
		contentPane.add(radioRefri);

		radioOCha = new JRadioButton("O-CHA (VERDE)");
		bebida.add(radioOCha);
		radioOCha.setForeground(Color.WHITE);
		radioOCha.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioOCha.setBackground(new Color(100, 11, 11));
		radioOCha.setBounds(222, 319, 129, 23);
		contentPane.add(radioOCha);

		radioKoCha = new JRadioButton("KO-CHA (PRETO)");
		bebida.add(radioKoCha);
		radioKoCha.setForeground(Color.WHITE);
		radioKoCha.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioKoCha.setBackground(new Color(100, 11, 11));
		radioKoCha.setBounds(222, 343, 129, 23);
		contentPane.add(radioKoCha);

		btnFazerPedido = new JButton("FAZER PEDIDO");
		btnFazerPedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// realizar o pedido
				LEsperaSingleton lista_de_espera = LEsperaSingleton.getInstancia();
				try {
					lista_de_espera.addPedido(null);
				} catch (PedidoException e1) {
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnFazerPedido.setForeground(Color.BLACK);
		btnFazerPedido.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnFazerPedido.setBackground(Color.ORANGE);
		btnFazerPedido.setBounds(134, 491, 170, 63);
		contentPane.add(btnFazerPedido);

		JLabel background = new JLabel("");
		background.setBackground(Color.ORANGE);
		background.setAlignmentY(Component.TOP_ALIGNMENT);
		background.setFocusTraversalKeysEnabled(false);
		background.setFocusable(false);
		background.setBounds(0, 0, 441, 627);
		background.setIcon(new ImageIcon(Menu.class.getResource("/gui/img/menu.png")));
		contentPane.add(background);

	}

}
