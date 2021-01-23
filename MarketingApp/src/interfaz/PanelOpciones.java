/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
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
     * Comando para las estad�sticas.
     */
    private static final String Menu = "Menu";


    /**
     * Comando para vaciar la urna.
     */
    private static final String Configuracion = "Configuracion";


    /**
     * Comando para la opci�n 1.
     */
    private static final String Info = "Info";


    /**
     * Comando para la opci�n 2.
     */
    private static final String Corona = "Corona";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n.
     */
    private InterfazPricipal principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n Estadisticas.
     */
    private JButton btnEstadisticas;

    /**
     * Bot�n VaciarUrna.
     */
    private JButton btnVaciarUrna;

    /**
     * Bot�n Opci�n 1.
     */
    private JButton btnOpcion1;

    /**
     * Bot�n Opci�n 2.
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param pPrincipal Ventana principal de la aplicaci�n.
     */
    public PanelOpciones( InterfazPricipal pPrincipal )
    {
    	
        principal = pPrincipal;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 4 ) );

        // Bot�n estad�sticas
        btnEstadisticas = new JButton( "Menu" );
        btnEstadisticas.setActionCommand( Menu );
        btnEstadisticas.addActionListener( this );
        add( btnEstadisticas );

        // Bot�n vaciar urna
        btnVaciarUrna = new JButton( "Configuracion" );
        btnVaciarUrna.setActionCommand( Configuracion );
        btnVaciarUrna.addActionListener( this );
        add( btnVaciarUrna );


        // Bot�n opci�n 1
        btnOpcion1 = new JButton( "Info" );
        btnOpcion1.setActionCommand( Info );
        btnOpcion1.addActionListener( this );
        add( btnOpcion1 );

        
        // Bot�n opci�n 2
        btnOpcion2 = new JButton( "Corona" );
        btnOpcion2.setActionCommand( Corona );
        btnOpcion2.addActionListener( this );
        add( btnOpcion2 );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones.
     * @param pEvento Acci�n que gener� el evento. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
    	

        
    }

}
