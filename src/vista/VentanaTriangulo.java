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
public class VentanaTriangulo extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblado1 = new JLabel("Lado 1");
	private JTextField txtlado1 = new JTextField();
	private JLabel lblado2 = new JLabel("Lado 2");	
	private JTextField txtlado2 = new JTextField();
	private JLabel lblado3 = new JLabel("Lado 3");	
	private JTextField txtlado3 = new JTextField();	
	private JButton btncalcular = new JButton("Calcular");
	private JLabel lbResult = new JLabel("Resultado");
	private Container c = getContentPane();
	
	Parametros p = new Parametros();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VentanaTriangulo() {
		setTitle("Triangulo");
		setSize(340, 480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
		lblado3.setBounds(10,130,300,40);
		txtlado3.setBounds(10,160,300,40);
		btncalcular.setBounds(10,220,300,40);
		lbResult.setBounds(10,250,300,40);
		
		c.add(lblado1);
		c.add(txtlado1);
		c.add(lblado2);
		c.add(txtlado2);
		c.add(lblado3);
		c.add(txtlado3);
		c.add(btncalcular);
		c.add(lbResult);
		
		btncalcular.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btncalcular){
			int result = p.areaTriangulo(
					Integer.parseInt(txtlado1.getText()),
					Integer.parseInt(txtlado2.getText()),
					Integer.parseInt(txtlado3.getText()));
			lbResult.setText(String.format("%d", result));
		}
		
	}
	
}
