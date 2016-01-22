package vista;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Cuadrado;

/**
 * 
 * @author Adrian
 *
 */
public class VCuadradoPerimetro extends JFrame implements ActionListener{
	
	/**
	 * Clave
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lbLado = new JLabel("Lado");
	private JLabel lbResult = new JLabel("Resultado");
	private JTextField txtLado = new JTextField();
	private JButton btnCalcular = new JButton("Calcular");
	
	Container c = getContentPane();
	Cuadrado cuadrado = new Cuadrado();

	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VCuadradoPerimetro() {
		super.setTitle("Cuadrado Perímetro");
		super.setSize(340, 480);
		
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
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
			
			double [] parameters = new double[1];
			parameters[0] = Double.parseDouble(txtLado.getText());
			
			lbResult.setText(String.format("%f", cuadrado.perimetro(parameters)));
		}
	}
}
