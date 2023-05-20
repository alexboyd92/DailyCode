package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiParenthesesGenerator extends JFrame implements ActionListener {
    private JButton run;
    private JLabel instructions;
    private JLabel inputPanel;
    private JLabel result;
    private JTextField input;
    private JButton close;

    public GuiParenthesesGenerator() {
        //Create a jframe, so we have some place to put things

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setSize(600, 250);
        this.setLocationRelativeTo(null);

        //Create a panel for the input text field and instructions

        inputPanel = new JLabel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Create a jlable for instructions
        instructions = new JLabel();
        instructions.setText("Enter Number of pairs of parentheses");

        // Create a text field, so we can get input from user
        input = new JTextField();
        input.setPreferredSize(new Dimension(250, 20));


        //Create a text box, so we can show the output/ warnings
        result = new JLabel();
        result.setVisible(false);
        //Create a run button
        run = new JButton("Submit");
        run.addActionListener(this);

        // create a button to replace run to close the program
        close = new JButton("Close");
        close.addActionListener(this);
        close.setVisible(false);


        // add things to the input panel
        inputPanel.add(instructions);
        inputPanel.add(input);
        inputPanel.add(result);
        inputPanel.add(close);
        run.setVisible(true);
        // add panels to the frame
        this.add(inputPanel, BorderLayout.CENTER);
        this.add(run, BorderLayout.SOUTH);
        // this.add(close,BorderLayout.SOUTH);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (run == e.getSource()) {
            try {
                int n = Integer.parseInt(input.getText());
                result.setText(ParenthesesGenerator.getResult(n));
                result.setForeground(Color.BLACK);
                result.setVisible(true);
                run.setVisible(false);
                close.setVisible(true);
                input.setVisible(false);
                instructions.setVisible(false);


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
