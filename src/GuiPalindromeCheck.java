package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPalindromeCheck extends JFrame implements ActionListener {

    private JPanel buttonPanel;
    private JButton runButton;
    private JButton closeButton;
    private JLabel instructions;
    private JTextField input;
    private JLabel result;
    private JPanel inputPanel;
    private JPanel panel;

    GuiPalindromeCheck(){
        // Basic window setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Palindrome Checker");
        this.add(panel);
        closeButton.addActionListener(this);
        runButton.addActionListener(this);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==runButton){
            try {
                int n = Integer.parseInt(input.getText());
                new GuiResults("The number " + n+":"
                        , PalindromeNumber.isPalindrome(n)?"Is a palindrome":"Is not a palindrome" );
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
