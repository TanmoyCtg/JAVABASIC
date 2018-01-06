package gui;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JFrame {
    private JPanel buttonJPanel; // panel to hold buttons
    private JButton buttons[];

    public PanelFrame(){
        super("Panel Demo");

        buttons = new JButton[5]; // create buttons array
        buttonJPanel = new JPanel(); // set up panel
        // create and add button
        for (int count=0;count < buttons.length;count++){
             buttons[count] = new JButton("Button "+ (count+1));
            buttonJPanel.add(buttons[count]); // add all buttons to the panel
        }
        add(buttonJPanel, BorderLayout.SOUTH); // add panel to frame
    }
}
