package main;
import main.InterfazGeneral;
import main.Monedas;
import main.ReglaDeTresSimple;
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
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

@SuppressWarnings({ "serial", "unused" })
public class Temperatura extends JFrame {

	private JPanel contentPane;
	private JTextField ingreso_usuario;
	private JTextField respuesta_usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura();
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
	public Temperatura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Temperatura.class.getResource("/com/imgs/mymelodyicon400.png")));
		initComponents();
	}

	//contiene el código para crear e inicializar componentes
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		panel.setLayout(null);
		panel.setBackground(new Color(255, 215, 235));
		panel.setBounds(0, 0, 146, 443);
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
		JButton btn_ConversorTemperatura_inicio = new JButton("Inicio");
		btn_ConversorTemperatura_inicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ConversorTemperatura_inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazGeneral inicio = new InterfazGeneral();
				inicio.setVisible(true);
				inicio.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_ConversorTemperatura_inicio.setForeground(new Color(204, 0, 102));
		btn_ConversorTemperatura_inicio.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorTemperatura_inicio.setBackground(new Color(255, 234, 244));
		btn_ConversorTemperatura_inicio.setBounds(10, 74, 126, 64);
		panel.add(btn_ConversorTemperatura_inicio);
		
		//monedas
		JButton btn_ConversorTemperatura_monedas = new JButton("Monedas");
		btn_ConversorTemperatura_monedas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ConversorTemperatura_monedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monedas monedas = new Monedas();
				monedas.setVisible(true);
				monedas.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_ConversorTemperatura_monedas.setForeground(new Color(204, 0, 102));
		btn_ConversorTemperatura_monedas.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorTemperatura_monedas.setBackground(new Color(255, 234, 244));
		btn_ConversorTemperatura_monedas.setBounds(10, 149, 126, 64);
		panel.add(btn_ConversorTemperatura_monedas);
		
		//temperatura
		JButton btn_ConversorTemperatura_temperatura = new JButton("Temperatura");
		btn_ConversorTemperatura_temperatura.setToolTipText("Usted ya está aquí!");
		btn_ConversorTemperatura_temperatura.setForeground(new Color(204, 0, 102));
		btn_ConversorTemperatura_temperatura.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorTemperatura_temperatura.setBackground(new Color(255, 234, 244));
		btn_ConversorTemperatura_temperatura.setBounds(10, 224, 126, 64);
		panel.add(btn_ConversorTemperatura_temperatura);
		
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
		Label label = new Label("Conversor de temperatura");
		label.setForeground(new Color(128, 0, 64));
		label.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		label.setAlignment(Label.CENTER);
		label.setBounds(144, 32, 403, 39);
		contentPane.add(label);
		
		//CONVERSOR
		//espacio para ingresar cantidad
		ingreso_usuario = new JTextField();
		ingreso_usuario.setToolTipText("Ingrese lo que desea convertir");
		ingreso_usuario.setSelectionColor(new Color(255, 128, 192));
		ingreso_usuario.setColumns(10);
		ingreso_usuario.setBounds(250, 108, 189, 52);
		contentPane.add(ingreso_usuario);
		
		//espacio para mostrar el resultado
		respuesta_usuario = new JTextField();
		respuesta_usuario.setToolTipText("Aquí aparecerá el resultado de la conversión");
		respuesta_usuario.setSelectionColor(new Color(255, 128, 192));
		respuesta_usuario.setColumns(10);
		respuesta_usuario.setBounds(250, 265, 189, 52);
		contentPane.add(respuesta_usuario);
		
		//seleccion temperatura
		JComboBox<String> seleccion_temp = new JComboBox<String>();
		seleccion_temp.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit"}));
		seleccion_temp.setForeground(new Color(83, 0, 41));
		seleccion_temp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		seleccion_temp.setBackground(new Color(255, 215, 235));
		seleccion_temp.setBounds(275, 193, 136, 39);
		contentPane.add(seleccion_temp);
		
		//boton conversion
		JButton btn_convertir = new JButton("Convertir");
		btn_convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { //convierte
					int seleccionUsuario = seleccion_temp.getSelectedIndex();
					String cantidadUsuario = ingreso_usuario.getText();
					double cantidadTemp = Double.parseDouble(cantidadUsuario);
					
					Metodos conversion = new Metodos();
					conversion.setCantidadInsertada(cantidadTemp);
					conversion.setSeleccionUsuario(seleccionUsuario);
						
					respuesta_usuario.setText(Double.toString((conversion.convertirTemperatura())));
				} catch (NumberFormatException exception) { //si hay errores...
					JOptionPane.showMessageDialog(null, "No admite convertir texto ni dejar el campo vacío >:(", "˚ ༘♡ ⋆｡˚ ADVERTENCIA ⋆.ೃ࿔*:･", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_convertir.setForeground(new Color(83, 0, 41));
		btn_convertir.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		btn_convertir.setBorder(new LineBorder(new Color(174, 0, 87)));
		btn_convertir.setBackground(new Color(255, 215, 235));
		btn_convertir.setBounds(275, 351, 140, 48);
		contentPane.add(btn_convertir);
	}
}
