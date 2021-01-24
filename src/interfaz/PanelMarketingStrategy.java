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
import Graficas.main.Graph;


/**
 * Panel que contiene la informaci�n de un candidato.
 */
@SuppressWarnings("serial")
public class PanelMarketingStrategy extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------



    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n.
     */
    private InterfazPricipal principal;
    
    


    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------



    private JLabel lblGeneroPotencial;
    

    private JLabel lblEdadPotencial;
    

    private JLabel lblestadocivil;

  
    private JTextField txtGenero;
   

    private JTextField txtEdad;
    
 
    private JTextField txtEstado;
    
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param pPrincipal Ventana principal de la aplicaci�n. pPrincipal != null.
     */
    public PanelMarketingStrategy( InterfazPricipal pPrincipal )
    {
        principal = pPrincipal;
        
        
        JPanel panelInfo = new JPanel( );
        
        JPanel panelGraficos = new JPanel( );
        
        JPanel panelGraficoVentas = new JPanel( );
        JPanel panelGraficoGenero = new JPanel( );
        JPanel panelGraficoEdad = new JPanel( );
        JPanel panelGraficoEstadoCivil = new JPanel( );

        setLayout( new java.awt.BorderLayout( ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( "Formulario") );

        
        
        panelInfo.setLayout( new GridLayout(3,2) );


        add( panelInfo, BorderLayout.NORTH );
       
        lblGeneroPotencial = new JLabel("Genero Potencial:");
        lblGeneroPotencial.setHorizontalAlignment( JLabel.LEFT );
        
        lblEdadPotencial = new JLabel("Edad Potencial:");
        lblEdadPotencial.setHorizontalAlignment( JLabel.LEFT );
        
        lblestadocivil = new JLabel("Estado civil Potencial:");
        lblestadocivil.setHorizontalAlignment( JLabel.LEFT );
        
        txtGenero = new JTextField( );
        txtGenero.setEditable( false );
        txtGenero.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        
        txtEdad = new JTextField( );
        txtEdad.setEditable( false );
        txtEdad.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        
        txtEstado = new JTextField( );
        txtEstado.setEditable( false );
        txtEstado.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        
        panelInfo.add( lblGeneroPotencial );
        panelInfo.add( txtGenero );
        
        panelInfo.add( lblEdadPotencial );
        panelInfo.add( txtEdad );
        
        panelInfo.add( lblestadocivil );
        panelInfo.add( txtEstado );

        
        
        panelGraficos.setLayout( new GridLayout(2,2) );
        
        add( panelGraficos, BorderLayout.CENTER );

        JLabel temp = new JLabel( );
        temp.setHorizontalAlignment( JLabel.CENTER );
        temp.setIcon( new ImageIcon( "data/imagenes/list.png") );
        
     
        JLabel temp2 = new JLabel( );
        temp2.setHorizontalAlignment( JLabel.CENTER );
        temp2.setIcon( new ImageIcon( "data/imagenes/notificacion.png") );
        
        panelGraficoVentas.add(temp, BorderLayout.CENTER);
        panelGraficoEstadoCivil.add(temp2, BorderLayout.CENTER);
        
        panelGraficos.add( panelGraficoVentas);
        panelGraficos.add( panelGraficoGenero);
        panelGraficos.add( panelGraficoEdad);
        panelGraficos.add( panelGraficoEstadoCivil);
        
        

    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------



    /**
     * Manejo de eventos del usuario.
     * @param pEvento Evento de usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {


    }

}