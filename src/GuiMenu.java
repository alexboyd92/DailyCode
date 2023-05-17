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
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        String[] options = {"Please select option"};


        box = new JComboBox<>(options);

        for (Options menuOption : menuOptions) {
            box.addItem(menuOption.getTitle());
        }
        box.addActionListener(this);
        //Create label to hold the description of what is selected set it to right alignment
        description = new JLabel("<html>"+"""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                """+"/<html>");

        this.setBackground(Color.blue);
        this.setBackground(Color.DARK_GRAY);
        description.setBounds(0,20,500,250);
        description.setBackground(Color.LIGHT_GRAY);
        description.setOpaque(true);
        this.setLayout(null);
        box.setBounds(0,0,500,20);

        this.setSize(500,270);
        this.add(box);
        this.add(description);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int currIndex=box.getSelectedIndex();
        if(e.getSource()== box) {
           if(currIndex!=0){
               System.out.println(this.menuOptions[currIndex-1].getDescription());

           }

        }
    }
}
