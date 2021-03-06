package vista;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Rectangulo;

/**
 * 
 * @author Adrian
 *
 */
public class VRectanguloArea extends JFrame implements ActionListener {
	
	/**
	 *  Clave
	 */
	private static final long serialVersionUID = -8950621314014894005L;
	
	private JLabel lblado1 = new JLabel("Lado 1");
	private JTextField txtlado1 = new JTextField();
	private JLabel lblado2 = new JLabel("Lado 2");
	private JLabel lbResult = new JLabel("Resultado");
	private JTextField txtlado2 = new JTextField();
	private JButton btncalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	Rectangulo recta = new Rectangulo();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public  VRectanguloArea(){
		super.setTitle("Rectangulo Área");
		super.setSize(340,480);
		
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
		lblado1.setBounds(10,10,300,50);
		txtlado1.setBounds(10,50,300,50);
		lblado2.setBounds(10,130,300,50);
		txtlado2.setBounds(10,170,300,50);
		btncalcular.setBounds(10,250,300,50);
		lbResult.setBounds(10,310,300,50);
		
		c.add(lblado1);
		c.add(txtlado1);
		c.add(lblado2);
		c.add(txtlado2);
		c.add(btncalcular);
		c.add(lbResult);
		
		btncalcular.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btncalcular) {
			
			double [] parameters = new double[2];
			
			parameters[0] = Double.parseDouble(txtlado1.getText());
			parameters[1] = Double.parseDouble(txtlado2.getText());
			
			lbResult.setText(String.format("%f", recta.area(parameters)));
		}
		
	}
}
