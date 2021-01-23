/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_elecciones
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

   

/**
 * Ventana principal de la aplicación.
 */
@SuppressWarnings("serial")
public class InterfazPricipal extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------



    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con la imagen.
     */
    private PanelImagen panelImagen;

    /**
     * Panel del marketingStrategy.
     */
    private PanelMarketingStrategy marketingStrategy;

    /**
     * Panel del Notificaciones.
     */
    private PanelNotificaciones Notificaciones;


    /**
     * Panel con las opciones.
     */
    private PanelOpciones panelOpciones;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye la ventana principal de la aplicación y sus paneles.
     */
    public InterfazPricipal( )
    {
        setTitle( "marketing App " );
        setSize( 700, 650 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );


        setLayout( new BorderLayout( ) );

        panelImagen = new PanelImagen( );
        getContentPane( ).add( panelImagen, BorderLayout.NORTH );

        JPanel panelCandidatos = new JPanel( );
        panelCandidatos.setLayout( new GridLayout( 1, 2 ) );
        getContentPane( ).add( panelCandidatos, BorderLayout.CENTER );
        
        marketingStrategy = new PanelMarketingStrategy( this);
        panelCandidatos.add( marketingStrategy );
        
        Notificaciones = new PanelNotificaciones( this);
        panelCandidatos.add( Notificaciones );
        

        panelOpciones = new PanelOpciones( this );
        getContentPane( ).add( panelOpciones, BorderLayout.SOUTH );

        setLocationRelativeTo( null );
        setResizable( false );

   
    }


    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    
    /**
     * Ejecuta la aplicación.
     * @param pArgs Parámetros de la ejecución. No son necesarios.
     */
    public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            InterfazPricipal interfaz = new InterfazPricipal( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }

}