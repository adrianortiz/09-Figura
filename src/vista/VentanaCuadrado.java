package vista;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Parametros;

/**
 * 
 * @author Adrian
 *
 */
public class VentanaCuadrado extends JFrame implements ActionListener{
	
	/**
	 * Clave
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lbLado = new JLabel("Lado");
	private JLabel lbResult = new JLabel("Resultado");
	private JTextField txtLado = new JTextField();
	private JButton btnCalcular = new JButton("Calcular");
	
	Container c = getContentPane();
	Parametros p = new Parametros();

	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VentanaCuadrado() {
		setTitle("Cuadrado");
		setSize(340, 480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Metodo para cargar objetos
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbLado.setBounds(10,30,300,50);
		txtLado.setBounds(10,130,300,50);
		btnCalcular.setBounds(10,230,300,50);
		lbResult.setBounds(10,290,300,50);
		
		c.add(lbLado);
		c.add(txtLado);
		c.add(btnCalcular);
		c.add(lbResult);
		
		btnCalcular.addActionListener(this);		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCalcular){
			int result = p.areaCuadrado(Integer.parseInt(txtLado.getText()));
			lbResult.setText(String.format("%d", result));
		}
	}
}
