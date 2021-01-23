
package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel que contiene la información de las notificaciones.
 */
@SuppressWarnings("serial")
public class PanelNotificaciones extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------



    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación.
     */
    private InterfazPricipal principal;



    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

   
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param pPrincipal Ventana principal de la aplicación. pPrincipal != null.
     */
    public PanelNotificaciones( InterfazPricipal pPrincipal)
    {
        principal = pPrincipal;
       

        JPanel panelImagen = new JPanel( );
        JPanel panelInformacionGlobal = new JPanel( );
        JPanel panelInformacionDatos = new JPanel( );
        JPanel panelInformacionBotones = new JPanel( );

        setLayout( new java.awt.BorderLayout( ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( "Notificaciones") );

        panelImagen.setLayout( new BorderLayout( ) );

        JLabel temp = new JLabel( );
        temp.setHorizontalAlignment( JLabel.CENTER );
        temp.setIcon( new ImageIcon( "data/imagenes/notificacion.png") );

        panelImagen.add( temp, BorderLayout.CENTER );

        add( panelImagen, BorderLayout.CENTER );

        panelInformacionGlobal.setLayout( new BorderLayout( ) );
        panelInformacionDatos.setLayout( new GridLayout( 6, 2 ) );
        panelInformacionBotones.setLayout( new GridLayout( 2, 1 ) );

       
        panelInformacionGlobal.add( panelInformacionDatos, BorderLayout.CENTER );
        panelInformacionGlobal.add( panelInformacionBotones, BorderLayout.SOUTH );

        add( panelInformacionGlobal, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------



    /**
     * Manejo de eventos del usuario.
     * @param pEvento Evento de usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {


    }
}