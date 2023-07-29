package main;

import main.InterfazGeneral;
import main.Temperatura;
import main.ReglaDeTresSimple;
import com.datos.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;


@SuppressWarnings({ "serial", "unused" })
public class Monedas extends JFrame implements Datos{

	private JPanel contentPane;
	private JTextField ingreso_cantidad;
	private JTextField final_cantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monedas frame = new Monedas();
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
	public Monedas(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Monedas.class.getResource("/com/imgs/mymelodyicon400.png")));
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
		JButton btn_ConversorMonedas_inicio = new JButton("Inicio");
		btn_ConversorMonedas_inicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ConversorMonedas_inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazGeneral inicio = new InterfazGeneral();
				inicio.setVisible(true);
				inicio.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_ConversorMonedas_inicio.setForeground(new Color(204, 0, 102));
		btn_ConversorMonedas_inicio.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorMonedas_inicio.setBackground(new Color(255, 234, 244));
		btn_ConversorMonedas_inicio.setBounds(10, 74, 126, 64);
		panel.add(btn_ConversorMonedas_inicio);
		
		//monedas
		JButton btn_ConversorMonedas_monedas = new JButton("Monedas");
		btn_ConversorMonedas_monedas.setToolTipText("Usted ya está aquí!");
		btn_ConversorMonedas_monedas.setForeground(new Color(204, 0, 102));
		btn_ConversorMonedas_monedas.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorMonedas_monedas.setBackground(new Color(255, 234, 244));
		btn_ConversorMonedas_monedas.setBounds(10, 149, 126, 64);
		panel.add(btn_ConversorMonedas_monedas);
		
		//temperatura
		JButton btn_ConversorMonedas_temperatura = new JButton("Temperatura");
		btn_ConversorMonedas_temperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ConversorMonedas_temperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
				temperatura.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_ConversorMonedas_temperatura.setForeground(new Color(204, 0, 102));
		btn_ConversorMonedas_temperatura.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btn_ConversorMonedas_temperatura.setBackground(new Color(255, 234, 244));
		btn_ConversorMonedas_temperatura.setBounds(10, 224, 126, 64);
		panel.add(btn_ConversorMonedas_temperatura);
		
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
		Label label = new Label("Conversor de monedas");
		label.setForeground(new Color(128, 0, 64));
		label.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		label.setAlignment(Label.CENTER);
		label.setBounds(144, 32, 403, 39);
		contentPane.add(label);
		
		//CONVERSOR
		//espacio para ingresar cantidad
		ingreso_cantidad = new JTextField();
		ingreso_cantidad.setToolTipText("Introduce la cantidad de pesos argentinos");
		ingreso_cantidad.setSelectionColor(new Color(255, 128, 192));
		ingreso_cantidad.setBounds(208, 102, 140, 48);
		contentPane.add(ingreso_cantidad);
		ingreso_cantidad.setColumns(10);
		
		//espacio para mostrar el resultado
		final_cantidad = new JTextField();
		final_cantidad.setToolTipText("Aquí aparecerá el resultado de la conversion");
		final_cantidad.setSelectionColor(new Color(255, 128, 192));
		final_cantidad.setColumns(10);
		final_cantidad.setBounds(208, 215, 140, 48);
		contentPane.add(final_cantidad);
		
		//seleccion divisas
		JComboBox final_divisas = new JComboBox<String>();
		final_divisas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		final_divisas.setForeground(new Color(83, 0, 41));
		final_divisas.setBackground(new Color(255, 215, 235));
		final_divisas.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "Dólar", "Euro", "Libra esterlina", "Yen japonés", "Won surcoreano"}));
		final_divisas.setBounds(373, 220, 105, 39);
		contentPane.add(final_divisas);
		
		//texto equivale a...
		JLabel lblNewLabel = new JLabel("equivale a...");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(233, 150, 209, 67);
		contentPane.add(lblNewLabel);
		
		//boton conversion
		JButton btn_convertir = new JButton("Convertir");
		btn_convertir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_convertir.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		btn_convertir.setForeground(new Color(83, 0, 41));
		btn_convertir.setBackground(new Color(255, 215, 235));
		btn_convertir.setBorder(new LineBorder(new Color(174, 0, 87)));
		btn_convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { //convierte
					int seleccionUsuario = final_divisas.getSelectedIndex();
					String cantidadUsuario = ingreso_cantidad.getText();
					double cantidadMonedas = Double.parseDouble(cantidadUsuario);
				
					Metodos conversion = new Metodos();
					conversion.setCantidadInsertada(cantidadMonedas);
					conversion.setSeleccionUsuario(seleccionUsuario);
					
					final_cantidad.setText(Double.toString((conversion.convertirMonedas())));
				} catch (NumberFormatException exception) { //si hay errores...
					JOptionPane.showMessageDialog(null, "No admite convertir texto ni dejar el campo vacío >:(", "˚ ༘♡ ⋆｡˚ ADVERTENCIA ⋆.ೃ࿔*:･", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_convertir.setBounds(278, 294, 140, 48);
		contentPane.add(btn_convertir);
		
		//texto
		JLabel lblArs = new JLabel("Peso argentino");
		lblArs.setHorizontalAlignment(SwingConstants.CENTER);
		lblArs.setForeground(new Color(128, 0, 64));
		lblArs.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblArs.setBounds(360, 106, 132, 44);
		contentPane.add(lblArs);
	}
}
