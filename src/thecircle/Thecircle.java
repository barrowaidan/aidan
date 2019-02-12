/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecircle;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Aidan
 */
public class Thecircle extends JFrame implements ActionListener{
    /**
     * @param args the command line arguments
     */
    JButton button = new JButton("submit"); 
    JTextField mytext = new JTextField(5);
    JTextArea myarea = new JTextArea(2,10);
    JLabel mylabel = new JLabel("Enter the radius of the circle");
    
    public Thecircle(){
    setLayout(new FlowLayout());
    setTitle("Area of the circle");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(mylabel);
    add(mytext);
    add(button);
    add(myarea);
    button.addActionListener(this);
    setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Thecircle circle = new Thecircle();
    }
    
   @Override
    public void actionPerformed(ActionEvent e){
        double radius = 0;
    if(e.getSource() == button){
        radius = Double.parseDouble(mytext.getText());
    }
    double area = Math.pow(radius, 2) * Math.PI;
    myarea.setText("The area of the circle when radius is "+ radius +" is " + area);
    }
}
