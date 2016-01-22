package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Circulo;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class VCirculoArea extends JFrame implements ActionListener {
	
	/**
	 * Clave
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lbDiametro = new JLabel("Radio");
	private JLabel lbResult = new JLabel("Resultado");
	private JTextField txtDiametro = new JTextField();
	private JButton btnCalcular = new JButton("Calcular");

	private Container c = getContentPane();
	Circulo circulo = new Circulo();

	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VCirculoArea() {
		
		super.setTitle("Círculo Área");
		super.setSize(340, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		cargarControles();
	}

	/**
	 * Configura los controles UI
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		
		lbDiametro.setBounds(10, 30, 300, 50);
		txtDiametro.setBounds(10, 130, 300, 50);
		btnCalcular.setBounds(10, 230, 300, 50);
		lbResult.setBounds(10, 290, 300, 50);

		c.add(lbDiametro);
		c.add(txtDiametro);
		c.add(btnCalcular);
		c.add(lbResult);

		btnCalcular.addActionListener(this);

	}
	

	/**
	 *  Eventos
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnCalcular) {
			
			double [] parameters = new double[1];
			parameters[0] = Double.parseDouble(txtDiametro.getText());
			
			lbResult.setText(String.format("%f", circulo.area(parameters)));
		
		}
	}

}
