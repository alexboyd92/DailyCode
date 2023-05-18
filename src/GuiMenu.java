package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GuiMenu extends JFrame implements ActionListener {

    JComboBox<String> box;
    JLabel instructions;
    JButton run;
    JLabel description;
    Options[] menuOptions;

    GuiMenu(Options[] menuOptions) {
        //set menu options to what is passed in
        this.menuOptions = menuOptions;
        // Tell it to end the program on closing the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set image icon
        ImageIcon logo = new ImageIcon("src/Logo3-BW.png");
        this.setIconImage(logo.getImage());

        // width and height of window
        this.setSize(600, 300);
        //set background color
        this.setBackground(Color.darkGray);
        // get the window out of the top left
        this.setLocationRelativeTo(null);

        //Create label to hold the description of what is selected set
        description = new JLabel();
        description.setText("Please make a selection");
        description.setHorizontalAlignment(JLabel.CENTER);
        description.setBackground(Color.LIGHT_GRAY);
        description.setOpaque(true);

        // Set up a combo box to allow selection of which function to run
        String[] options = {"Please select option"};
        box = new JComboBox<>(options);
        box.setBackground(Color.darkGray);
        box.setForeground(Color.BLACK);
        for (Options menuOption : menuOptions) {
            box.addItem(menuOption.getTitle());
        }
        box.addActionListener(this);

        // create a button with the text label "run"
        run = new JButton("Run");
        //disable the button by default
        run.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        run.setEnabled(false);
        // add an action listener so we can tell if its clicked
        run.addActionListener(this);

        // add all the components to the frame
        this.add(run, BorderLayout.SOUTH);
        this.add(box, BorderLayout.NORTH);

        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int currIndex = box.getSelectedIndex();
        // check if the action is caused by the selection box
        if (e.getSource() == box) {
            if (currIndex != 0) {
                description.setText("<HTML>" + this.menuOptions[currIndex - 1].getDescription());
                run.setEnabled(true);
                run.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            } else run.setEnabled(false);

        }
        // check if the button was pressed
        if (e.getSource() == run) {
            System.out.println(currIndex);
            switch (currIndex) {
                case 1 -> twoSum.twoSum();
                case 2 -> ParenthesesGenerator.getResult();
                case 3 -> AddTwoNumbers.getInput();
                case 4 -> PalindromeNumber.getinput();
                case 5 -> RemoveDup.getArray();
                default -> System.out.println("No choice matches selection");
            }
            this.dispose();

        }
    }
}

