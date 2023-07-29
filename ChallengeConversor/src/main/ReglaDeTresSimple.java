package main;
import main.InterfazGeneral;
import main.Monedas;
import main.Temperatura;
import com.datos.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;


@SuppressWarnings({ "serial", "unused" })
public class ReglaDeTresSimple extends JFrame {

	private JPanel contentPane;
	private JTextField reglaDeTres_primero;
	private JTextField reglaDeTres_segundo;
	private JTextField reglaDeTres_tercero;
	private JTextField reglaDeTres_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReglaDeTresSimple frame = new ReglaDeTresSimple();
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
	public ReglaDeTresSimple() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ReglaDeTresSimple.class.getResource("/com/imgs/mymelodyicon400.png")));
		initComponents();
	}

	//contiene el código para crear e inicializar componentes
	private void initComponents() {
		//LO GRAL
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
		panel.setLayout(null);
		panel.setBackground(new Color(255, 215, 235));
		contentPane.add(panel);
		
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
		JButton btn_conversorDistancia_inicio = new JButton("Inicio");
		btn_conversorDistancia_inicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_conversorDistancia_inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazGeneral inicio = new InterfazGeneral();
				inicio.setVisible(true);
				inicio.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_conversorDistancia_inicio.setForeground(new Color(204, 0, 102));
		btn_conversorDistancia_inicio.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_conversorDistancia_inicio.setBackground(new Color(255, 234, 244));
		btn_conversorDistancia_inicio.setBounds(10, 74, 126, 64);
		panel.add(btn_conversorDistancia_inicio);
		
		//monedas
		JButton btn_ConversorDistancia_monedas = new JButton("Monedas");
		btn_ConversorDistancia_monedas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ConversorDistancia_monedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monedas monedas = new Monedas();
				monedas.setVisible(true);
				monedas.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_ConversorDistancia_monedas.setForeground(new Color(204, 0, 102));
		btn_ConversorDistancia_monedas.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorDistancia_monedas.setBackground(new Color(255, 234, 244));
		btn_ConversorDistancia_monedas.setBounds(10, 149, 126, 64);
		panel.add(btn_ConversorDistancia_monedas);
		
		//temperatura
		JButton btn_ConversorDistancia_temperatura = new JButton("Temperatura");
		btn_ConversorDistancia_temperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ConversorDistancia_temperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
				temperatura.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_ConversorDistancia_temperatura.setForeground(new Color(204, 0, 102));
		btn_ConversorDistancia_temperatura.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorDistancia_temperatura.setBackground(new Color(255, 234, 244));
		btn_ConversorDistancia_temperatura.setBounds(10, 224, 126, 64);
		panel.add(btn_ConversorDistancia_temperatura);
		
		//distancia
		JButton btn_ConversorDistancia_distancia = new JButton("Regla de tres");
		btn_ConversorDistancia_distancia.setToolTipText("Usted ya está aquí!");
		btn_ConversorDistancia_distancia.setForeground(new Color(204, 0, 102));
		btn_ConversorDistancia_distancia.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorDistancia_distancia.setBackground(new Color(255, 234, 244));
		btn_ConversorDistancia_distancia.setBounds(10, 299, 126, 64);
		panel.add(btn_ConversorDistancia_distancia);
		
		//salir
		JButton btn_exit = new JButton("Salir");
		btn_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_exit.setForeground(new Color(128, 0, 64));
		btn_exit.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		btn_exit.setBackground(new Color(255, 234, 244));
		btn_exit.setBounds(10, 395, 128, 37);
		panel.add(btn_exit);
		
		//texto
		Label label = new Label("Calculadora regla de tres simple");
		label.setBounds(144, 32, 403, 39);
		label.setForeground(new Color(128, 0, 64));
		label.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		label.setAlignment(Label.CENTER);
		contentPane.add(label);
		
		//REGLA DE TRES
		//primer lugar donde poner datos
		reglaDeTres_primero = new JTextField();
		reglaDeTres_primero.setSelectionColor(new Color(255, 128, 192));
		reglaDeTres_primero.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		reglaDeTres_primero.setForeground(new Color(83, 0, 41));
		reglaDeTres_primero.setToolTipText("Introduce el primer dato...");
		reglaDeTres_primero.setColumns(10);
		reglaDeTres_primero.setBounds(169, 109, 146, 48);
		contentPane.add(reglaDeTres_primero);
		
		//segundo lugar donde poner datos
		reglaDeTres_segundo = new JTextField();
		reglaDeTres_segundo.setSelectionColor(new Color(255, 128, 192));
		reglaDeTres_segundo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		reglaDeTres_segundo.setForeground(new Color(83, 0, 41));
		reglaDeTres_segundo.setToolTipText("Introduce el segundo dato...");
		reglaDeTres_segundo.setColumns(10);
		reglaDeTres_segundo.setBounds(374, 109, 147, 48);
		contentPane.add(reglaDeTres_segundo);
		
		//tercer lugar donde poner datos
		reglaDeTres_tercero = new JTextField();
		reglaDeTres_tercero.setSelectionColor(new Color(255, 128, 192));
		reglaDeTres_tercero.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		reglaDeTres_tercero.setForeground(new Color(83, 0, 41));
		reglaDeTres_tercero.setToolTipText("Introduce el tercer dato...");
		reglaDeTres_tercero.setColumns(10);
		reglaDeTres_tercero.setBounds(169, 205, 146, 48);
		contentPane.add(reglaDeTres_tercero);
		
		//resultado de la regla de tres
		reglaDeTres_resultado = new JTextField();
		reglaDeTres_resultado.setSelectionColor(new Color(255, 128, 192));
		reglaDeTres_resultado.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		reglaDeTres_resultado.setForeground(new Color(83, 0, 41));
		reglaDeTres_resultado.setToolTipText("Aquí aparecerá el resultado de la regla");
		reglaDeTres_resultado.setColumns(10);
		reglaDeTres_resultado.setBounds(374, 205, 147, 48);
		contentPane.add(reglaDeTres_resultado);
		
		//botón calcular
		JButton btn_calcular = new JButton("Calcular");
		btn_calcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { //convierte
					String cantidadUsuario_1 = reglaDeTres_primero.getText();
					double cantidadPrimero = Double.parseDouble(cantidadUsuario_1);
					
					String cantidadUsuario_2 = reglaDeTres_segundo.getText();
					double cantidadSegundo = Double.parseDouble(cantidadUsuario_2);
					
					String cantidadUsuario_3 = reglaDeTres_tercero.getText();
					double cantidadTercero = Double.parseDouble(cantidadUsuario_3);
				
					ReglaDeTres conversion = new ReglaDeTres();
					conversion.setCantidadInsertada_1(cantidadPrimero);
					conversion.setCantidadInsertada_2(cantidadSegundo);
					conversion.setCantidadInsertada_3(cantidadTercero);
					
					reglaDeTres_resultado.setText(Double.toString((conversion.calculoReglaDeTres())));
				} catch (NumberFormatException exception) { //si hay errores...
					JOptionPane.showMessageDialog(null, "No admite convertir texto ni dejar el campo vacío >:(", "˚ ༘♡ ⋆｡˚ ADVERTENCIA ⋆.ೃ࿔*:･", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_calcular.setForeground(new Color(83, 0, 41));
		btn_calcular.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		btn_calcular.setBorder(new LineBorder(new Color(174, 0, 87)));
		btn_calcular.setBackground(new Color(255, 215, 235));
		btn_calcular.setBounds(269, 294, 140, 48);
		contentPane.add(btn_calcular);
		
		//flechas
		JLabel lblNewLabel = new JLabel("—>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
		lblNewLabel.setBounds(310, 109, 70, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("—>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(310, 205, 70, 48);
		contentPane.add(lblNewLabel_1);
	}
}
