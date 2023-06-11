package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static src.MergeLinked.fillArray;

public class GUIMergeSortedLink extends JFrame implements ActionListener {
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JButton submitButton;
    private JButton closeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel instOne;
    private JLabel instTwo;
    private JLabel errTwo;
    private JLabel errOne;

    GUIMergeSortedLink() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
        this.setSize(650, 200);
        this.setLocationRelativeTo(null);
        this.add(inputPanel);
        this.setTitle("Merged Sorted linked list");
        errOne.setForeground(Color.RED);
        errTwo.setForeground(Color.RED);
        instOne.setText("  Input first array as a comma sorted list EX 1,2,3");
        instTwo.setText("  Input second array as comma sorted list EX 1,2,3");
        submitButton.addActionListener(this);
        closeButton.addActionListener(this);
        this.setVisible(true);
        this.setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == closeButton) {
            this.dispose();

        }
        if (e.getSource() == submitButton) {
            String dirtyInput;
            String[] splitInput;
            int[] arrayOne;
            int[] arrayTwo;
            boolean passed = false;
            LinkList listOne = new LinkList();
            LinkList listTwo = new LinkList();

            arrayOne = null;
            try {
                dirtyInput = textField1.getText();
                splitInput = dirtyInput.split(",");

                arrayOne = fillArray(splitInput);
                Arrays.sort(arrayOne);
                if (arrayOne != null) {
                    errOne.setVisible(false);
                    passed = true;

                    dirtyInput = textField2.getText();
                    splitInput = dirtyInput.split(",");
                    arrayTwo = fillArray(splitInput);
                    Arrays.sort(arrayTwo);
                    if (arrayTwo != null) {
                        errTwo.setVisible(false);
                        LinkList.fillList(listOne, arrayOne);
                        LinkList.fillList(listTwo, arrayTwo);
                        listTwo.head = MergeLinked.merge(listOne.head, listTwo.head);
                        new GuiResults("The resulting linked list is:",listTwo.toString());
                        this.dispose();

                    }

                }
            } catch (NumberFormatException nfe) {
                if (passed) {
                    textField2.setText("");
                    errTwo.setText("Not a valid array");
                } else
                    textField1.setText("");
                errOne.setText("Not a valid array ");
            }

        }
    }
}







