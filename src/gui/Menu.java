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

import business.IProduto;
import business.LEsperaSingleton;
import business.Pedido;
import business.bebidas.KoCha;
import business.bebidas.OCha;
import business.bebidas.Refrigerante;
import business.carnes.CarneBoi;
import business.carnes.CarnePorco;
import business.carnes.CarneVegetariana;
import business.exception.PedidoException;
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
	private String[] tamanhoStr =  {"PEQUENO", "MEDIO", "GRANDE"};
	
	private List<JCheckBox> extra = new ArrayList<JCheckBox>();
	private String[] extraStr =  {"CARNE EXTRA", "CR\u00C8ME ALHO", "CHILLI", "CROUTONS", "SHITAKE", "TOFU"};
	
	
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
		
		int altTam = 170; 
		for (int i = 0; i < 3; i++) {
			JRadioButton radio = new JRadioButton(tamanhoStr[i]);
			radio.setActionCommand(tamanhoStr[i]);
			radio.setForeground(Color.WHITE);
			tamanhos.add(radio);
			radio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			radio.setBackground(new Color(56, 00, 00));
			radio.setBounds(25, altTam, 115, 23);
			altTam += 26;
			contentPane.add(radio);
		}
		
		int altExtra = 294; 
		for (int i = 0; i < 6;i++) {
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

		radioVegano = new JRadioButton("VEGANO");
		radioVegano.setActionCommand("VEGANO");
		carne.add(radioVegano);
		radioVegano.setForeground(Color.WHITE);
		radioVegano.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioVegano.setBackground(new Color(56, 0, 0));
		radioVegano.setBounds(222, 170, 115, 23);
		contentPane.add(radioVegano);

		radioPorco = new JRadioButton("PORCO");
		radioPorco.setActionCommand("PORCO");
		carne.add(radioPorco);
		radioPorco.setForeground(Color.WHITE);
		radioPorco.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioPorco.setBackground(new Color(62, 0, 0));
		radioPorco.setBounds(222, 196, 115, 23);
		contentPane.add(radioPorco);

		radioBoi = new JRadioButton("BOI");
		radioBoi.setActionCommand("BOI");
		carne.add(radioBoi);
		radioBoi.setForeground(Color.WHITE);
		radioBoi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioBoi.setBackground(new Color(68, 0, 0));
		radioBoi.setBounds(222, 222, 115, 23);
		contentPane.add(radioBoi);

		radioRefri = new JRadioButton("REFRIGERANTE");
		radioRefri.setActionCommand("REFRIGERANTE");
		bebida.add(radioRefri);
		radioRefri.setForeground(Color.WHITE);
		radioRefri.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioRefri.setBackground(new Color(100, 11, 11));
		radioRefri.setBounds(222, 291, 129, 23);
		contentPane.add(radioRefri);

		radioOCha = new JRadioButton("O-CHA (VERDE)");
		radioOCha.setActionCommand("O-CHA");
		bebida.add(radioOCha);
		radioOCha.setForeground(Color.WHITE);
		radioOCha.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		radioOCha.setBackground(new Color(100, 11, 11));
		radioOCha.setBounds(222, 319, 129, 23);
		contentPane.add(radioOCha);

		radioKoCha = new JRadioButton("KO-CHA (PRETO)");
		radioKoCha.setActionCommand("KO-CHA");
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
				Pedido pedido = new Pedido();
				LEsperaSingleton lista_de_espera = LEsperaSingleton.getInstancia();
				//Tratando tamanho de prato
				Optional<String> tamanhoOpt = Optional.empty();
				try {
						if (tamanhos.getSelection() != null) {
							Prato prato = null;
							tamanhoOpt = Optional.of(tamanhos.getSelection().getActionCommand());
								switch(tamanhoOpt.get()) {
									case "GRANDE":
										prato = new PratoGrande();
										pedido.addProduto(prato);
										break;
									case "MEDIO":
										prato = new PratoMedio();
										pedido.addProduto(prato);
										break;
									case "PEQUENO":
										prato = new PratoPequeno();
										pedido.addProduto(prato);
										break;
								}
								
							//Tratando carne
							Optional<String> carnes = Optional.empty();
							if (radioVegano.isSelected() || radioPorco.isSelected() || radioBoi.isSelected()) {
								carnes = Optional.of(carne.getSelection().getActionCommand());
									switch(carnes.get()) {
										case "VEGANO":
											pedido.addProduto(new CarneVegetariana(prato));
											break;
										case "PORCO":
											pedido.addProduto(new CarnePorco(prato));
											break;
										case "BOI":
											pedido.addProduto(new CarneBoi(prato));
											break;
									}

							}
						}
					//Tratando bebidas
					Optional<String> bebidas = Optional.empty();
					if (radioRefri.isSelected() || radioOCha.isSelected() || radioKoCha.isSelected()) {
						bebidas = Optional.of(bebida.getSelection().getActionCommand());
						switch(bebidas.get()) {
							case "REFRIGERANTE":
								pedido.addProduto(new Refrigerante());
								break;
							case "O-CHA":
								pedido.addProduto(new OCha());
								break;
							case "KO-CHA":
								pedido.addProduto(new KoCha());
								break;
						}
					}
					lista_de_espera.addPedido(pedido);
				} catch (PedidoException p){
					p.getMessage();
				}
				//System.out.print(extra.getSelection().getActionCommand());
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
