package graphics;

import javax.swing.*;

public class ShowColors {
    public static void main(String[]args){
        JFrame frame = new JFrame("Using Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,350);
        ColorJPanel colorjpanel = new ColorJPanel();
        frame.add(colorjpanel);
        frame.setVisible(true);
    }
}
