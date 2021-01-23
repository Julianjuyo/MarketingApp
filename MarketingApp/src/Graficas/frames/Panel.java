package Graficas.frames;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Panel extends JPanel
{
    public final static int LINEGRAPHMODE = 1;
    public final static int BARGRAPHMODE = 2;
    private int mode;
    private Color backColor;
    private Color lineColor;
    private int width;
    private int height;
    private int[] y;
    private int[] x;
    
    public Panel(int width, int height, int[] y, int[] x, Color backColor, Color lineColor, int mode)
    {
        super();
        this.width = width;
        this.height = height;
        this.y = y;
        this.x = x;
        this.backColor = backColor;
        this.lineColor = lineColor;
        this.mode = mode;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(backColor);
        this.setBounds(50, 50, width, height);
        Graphics2D g2d = (Graphics2D) g;

        try
        {
            switch (mode)
            {
                case LINEGRAPHMODE:
                    paintLineGraph(g2d);
                    break;

                case BARGRAPHMODE:
                    paintBarGraph(g2d);
                    break;

                default:
                    break;
            }
        }
        catch(Exception ex)
        {
            
        }
    }

    private void paintLineGraph(Graphics2D g2d)
    {
        int scale = height / 10;
        int factor = 10;
        
        int[] y = convertCoordinates(scale, this.y);
        int[] x = this.x;
        
        x = scaleArray(factor, x);
        y = scaleArray(factor, y);

        int n = this.x.length;
        
        g2d.setColor(lineColor);
        g2d.setStroke(new BasicStroke(2));
        
        try
        {
            g2d.drawPolyline(x, y, n);
        }
        catch(Exception ex)
        {
            
        }
    }
    
    private void paintBarGraph(Graphics2D g2d)
    {
        int scale = height / 10;
        int factor = 10;
        
        int[] y = convertCoordinates(scale, this.y);
        int[] x = this.x;
        
        x = scaleArray(factor, x);
        y = scaleArray(factor, y);
        
        g2d.setColor(lineColor);
        
        for(int i = 0; i < x.length; i++)
        {
            g2d.fillRect(x[i], y[i], 8, Math.abs(y[i] - height));
        }
    }
    
    private int[] convertCoordinates(int scale, int[] array)
    {
        int[] newY = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            newY[i] = Math.abs(scale - array[i]);
        }
        return newY;
    }

    private int[] scaleArray(int factor, int[] array)
    {
        int[] newA = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            newA[i] = factor * array[i];
        }
        return newA;
    }

    private void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
