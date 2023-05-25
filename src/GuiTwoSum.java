package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTwoSum extends JFrame implements ActionListener {
    private JButton closeButton;
    private JButton submitButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel error1;
    private JLabel error2;
    private JLabel instructions2;
    private JLabel instructions1;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel instructionPanel;

    GuiTwoSum (){
//        // basic window setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Palindrome Checker");
        instructions1.setText("Please enter array to search seperated by , EX 1,2,3");
        instructions2.setText("Please enter an interger");
        this.setSize(600, 300);
        this.setVisible(true);

//
//        // add panel
        this.add(inputPanel);
        closeButton.addActionListener(this);
        submitButton.addActionListener(this);
//
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==closeButton){
            this.dispose();
        }
    }
}
