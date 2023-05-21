package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiParenthesesGenerator extends JFrame implements ActionListener {
    private JButton run;
    private JLabel instructions;
    private JLabel result;
    private JTextField input;
    private JPanel inputPanel;
    private JButton close;
    private JPanel buttonPanel;
    private JPanel panel;

    public GuiParenthesesGenerator() {
        this.setTitle("Parenthesis Generator");

        //Create a jframe, so we have some place to put things

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setSize(600, 250);
        this.setLocationRelativeTo(null);


        this.add(panel);


        close.addActionListener(this);
        run.addActionListener(this);
        this.setVisible(true);
//
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (run == e.getSource()) {
            try {
                int n = Integer.parseInt(input.getText());
                new GuiResults("Here are all the well-formed options for " + n +
                        " pairs of parentheses", ParenthesesGenerator.getResult(n));
                this.dispose();

            } catch (NumberFormatException nfe) {
                input.setText(null);
                result.setText("Not an integer");
                result.setVisible(true);
                result.setForeground(Color.red);
            }
        }
        if (e.getSource() == close) {
            this.dispose();
        }

    }
}
