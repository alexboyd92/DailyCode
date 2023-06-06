package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    GUIMergeSortedLink(){
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
        if(e.getSource()==closeButton){
            this.dispose();
        }
        if(e.getSource()==submitButton){
            this.dispose();
        }

    }
}
