package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuiMenu extends JFrame implements ActionListener{

    JComboBox<String> box;
    JLabel description;
    Options[] menuOptions;

    GuiMenu(Options[] menuOptions){
        this.menuOptions=menuOptions;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        String[] options = {"Please select option"};
        this.setResizable(false);
        // width and height of window
        this.setSize(500,270);
        this.setBackground(Color.darkGray);
        box = new JComboBox<>(options);

        for (Options menuOption : menuOptions) {
            box.addItem(menuOption.getTitle());
        }
        box.addActionListener(this);
        //Create label to hold the description of what is selected set
        description = new JLabel();
        description.setText("Please make a selection");
        this.setBackground(Color.DARK_GRAY);
        description.setBounds(0,20,475,300);
        description.setBackground(Color.LIGHT_GRAY);
        description.setOpaque(true);
        box.setBounds(0,0,490,20);
        box.setBackground(Color.darkGray);
        box.setForeground(Color.BLACK);

        this.add(box);
        this.add(description);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int currIndex=box.getSelectedIndex();
        if(e.getSource()== box) {
           if(currIndex!=0){
               description.setText("<HTML>"+this.menuOptions[currIndex-1].getDescription());

           }

        }
    }
}
