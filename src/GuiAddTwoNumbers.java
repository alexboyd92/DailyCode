package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
        this.setSize(650, 200);
        this.setLocationRelativeTo(null);
        this.add(inputPanel);
        instructionsOne.setText("Please insert an integer");
        instructionsTwo.setText("Put a second integer with the same number of digits");
        this.setVisible(true);
        errorOne.setForeground(Color.RED);
        errorTwo.setForeground(Color.RED);
        // add listeners to the buttons
        closeButton.addActionListener(this);
        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int inputOne=0;
        int inputTwo= 0;
        int finalResult=0;
        LinkList linkList1 = new LinkList();
        LinkList linkList2 = new LinkList();
        boolean hasNum1=false;
        boolean hasNum2=false;

        if(e.getSource()==closeButton){
            this.dispose();
        }
        if(e.getSource()==submitButton){
            try{
                inputOne= Integer.parseInt(textField1.getText());
                hasNum1=true;
                errorOne.setText("");

            }catch (NumberFormatException nfe){
                errorOne.setText("This is not an integer");
                textField1.setText(null);
                hasNum1=false;
            }
            try {
                inputTwo= Integer.parseInt(textField2.getText());
                hasNum2=true;
                errorTwo.setText("");
            }catch (NumberFormatException nfe){
                errorTwo.setText("This is not an integer");
                textField2.setText(null);

                hasNum2=false;
            }
            if(hasNum2&&hasNum1){
                // Check to see if the two numbers have the same amount of digits
                if(String.valueOf(inputOne).length()!=String.valueOf(inputTwo).length()){
                    errorOne.setText("The integers do not have the same number of digits");
                    errorOne.setVisible(true);
                }else {
                    linkList1 = AddTwoNumbers.insertNum(linkList1,inputOne);
                    linkList2= LinkList.insert(linkList2,inputTwo);
                   LinkList.LinkNode resultNode= AddTwoNumbers.addNums(linkList1.head,linkList2.head);
                    finalResult=AddTwoNumbers.decodeResult(resultNode);
                   new GuiResults("The numbers "+inputOne+" and "+inputTwo+" add to:",String.valueOf(finalResult));
                   this.dispose();

                }            }
        }

    }
}
