package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mundo.RutasSistemasOperativos;

@SuppressWarnings("serial")
public class InterfazInicio extends JFrame
{
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------



    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

	private JPanel panelPrincipal;
	
	// Boton
	private JButton botonGuardar;
	
	// ComboBox
    private JComboBox<String> comboBoxTipoNegocio;
    private JComboBox<String> comboBoxProductos;
    private JComboBox<String> comboBoxObjetivosMarketing;
    private JComboBox<String> comboBoxDuracionEstrategia;
    private JComboBox<String> comboBoxDemograficosGenero;
    private JComboBox<String> comboBoxDemograficosEdad;
    private JComboBox<String> comboBoxDemograficosEducacion;
    private JComboBox<String> comboBoxDemograficosLenguaje;
    
    // Etiquetas
    private JLabel etiquetaTipoNegocio;
    private JLabel etiquetaProductos;
    private JLabel etiquetaObjetivosMarketing;
    private JLabel etiquetaDuracionEstrategia;
    private JLabel etiquetaDemograficos;
    private JLabel etiquetaDemograficosGenero;
    private JLabel etiquetaDemograficosEdad;
    private JLabel etiquetaDemograficosEducacion;
    private JLabel etiquetaDemograficosLenguaje;
    
    // ComboBox contenidos
    private String tipoNegocios[] = {"", "Restaurante", "Gimnasio", "Cafe", "Inmobiliario", "Tienda de ropa"};
    private String objetivosMarketing[] = {"", "Promover nuevos productos", "Fidelizar clientes", "Captar nuevos clientes", "Reconocimineto de la marca"};
    private String duracionEstrategia[] = {"2 semanas", "3 semanas", "4 semanas"};
    private String demograficoGenero[] = {"Hombre", "Mujer"};
    private String demograficoEdad[] = {"18-24", "25-34", "35-44", "45-54", "55-64"};
    private String demograficoEducacion[] = {"Educacion basica", "Educacion media", "Educacion superior"};
    private String demograficoLenguaje[] = {"Español", "Ingles", "Chino"};
    
