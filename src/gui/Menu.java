package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import business.Pedido;
import business.bebidas.KoCha;
import business.bebidas.OCha;
import business.bebidas.Refrigerante;
import business.carnes.CarneBoi;
import business.carnes.CarnePorco;
import business.carnes.CarneVegana;
import business.exception.PedidoException;
import business.extras.CarneExtra;
import business.extras.Chili;
import business.extras.CremeAlho;
import business.extras.Croutons;
import business.extras.Shitake;
import business.extras.Tofu;
import business.pratos.Prato;
import business.pratos.PratoGrande;
import business.pratos.PratoMedio;
import business.pratos.PratoPequeno;

public class Menu extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private final ButtonGroup tamanhos = new ButtonGroup();
	private final ButtonGroup carne = new ButtonGroup();
	private final ButtonGroup bebida = new ButtonGroup();

	private List<JRadioButton> tamanho = new ArrayList<JRadioButton>();
	private String[] tamanhoStr = { "PEQUENO", "MEDIO", "GRANDE" };

	private List<JCheckBox> extra = new ArrayList<JCheckBox>();
	private String[] extraStr = { "CARNE EXTRA", "CR\u00C8ME ALHO", "CHILLI", "CROUTONS", "SHITAKE", "TOFU" };

	private List<JRadioButton> carnes = new ArrayList<JRadioButton>();
	private String[] carneStr = { "VEGANO", "PORCO", "BOI" };

	private List<JRadioButton> bebidas = new ArrayList<JRadioButton>();
	private String[] bebidaStr = { "REFRIGERANTE", "O-CHA (VERDE)", "KO-CHA (PRETO)" };

	private JButton btnFazerPedido;
	private Prato prato;

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
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		int altTam = 170;
		for (int i = 0; i < 3; i++) {
			JRadioButton radio = new JRadioButton(tamanhoStr[i]);
			radio.setActionCommand(tamanhoStr[i]);
			radio.setForeground(Color.WHITE);
			radio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			radio.setBackground(new Color(56, 00, 00));
			radio.setBounds(25, altTam, 115, 23);
			altTam += 26;
			tamanho.add(radio);
			tamanhos.add(radio);
			contentPane.add(radio);
		}

		int altExtra = 294;
		for (int i = 0; i < 6; i++) {
			JCheckBox checkBox = new JCheckBox(extraStr[i]);
			checkBox.setActionCommand(extraStr[i]);
			checkBox.setBackground(new Color(100, 11, 11));
			checkBox.setForeground(Color.WHITE);
			checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			checkBox.setBounds(32, altExtra, 108, 23);
			altExtra += 24;
			contentPane.add(checkBox);
			extra.add(checkBox);
		}

		int altCarne = 170;
		for (int i = 0; i < 3; i++) {
			JRadioButton radio = new JRadioButton(carneStr[i]);
			radio.setActionCommand(carneStr[i]);
			radio.setForeground(Color.WHITE);
			radio.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			radio.setBackground(new Color(56, 00, 00));
			radio.setBounds(222, altCarne, 115, 23);
			altCarne += 26;
			carne.add(radio);
			carnes.add(radio);
			contentPane.add(radio);
		}

		int altBebida = 291;
		for (int i = 0; i < 3; i++) {
			JRadioButton radio = new JRadioButton(bebidaStr[i]);
			radio.setActionCommand(bebidaStr[i]);
			radio.setForeground(Color.WHITE);
			radio.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			radio.setBackground(new Color(100, 11, 11));
			radio.setBounds(222, altBebida, 129, 23);
			altBebida += 26;
			bebida.add(radio);
			bebidas.add(radio);
			contentPane.add(radio);
		}

		btnFazerPedido = new JButton("FAZER PEDIDO");
		btnFazerPedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// realizar o pedido
				Pedido pedido = new Pedido();
				boolean estaSelecionada = false;
				Optional<String> bebidasOpt = Optional.empty();

				// Verificando se alguma checkbox está selecionada
				for (JCheckBox checkbox : extra) {
					if (checkbox.isSelected()) {
						estaSelecionada = true;
						break;
					}
				}

				// Tratando tamanho de prato
				Optional<String> tamanhoOpt = Optional.empty();
				try {
					if (tamanhos.getSelection() != null) {

						tamanhoOpt = Optional.of(tamanhos.getSelection().getActionCommand());
						switch (tamanhoOpt.get()) {
						case "GRANDE":
							prato = new PratoGrande();
							break;
						case "MEDIO":
							prato = new PratoMedio();
							break;
						case "PEQUENO":
							prato = new PratoPequeno();
							break;
						}

						// Tratando carne
						Optional<String> carnes = Optional.empty();
						if (carne.getSelection() != null) {
							carnes = Optional.of(carne.getSelection().getActionCommand());
							switch (carnes.get()) {
							case "VEGANO":
								prato = new CarneVegana(prato);
								break;
							case "PORCO":
								prato = new CarnePorco(prato);
								break;
							case "BOI":
								prato = new CarneBoi(prato);
								break;
							}
						}

						// Tratando extras
						for (JCheckBox checkbox : extra) {
							if (checkbox.isSelected()) {
								String value = checkbox.getActionCommand();
								switch (value) {
								case "CARNE EXTRA":
									prato = new CarneExtra(prato);
									break;
								case "CR\u00C8ME ALHO":
									prato = new CremeAlho(prato);
									break;
								case "CHILLI":
									prato = new Chili(prato);
									break;
								case "CROUTONS":
									prato = new Croutons(prato);
									break;
								case "SHITAKE":
									prato = new Shitake(prato);
									break;
								case "TOFU":
									prato = new Tofu(prato);
									break;
								}
							}
						}

						pedido.addProduto(prato);
					} 
					
					if (bebida.getSelection() != null) {
						// Tratando bebidas
						bebidasOpt = Optional.of(bebida.getSelection().getActionCommand());
						switch (bebidasOpt.get()) {
						case "REFRIGERANTE":
							pedido.addProduto(new Refrigerante());
							break;
						case "O-CHA (VERDE)":
							pedido.addProduto(new OCha());
							break;
						case "KO-CHA (PRETO)":
							pedido.addProduto(new KoCha());
							break;
						}
					}
					dispose();
					
					if (carne.getSelection() != null || estaSelecionada) {
						NotificacaoPedido janelaExc = new NotificacaoPedido("Escolha um prato, por favor!");
						dispose();
						janelaExc.setVisible(true);
					} else if (tamanhos.getSelection() != null || bebida.getSelection() != null ){
						DetalhesPedido janela = new DetalhesPedido(pedido);
						janela.setVisible(true);

						// Aqui ainda não entendi como travar a thread sem bloquear o resto do programa
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						pedido.setStatus("Pedido Pronto");
					} else {
						NotificacaoPedido janelaExc = new NotificacaoPedido("Escolha algum item, por favor!");
						janelaExc.setVisible(true);
					}	
				} catch (PedidoException p) {
					p.getMessage();
				}
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
