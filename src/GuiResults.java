package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiResults extends JFrame implements ActionListener {
    private JPanel resultPanel;
    private JButton closeButton;
   private JPanel result1;
    private JTextPane answer;

    private JLabel question;
    private JScrollPane scrollText;

    public GuiResults(String question, String answer) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setIconImage(new ImageIcon("src/Logo3-BW.png").getImage());
    this.setSize(600, 250);
    this.setLocationRelativeTo(null);
    this.question.setText(question);
   this.answer.setText(answer);
   this.answer.setFocusable(false);
    this.add(resultPanel);
    closeButton.addActionListener(this);
    this.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(closeButton==e.getSource()){
            this.dispose();
        }
    }
}
