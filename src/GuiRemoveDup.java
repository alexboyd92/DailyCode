package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GuiRemoveDup extends JFrame implements ActionListener {

    private JPanel panel1;

    private JButton closeButton;
    private JButton submitButton;
    private JPanel butonPannel;
    private JTextField input;
    private JLabel warning;

    GuiRemoveDup() {// Basic window setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Dupe Remover");
        this.add(panel1);
        warning.setVisible(false);
        this.pack();
        closeButton.addActionListener(this);
        submitButton.addActionListener(this);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {


            try {
                String[] x = input.getText().split(",");
                int[] toCheck = new int[x.length];
                int i = 0;
                for (String val : x) {
                    toCheck[i] = Integer.parseInt(val);
                    i++;}
                //sort because user input cannot be trusted
                Arrays.sort(toCheck);
                int index = RemoveDup.removeDuplicates(toCheck,toCheck.length);
                //cut off unneeded parts of the array
                    toCheck = Arrays.copyOf(toCheck,index);
                   new GuiResults("Here is the array without duplicates",Arrays.toString(toCheck));
                this.dispose();


            }catch(NumberFormatException nfe){
                    input.setText(null);
                    warning.setVisible(true);
//
                }
            }
            if (e.getSource() == closeButton) {
                this.dispose();
            }
        }
    }
