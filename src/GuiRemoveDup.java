package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiRemoveDup extends JFrame implements ActionListener {

    private JPanel panel1;
    private JButton closeButton;
    private JButton submitButton;
    private JPanel butonPannel;
    private JTextField input;
    GuiRemoveDup(){// Basic window setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Dupe Remover");
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submitButton){
            int[] toTest;
            try {
              
                this.dispose();

            } catch (NumberFormatException nfe) {
                input.setText(null);
                result.setText("Not an integer");
                result.setVisible(true);
                result.setForeground(Color.red);
            }
        }
        if(e.getSource()==closeButton){
            this.dispose();}
    }
}
