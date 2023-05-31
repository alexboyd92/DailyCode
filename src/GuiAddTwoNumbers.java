package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAddTwoNumbers extends JFrame implements ActionListener {
    private JPanel inputPanel;
    private JButton submitButton;
    private JButton closeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel errorTwo;
    private JLabel instructionsOne;
    private JLabel instructionsTwo;
    private JPanel buttonPanel;
    private JLabel errorOne;
    GuiAddTwoNumbers(){
        // basic window setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.add(inputPanel);
        instructionsOne.setText("Please insert an integer");
        instructionsTwo.setText("Put a second integer with the same number of digits");
        this.setVisible(true);

        // add listeners to the buttons
        closeButton.addActionListener(this);
        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int inputOne;
        int inputTwo;
        boolean hasNum1=false;
        boolean hasNum2=false;

        if(e.getSource()==closeButton){
            this.dispose();
        }
        if(e.getSource()==submitButton){
            try{
                inputOne= Integer.parseInt(textField1.getText());

            }catch (NumberFormatException nfe){
                errorOne.setText("This is not an integer");
                textField1.setText(null);
            }
            try {
                inputTwo= Integer.parseInt(textField2.getText());
            }catch (NumberFormatException nfe){
                errorTwo.setText("This is not an integer");
                textField2.setText(null);
            }
        }

    }
}
