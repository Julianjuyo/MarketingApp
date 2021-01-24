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

import Graficas.frames.PanelGraficas;


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
        
        PanelGraficas panelGraficoVentas = new PanelGraficas(new int[]{0, 10, 6, 5, 2, 1, 0, 10}, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, Color.gray, Color.black, PanelGraficas.LINEGRAPHMODE);
        PanelGraficas panelGraficoGenero = new PanelGraficas(new int[]{7, 3}, new int[]{0, 1}, Color.yellow, Color.red, PanelGraficas.BARGRAPHMODE);
        PanelGraficas panelGraficoEdad = new PanelGraficas(new int[]{17, 20, 19, 22, 21, 22, 20, 18, 19, 20, 22, 20, 17, 22, 25, 18, 20}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, Color.red, Color.blue, PanelGraficas.LINEGRAPHMODE);
        PanelGraficas panelGraficoEstadoCivil = new PanelGraficas(new int[]{6, 1, 3}, new int[]{0, 1, 2}, Color.pink, Color.orange, PanelGraficas.BARGRAPHMODE);

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