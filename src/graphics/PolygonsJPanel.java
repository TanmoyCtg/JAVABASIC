package graphics;

import javax.swing.*;
import java.awt.*;

public class PolygonsJPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        //draw polygon with polygons object
        int xValues[] = {20,40,50,30,20,15};
        int yValues[]={50,50,60,80,80,60};
        Polygon polygon1 = new Polygon(xValues,yValues,6);
        g.drawPolygon(polygon1);

        //draw polylines with two arrays
        int xValues1[] = {70,90,100,80,70,65,60};
        int yValues1[] ={100,100,110,110,130,110,90};
        g.drawPolyline(xValues1,yValues1,7);

        // fill polygon with two arrays
        int xValues2[] = {120,140,150,190};
        int yValues2[] ={40,70,80,60};
        g.fillPolygon(xValues2,yValues2,4);
    }
}
