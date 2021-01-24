package Graficas.frames;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelGraficas extends JPanel
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
    
    public PanelGraficas(int[] y, int[] x, Color backColor, Color lineColor, int mode)
    {
        super();
        this.y = y;
        this.x = x;
        this.backColor = backColor;
        this.lineColor = lineColor;
        this.mode = mode;
        
        this.height = (findMaxValue(y) * 10) + 10;
        this.width = (findMaxValue(x) * 10) + 10;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(backColor);
        //this.setBounds(xP, yP, width, height);
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
    	int nX = this.x.length;
    	int nY = this.y.length;
    	int scale = findMaxValue(this.y);
    	int factorX = 150 / nX;
        int factorY = 150 / nY;
        
        int[] y = convertCoordinates(scale, this.y);
        int[] x = this.x;
        
        x = scaleArray(factorX, x);
        y = scaleArray(factorY, y); 

        g2d.setColor(lineColor);
        g2d.setStroke(new BasicStroke(2));
        
        try
        {
            g2d.drawPolyline(x, y, nX);
        }
        catch(Exception ex)
        {
            
        }
    }
    
    private void paintBarGraph(Graphics2D g2d)
    {
    	int nX = this.x.length;
    	int nY = findMaxValue(this.y);
        int scale = findMaxValue(this.y);
        int factorX = 150 / nX;
        int factorY = 150 / nY;
        
        int[] y = convertCoordinates(scale, this.y);
        int[] x = this.x;
        
        x = scaleArray(factorX, x);
        y = scaleArray(factorY, y);
        
        g2d.setColor(lineColor);
        
        for(int i = 0; i < x.length; i++)
        {
        	System.out.println(factorY);
        	//System.out.println(y[i]);
            g2d.fillRect(x[i], y[i], 8, 180);
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
    
    private int findMaxValue(int[] array)
    {
        int maxValue = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }
        
        return maxValue;
    }
}
