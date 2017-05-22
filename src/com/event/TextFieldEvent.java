package com.event;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by Lenovo on 22.5.2017 г..
 */
public class TextFieldEvent {

    JFrame frame = new JFrame("JTextField demo");
    JPanel panel = new JPanel();
    JTextField textField = new JTextField("", 10);
    JButton button = new JButton("OK");

    public TextFieldEvent(){
        textField.setEditable(true);
        //textField.setFont(new Font("Verdana", Font.BOLD, 18));
        //textField.setEditable(false);
        //textField.setEnabled(false);
//        textField.setText("This is a new text");
//        String s = textField.getText();
//        System.out.println(s);
//        frame.setTitle(s);

        //ActionListener - pri natiskane na Enter primerno
        /*
        textField.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("This is a text!");
            }
        });
        */

        //Dali sme cuknali v textboxa - ako ne sme - pishe please enter text, kato cuknem da pishem - "" *izchezva

        /*textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField.setText("Please enter some text");
            }
        });*/

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void warn(){
                button.setText(textField.getText());
            }
        });

        panel.add(textField);
        panel.add(button);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldEvent();
            }
        });

    }
}