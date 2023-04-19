package gui;

import java.awt.Container;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import Operaciones.Persona;
import Operaciones.Procesos;

public class VentanaConsulta extends JDialog {

	private static final Window ScrollArea = null;
	private static Frame VentanaPrincipal;
	private static GraphicsConfiguration modal;
	private JTextArea textArea;
	private JScrollPane scrollArea;
	private Window lblConsultaEstudiante;
	private JTable table;



	
	public VentanaConsulta(VentanaPrincipal ventanaPrincipal, boolean modal, Hashtable<String, Persona> tablaPersona) {
		super(VentanaPrincipal);
		initialize();
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 11, -253, 147);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(23, 138, 233, -122);
		getContentPane().add(table);
		
		
		
		mostrarListaPersona(tablaPersona);
		
		
		
	}

	private void setLocationRelativeTo(Object object) {
		
	}

	private Container getContent() {
		return null;
	}

	private void initialize() {
		setSize(300,208);
		getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10,33,264,102);
		
		scrollArea = new JScrollPane();
		scrollArea.setBounds(10, 50, 264,102);
		scrollArea.setViewportView(textArea);
		getContentPane().add(ScrollArea);
		
		JLabel lblConsultaEstudiantes = new JLabel ("Consulta Estudiantes");
		lblConsultaEstudiante.setBounds(10,11,153,23);
		getContentPane().add(lblConsultaEstudiantes);
		
		
	}
	


private void mostrarListaPersona(Hashtable<String, Persona> tablaPersona) {
		
		String mensaje="";
		
		Enumeration<Persona> elemento=tablaPersona.elements();
		while(elemento.hasMoreElements()) {
			Persona persona =(Persona) elemento.nextElement();
			mensaje+="Documento: " +persona.getDocumento()+ "    Nombre"+ Persona.getNombre()+"\n";
			
		}
		textArea.setText(mensaje);
	}
}

