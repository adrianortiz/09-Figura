package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
	
	private JLabel lbCuadro = new JLabel("Cuadrado: ");
	private JButton btnCuadroArea = new JButton("Área");
	private JButton btnCuadroPerimetro = new JButton("Perímetro");
	
	private JLabel lbRectangulo = new JLabel("Rectangulo: ");
	private JButton btnRectanguloArea = new JButton("Área");
	private JButton btnRectanguloPerimetro = new JButton("Perímetro");
	
	private JLabel lbTriangulo = new JLabel("Triángulo: ");
	private JButton btnTrianguloArea = new JButton("Área");
	private JButton btnTrianguloPerimetro = new JButton("Perímetro");
	
	private JLabel lbCirculo = new JLabel("Círculo: ");
	private JButton btnCirculoArea = new JButton("Área");
	private JButton btnCirculoPerimetro = new JButton("Perímetro");
	
	Container c = getContentPane();
	
	VCuadradoArea vCuadradoArea = new VCuadradoArea();
	VCuadradoPerimetro vCuadradoPerimetro = new VCuadradoPerimetro();
	
	VRectanguloArea vRectanguloArea = new VRectanguloArea();
	VRectanguloPerimetro vRectanguloPerimetro = new VRectanguloPerimetro();
	
	VTrianguloArea vTrianguloArea = new VTrianguloArea();
	VTrianguloPerimetro vTrianguloPerimetro = new VTrianguloPerimetro();
	
	VCirculoArea vCirculoArea = new VCirculoArea();
	VCirculoPerimetro vCirculoPerimetro = new VCirculoPerimetro();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public Ventana() {
		
		super.setTitle("09-Figuras");
		super.setSize(320, 400);
		
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		cargarControles();
	}

	/**
	 * Configuración de los controles UI
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbCuadro.setBounds(20, 10, 300, 50);
		btnCuadroArea.setBounds(10, 50, 150, 30);
		btnCuadroPerimetro.setBounds(160, 50, 150, 30);
		
		lbRectangulo.setBounds(20, 80, 300, 50);
		btnRectanguloArea.setBounds(10, 120, 150, 30);
		btnRectanguloPerimetro.setBounds(160, 120, 150, 30);
		
		lbTriangulo.setBounds(20, 150, 300, 50);
		btnTrianguloArea.setBounds(10, 190, 150, 30);
		btnTrianguloPerimetro.setBounds(160, 190, 150, 30);
		
		lbCirculo.setBounds(20, 230, 300, 50);
		btnCirculoArea.setBounds(10, 270, 150, 30);
		btnCirculoPerimetro.setBounds(160, 270, 150, 30);

		c.add(lbCuadro);
		c.add(btnCuadroArea);
		c.add(btnCuadroPerimetro);
		
		c.add(lbRectangulo);
		c.add(btnRectanguloArea);
		c.add(btnRectanguloPerimetro);
		
		c.add(lbTriangulo);
		c.add(btnTrianguloArea);
		c.add(btnTrianguloPerimetro);
		
		c.add(lbCirculo);
		c.add(btnCirculoArea);
		c.add(btnCirculoPerimetro);


		btnCuadroArea.addActionListener(this);
		btnCuadroPerimetro.addActionListener(this);
		
		btnRectanguloArea.addActionListener(this);
		btnRectanguloPerimetro.addActionListener(this);
		
		btnTrianguloArea.addActionListener(this);
		btnTrianguloPerimetro.addActionListener(this);
		
		btnCirculoArea.addActionListener(this);
		btnCirculoPerimetro.addActionListener(this);
	}

	/**
	 * Eventos
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnCuadroArea) {
			vCuadradoArea.setVisible(true);
			
		}else if (e.getSource() == btnCuadroPerimetro) {
			vCuadradoPerimetro.setVisible(true);
			
		}else if (e.getSource() == btnRectanguloArea) {
			vRectanguloArea.setVisible(true);
			
		}else if (e.getSource() == btnRectanguloPerimetro) {
			vRectanguloPerimetro.setVisible(true);
			
		}else if (e.getSource() == btnTrianguloArea) {
			vTrianguloArea.setVisible(true);
			
		}else if (e.getSource() == btnTrianguloPerimetro) {
			vTrianguloPerimetro.setVisible(true);
			
		}else if(e.getSource() == btnCirculoArea){
			vCirculoArea.setVisible(true);
			
		}else if(e.getSource() == btnCirculoPerimetro){
			vCirculoPerimetro.setVisible(true);
		}
		
	}
	
}