    private Vector<String> opcion0 = new Vector<String>();
    private Vector<String> opcion1 = new Vector<String>();
    private Vector<String> opcion2 = new Vector<String>();
    private Vector<String> opcion3 = new Vector<String>();
    private Vector<String> opcion4 = new Vector<String>();
    private Vector<String> opcion5 = new Vector<String>();
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    
    /**
     * Construye la ventana principal de la aplicación y sus paneles.
     */
    public InterfazInicio()
    {	
        setTitle( "Marketing App " );
        setSize( 550, 650 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        opcion0.add("");
        
        opcion1.add("Comida rapida");
        opcion1.add("Comida italiana");
        opcion1.add("Comida mexicana");
        
        opcion2.add("Suscripcion mensual");
        opcion2.add("Clases extras");
        
        opcion3.add("Bebidas calientes y frias");
        
        opcion4.add("Venta de edificios");
        
        opcion5.add("Ropa moderna");
        opcion5.add("Conservadora");
        
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        getContentPane().add(panelPrincipal);
        
        // Tipo negocio
        comboBoxTipoNegocio = new JComboBox<String>(tipoNegocios);
        comboBoxTipoNegocio.setBounds(300, 50, 150, 25);
        panelPrincipal.add(comboBoxTipoNegocio);
        
        // Tipo negocio
        etiquetaTipoNegocio = new JLabel("¿Que tipo de negocio tienes?: ");
        etiquetaTipoNegocio.setBounds(50, 35, 200, 50);
        panelPrincipal.add(etiquetaTipoNegocio);
        
        // Productos
        comboBoxProductos = new JComboBox<String>();
		comboBoxProductos.setBounds(300, 100, 150, 25);
        panelPrincipal.add(comboBoxProductos);
        
        // Productos
        etiquetaProductos = new JLabel("¿Que productos o servicios vendes?: ");
        etiquetaProductos.setBounds(10, 85, 250, 50);
        panelPrincipal.add(etiquetaProductos);
        
        // Objetivos Marketing
        comboBoxObjetivosMarketing = new JComboBox<String>(objetivosMarketing);
        comboBoxObjetivosMarketing.setBounds(300, 150, 150, 25);
        panelPrincipal.add(comboBoxObjetivosMarketing);
        
        // Objetivos Marketing
        etiquetaObjetivosMarketing = new JLabel("¿Cuales son tus objetivos de marketing?: ");
        etiquetaObjetivosMarketing.setBounds(10, 135, 250, 50);
        panelPrincipal.add(etiquetaObjetivosMarketing);
        
        // Duracion estrategia
        comboBoxDuracionEstrategia = new JComboBox<String>(duracionEstrategia);
        comboBoxDuracionEstrategia.setBounds(300, 200, 150, 25);
        panelPrincipal.add(comboBoxDuracionEstrategia);
        
        // Duracion estrategia
        etiquetaDuracionEstrategia = new JLabel("Duracion de la estrategia: ");
        etiquetaDuracionEstrategia.setBounds(50, 185, 200, 50);
        panelPrincipal.add(etiquetaDuracionEstrategia);
        
        // Demograficos
        etiquetaDemograficos = new JLabel("Demograficos: ");
        etiquetaDemograficos.setBounds(50, 235, 200, 50);
        panelPrincipal.add(etiquetaDemograficos);
        
        // Genero
        comboBoxDemograficosGenero = new JComboBox<String>(demograficoGenero);
        comboBoxDemograficosGenero.setBounds(300, 300, 150, 25);
        panelPrincipal.add(comboBoxDemograficosGenero);
        
        // Genero
        etiquetaDemograficosGenero = new JLabel("Genero: ");
        etiquetaDemograficosGenero.setBounds(50, 285, 200, 50);
        panelPrincipal.add(etiquetaDemograficosGenero);
        
        // Edad
        comboBoxDemograficosEdad = new JComboBox<String>(demograficoEdad);
        comboBoxDemograficosEdad.setBounds(300, 350, 150, 25);
        panelPrincipal.add(comboBoxDemograficosEdad);
        
        // Edad
        etiquetaDemograficosEdad = new JLabel("Edad: ");
        etiquetaDemograficosEdad.setBounds(50, 335, 200, 50);
        panelPrincipal.add(etiquetaDemograficosEdad);
        
        // Educacion
        comboBoxDemograficosEducacion = new JComboBox<String>(demograficoEducacion);
        comboBoxDemograficosEducacion.setBounds(300, 400, 150, 25);
        panelPrincipal.add(comboBoxDemograficosEducacion);
        
        // Educacion
        etiquetaDemograficosEducacion = new JLabel("Educacion: ");
        etiquetaDemograficosEducacion.setBounds(50, 385, 200, 50);
        panelPrincipal.add(etiquetaDemograficosEducacion);
        
        // Lenguaje
        comboBoxDemograficosLenguaje = new JComboBox<String>(demograficoLenguaje);
        comboBoxDemograficosLenguaje.setBounds(300, 450, 150, 25);
        panelPrincipal.add(comboBoxDemograficosLenguaje);
        
    	// Lenguaje
        etiquetaDemograficosLenguaje = new JLabel("Lenguaje: ");
        etiquetaDemograficosLenguaje.setBounds(50, 435, 200, 50);
        panelPrincipal.add(etiquetaDemograficosLenguaje);
        
        botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(150, 550, 200, 50);
        panelPrincipal.add(botonGuardar);
        
        setLocationRelativeTo( null );
        setResizable( false );
        
        //Eventos
        
        // ActionListener para el combobox
    	comboBoxTipoNegocio.addActionListener(new ActionListener() 
    	{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Vector<String> opcionFinal = new Vector<String>();
				
				if(comboBoxTipoNegocio.getSelectedItem().equals(""))
				{
					opcionFinal = opcion0;
				}
				else if(comboBoxTipoNegocio.getSelectedItem().equals("Restaurante"))
				{
					opcionFinal = opcion1;
				}
				else if(comboBoxTipoNegocio.getSelectedItem().equals("Gimnasio"))
				{
					opcionFinal = opcion2;
				}
				else if(comboBoxTipoNegocio.getSelectedItem().equals("Cafe"))
				{
					opcionFinal = opcion3;
				}
				else if(comboBoxTipoNegocio.getSelectedItem().equals("Inmobiliario"))
				{
					opcionFinal = opcion4;
				}
				else if(comboBoxTipoNegocio.getSelectedItem().equals("Tienda de ropa"))
				{
					opcionFinal = opcion5;
				}
				
				DefaultComboBoxModel<String> modeloComboProductos = new <String>DefaultComboBoxModel(opcionFinal);
				comboBoxProductos.setModel(modeloComboProductos);
			}
		});
    	
    	botonGuardar.addActionListener(new ActionListener() 
    	{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
			        
			        File marketingFolder = new File(RutasSistemasOperativos.MAIN_FOLDER_PATH);
			        
			        marketingFolder.mkdir();
					
					File archivo = new File(RutasSistemasOperativos.FIRST_FILE_PATH);
					FileWriter objWrite = new FileWriter(archivo);
					
					objWrite.write(comboBoxTipoNegocio.getSelectedItem() + "%" + comboBoxProductos.getSelectedItem() +
							"%" + comboBoxObjetivosMarketing.getSelectedItem() + "%" + comboBoxDuracionEstrategia.getSelectedItem() +
							"%" + comboBoxDemograficosGenero.getSelectedItem() + "%" + comboBoxDemograficosEdad.getSelectedItem() +
							"%" + comboBoxDemograficosEducacion.getSelectedItem() + "%" + comboBoxDemograficosLenguaje.getSelectedItem());
				
					objWrite.close();
					
					InterfazPricipal interfaz = new InterfazPricipal();
	                interfaz.setVisible(true);
	                
	                dispose();
				}
				catch(Exception ex)
				{
					System.err.println(ex);
				}
			}
		});
    }
}
