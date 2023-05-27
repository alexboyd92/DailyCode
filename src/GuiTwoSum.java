package src;

import javax.swing.*;
import java.awt.*;
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

    GuiTwoSum() {
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
        submitButton.addActionListener(this);
        closeButton.addActionListener(this);

//
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean hasArray = false;
        boolean hasInt = false;
        error2.setVisible(false);
        error1.setVisible(false);
        int[] intArray = new int[0];
        int toFind = 0;
        if (e.getSource() == submitButton) {
            try {
                String[] strArray = textField1.getText().split(",");
                intArray = new int[strArray.length];
                for (int i = 0; i < strArray.length; i++) {
                    intArray[i] = Integer.parseInt(strArray[i]);
                    hasArray = true;
                }

            } catch (NumberFormatException nfe) {
                error1.setVisible(true);
                error1.setForeground(Color.red);
                error1.setText("Formating error please check the format");
                textField1.setText(null);
                hasArray = false;
            }
            try {
                toFind = Integer.parseInt(textField2.getText());
                hasInt = true;

            } catch (NumberFormatException nfe) {
                error2.setVisible(true);
                error2.setForeground(Color.red);
                error2.setText("Not an Integer");
                textField2.setText(null);
                hasInt = false;
            }
            if (hasInt && hasArray) {
                int[] result = twoSum.bruteForce(intArray, toFind);
                if (result.length == 2) {
                    String index1 = result[0] + 1 + " ";
                    String index2 = result[1] + 1 + " ";
                    new GuiResults("The numbers that add to " + toFind + " are at the indices",
                            index1 + "and " + index2);

                } else
                    new GuiResults("Was unable to find two numbers that add to " + toFind, "");
                this.dispose();}
        }
        if (e.getSource() == closeButton) {
            this.dispose();
        }
    }
}
