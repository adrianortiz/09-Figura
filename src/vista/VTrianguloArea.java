package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Triangulo;

/**
 * 
 * @author Adrian
 *
 */
public class VTrianguloArea extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblado1 = new JLabel("Lado 1");
	private JTextField txtlado1 = new JTextField();
	private JLabel lblado2 = new JLabel("Lado 2");	
	private JTextField txtlado2 = new JTextField();
	private JButton btncalcular = new JButton("Calcular");
	private JLabel lbResult = new JLabel("Resultado");
	
	private Container c = getContentPane();
	Triangulo trian = new Triangulo();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VTrianguloArea() {
		super.setTitle("Triangulo Área");
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
		lblado1.setBounds(10,10,300,40);
		txtlado1.setBounds(10,40,300,40);
		lblado2.setBounds(10,70,300,40);
		txtlado2.setBounds(10,100,300,40);
		btncalcular.setBounds(10,220,300,40);
		lbResult.setBounds(10,250,300,40);
		
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
		
		if(e.getSource()==btncalcular) {
			
			double [] parameters = new double[3];
			parameters[0] = Double.parseDouble(txtlado1.getText());
			parameters[1] = Double.parseDouble(txtlado2.getText());
			
			lbResult.setText(String.format("%f", trian.area(parameters)));
		}
		
	}
	
}
