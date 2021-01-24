package Graficas.frames;

import java.awt.Color;
import javax.swing.JFrame;

public class LineGraphViewFrame extends JFrame
{
    public LineGraphViewFrame(int panelWidth, int panelHeight, int[] y, int[] x, Color backColor, Color lineColor)
    {
        int width = 0, height = 0;
        if((findMaxValue(x) * 10) > panelWidth)
        {
            width = findMaxValue(x) * 10;
        }
        else
        {
            width = panelWidth;
        }
        
        if((findMaxValue(y) * 10) > panelHeight)
        {
            height = findMaxValue(y) * 10;
        }
        else
        {
            height = panelHeight;
        }
        
        this.setSize(width + 100, height + 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        add(new Panel(width, height, y, x, backColor, lineColor, Panel.LINEGRAPHMODE));    
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
