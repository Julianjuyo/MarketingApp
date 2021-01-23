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

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel de manejo de opciones.
 */
@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------


    /**
     * Comando para las estadísticas.
     */
    private static final String Menu = "Menu";


    /**
     * Comando para vaciar la urna.
     */
    private static final String Configuracion = "Configuracion";


    /**
     * Comando para la opción 1.
     */
    private static final String Info = "Info";


    /**
     * Comando para la opción 2.
     */
    private static final String Corona = "Corona";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación.
     */
    private InterfazPricipal principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Botón Estadisticas.
     */
    private JButton btnEstadisticas;

    /**
     * Botón VaciarUrna.
     */
    private JButton btnVaciarUrna;

    /**
     * Botón Opción 1.
     */
    private JButton btnOpcion1;

    /**
     * Botón Opción 2.
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param pPrincipal Ventana principal de la aplicación.
     */
    public PanelOpciones( InterfazPricipal pPrincipal )
    {
    	
        principal = pPrincipal;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 4 ) );

        // Botón estadísticas
        btnEstadisticas = new JButton( "Menu" );
        btnEstadisticas.setActionCommand( Menu );
        btnEstadisticas.addActionListener( this );
        add( btnEstadisticas );

        // Botón vaciar urna
        btnVaciarUrna = new JButton( "Configuracion" );
        btnVaciarUrna.setActionCommand( Configuracion );
        btnVaciarUrna.addActionListener( this );
        add( btnVaciarUrna );


        // Botón opción 1
        btnOpcion1 = new JButton( "Info" );
        btnOpcion1.setActionCommand( Info );
        btnOpcion1.addActionListener( this );
        add( btnOpcion1 );

        
        // Botón opción 2
        btnOpcion2 = new JButton( "Corona" );
        btnOpcion2.setActionCommand( Corona );
        btnOpcion2.addActionListener( this );
        add( btnOpcion2 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones.
     * @param pEvento Acción que generó el evento. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
    	

        
    }

}
