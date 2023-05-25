package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLongestPalindrome extends JFrame implements ActionListener {
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JButton sumbitButton;
    private JButton closeButton;
    private JPanel instructionPanel;
    private JTextField lpInput;
    private JLabel lpInstructions;

    public GuiLongestPalindrome(){
        // basic window setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);


        // add instructions
        this.setTitle("Palindrome Checker");
        lpInstructions.setText("Provide a string to check for palindromes");

        // add panel

        closeButton.addActionListener(this);
        sumbitButton.addActionListener(this);

        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==closeButton)
                this.dispose();
        if(e.getSource()==sumbitButton){
           String result =LongestPalindrome.findLongestPalindrome(lpInput.getText());
           new GuiResults("The longest palidromic substring of \""+lpInput.getText()+"\" is:",result);
        }
    }

}
