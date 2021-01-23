package Graficas.main;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.DefaultListModel;

public class Graph implements Serializable
{
    public final static int LINE_GRAPH_MODE = 1;
    public final static int BAR_GRAPH_MODE = 2;
    private int mode;
    private int width;
    private int height;
    private Color backColor;
    private Color lineColor;
    private DefaultListModel<Integer> xList;
    private DefaultListModel<Integer> yList;
    
    public Graph(int mode, int width, int height, Color backColor, Color lineColor, DefaultListModel<Integer> xList, DefaultListModel<Integer> yList)
    {
        this.mode = mode;
        this.width = width;
        this.height = height;
        this.backColor = backColor;
        this.lineColor = lineColor;
        this.xList = xList;
        this.yList = yList;
    }

    public int getMode() 
    {
        return mode;
    }

    public void setMode(int mode) 
    {
        this.mode = mode;
    }

    public int getWidth() 
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }

    public Color getBackColor() 
    {
        return backColor;
    }

    public void setBackColor(Color backColor)
    {
        this.backColor = backColor;
    }

    public Color getLineColor() 
    {
        return lineColor;
    }

    public void setLineColor(Color lineColor) 
    {
        this.lineColor = lineColor;
    }

    public DefaultListModel<Integer> getxList() 
    {
        return xList;
    }

    public void setxList(DefaultListModel<Integer> xList) 
    {
        this.xList = xList;
    }

    public DefaultListModel<Integer> getyList()
    {
        return yList;
    }

    public void setyList(DefaultListModel<Integer> yList) 
    {
        this.yList = yList;
    }
}
