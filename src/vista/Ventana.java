package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Adrian
 *
 */
public class Ventana extends JFrame implements ActionListener {
	
	/**
	 * Clave
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnCuadro = new JButton("Cuadrado");
	private JButton btnRectangulo = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triángulo");
	private JButton btnCirculo = new JButton("Círculo");
	
	Container c = getContentPane();
	
	VentanaCirculo vCirculo = new VentanaCirculo();
	VentanaCuadrado vCuadrado = new VentanaCuadrado();
	VentanaRectangulo vRectangulo = new VentanaRectangulo();
	VentanaTriangulo vTriangulo = new VentanaTriangulo();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public Ventana() {
		super.setTitle("Principal");
		super.setSize(340, 480);
		cargarControles();
	}

	/**
	 * Configuración de los controles UI
	 */
	private void cargarControles() {
		c.setLayout(null);
		btnCuadro.setBounds(10, 30, 300, 50);
		btnRectangulo.setBounds(10, 130, 300, 50);
		btnTriangulo.setBounds(10, 230, 300, 50);
		btnCirculo.setBounds(10, 330, 300, 50);

		c.add(btnCuadro);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
		c.add(btnCirculo);

		btnCuadro.addActionListener(this);
		btnRectangulo.addActionListener(this);
		btnTriangulo.addActionListener(this);
		btnCirculo.addActionListener(this);
	}

	/**
	 * Eventos
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnCuadro) {
			vCuadrado.setVisible(true);
			
		}else if (e.getSource()==btnRectangulo) {
			vRectangulo.setVisible(true);
			
		}else if (e.getSource()==btnTriangulo) {
			vTriangulo.setVisible(true);
			
		}else if(e.getSource()==btnCirculo){
			vCirculo.setVisible(true);
		}
		
	}
	
}