package main;
import main.Monedas;
import main.Temperatura;
import main.ReglaDeTresSimple;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Cursor;
import java.awt.Toolkit;

@SuppressWarnings({ "serial", "unused" })
public class InterfazGeneral extends JFrame {

	private JPanel contentPane;
	private JButton btn_InterfazGral_temperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGeneral frame = new InterfazGeneral();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the frame.
	 */
	public InterfazGeneral() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InterfazGeneral.class.getResource("/com/imgs/mymelodyicon400.png")));
		initComponents();
	}
	
	//contiene el código para crear e inicializar componentes
	private void initComponents() {
		//LO GRAL
		setLocationRelativeTo(null);
		setTitle("˚ ༘♡ ⋆｡˚ Conversor Challenge ONE ⋆.ೃ࿔*:･");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//PANEL IZQ
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 146, 443);
		panel.setBackground(new Color(255, 215, 235));
		contentPane.add(panel);
		panel.setLayout(null);
		
		//texto bienvenida
		JLabel bienvenido = new JLabel("Bienvenido!");
		bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		bienvenido.setForeground(new Color(130, 0, 65));
		bienvenido.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		bienvenido.setBackground(new Color(136, 0, 68));
		bienvenido.setBounds(0, 20, 146, 37);
		panel.add(bienvenido);
		
		//BOTONES
		//inicio
		JButton btn_InterfazGral_inicio = new JButton("Inicio");
		btn_InterfazGral_inicio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btn_InterfazGral_inicio.setToolTipText("Usted ya está aquí!");
		btn_InterfazGral_inicio.setForeground(new Color(204, 0, 102));
		btn_InterfazGral_inicio.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_InterfazGral_inicio.setBackground(new Color(255, 234, 244));
		btn_InterfazGral_inicio.setBounds(10, 74, 126, 64);
		panel.add(btn_InterfazGral_inicio);
				
		//monedas
		JButton btn_InterfazGral_monedas = new JButton("Monedas");
		btn_InterfazGral_monedas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_InterfazGral_monedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monedas monedas = new Monedas();
				monedas.setVisible(true);
				monedas.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_InterfazGral_monedas.setForeground(new Color(204, 0, 102));
		btn_InterfazGral_monedas.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_InterfazGral_monedas.setBackground(new Color(255, 234, 244));
		btn_InterfazGral_monedas.setBounds(10, 149, 126, 64);
		panel.add(btn_InterfazGral_monedas);
				
		//temperatura
		btn_InterfazGral_temperatura = new JButton("Temperatura");
		btn_InterfazGral_temperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_InterfazGral_temperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
				temperatura.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_InterfazGral_temperatura.setForeground(new Color(204, 0, 102));
		btn_InterfazGral_temperatura.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_InterfazGral_temperatura.setBackground(new Color(255, 234, 244));
		btn_InterfazGral_temperatura.setBounds(10, 224, 126, 64);
		panel.add(btn_InterfazGral_temperatura);
		
		//regla de tres simple
		JButton btn_InterfazGral_reglaDeTres = new JButton("Regla de tres");
		btn_InterfazGral_reglaDeTres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_InterfazGral_reglaDeTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReglaDeTresSimple reglaDeTres = new ReglaDeTresSimple();
				reglaDeTres.setVisible(true);
				reglaDeTres.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_InterfazGral_reglaDeTres.setForeground(new Color(204, 0, 102));
		btn_InterfazGral_reglaDeTres.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_InterfazGral_reglaDeTres.setBackground(new Color(255, 234, 244));
		btn_InterfazGral_reglaDeTres.setBounds(10, 299, 126, 64);
		panel.add(btn_InterfazGral_reglaDeTres);
		
		//salir
		JButton btn_exit = new JButton("Salir");
		btn_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_exit.setBounds(10, 395, 128, 37);
		panel.add(btn_exit);
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_exit.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		btn_exit.setForeground(new Color(128, 0, 64));
		btn_exit.setBackground(new Color(255, 234, 244));
		
		//GIF MY MELODY
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InterfazGeneral.class.getResource("/com/imgs/mymelodyconversor.gif")));
		lblNewLabel.setBounds(241, 160, 200, 200);
		contentPane.add(lblNewLabel);
		
		//texto
		Label label = new Label("Este conversor fue creado para el Challenge Nº2");
		label.setAlignment(Label.CENTER);
		label.setForeground(new Color(128, 0, 64));
		label.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		label.setBounds(145, 47, 402, 39);
		contentPane.add(label);
		
		Label label_1 = new Label(" del programa Oracle Next Education. :)");
		label_1.setAlignment(Label.CENTER);
		label_1.setForeground(new Color(128, 0, 64));
		label_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		label_1.setBounds(145, 73, 402, 39);
		contentPane.add(label_1);
		
		Label label_2 = new Label("El conversor de monedas considera el valor \"blue\" de cada moneda al momento");
		label_2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		label_2.setForeground(new Color(102, 0, 51));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(145, 396, 402, 12);
		contentPane.add(label_2);
		
		Label label_2_1 = new Label("de calcular divisas. Además, no se ha tenido en cuenta que el valor de los ARS");
		label_2_1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		label_2_1.setForeground(new Color(102, 0, 51));
		label_2_1.setAlignment(Label.CENTER);
		label_2_1.setBounds(145, 410, 402, 12);
		contentPane.add(label_2_1);
		
		Label label_2_1_1 = new Label("se encuentra sujeto a cambios.");
		label_2_1_1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		label_2_1_1.setForeground(new Color(102, 0, 51));
		label_2_1_1.setAlignment(Label.CENTER);
		label_2_1_1.setBounds(145, 423, 402, 12);
		contentPane.add(label_2_1_1);
	}
}
