package com.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lenovo on 22.5.2017 г..
 */
public class ButtonEvent {

    JFrame frame = new JFrame("Button Event");
    JButton button = new JButton("Click me");

    public ButtonEvent(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.PINK);
            }
        }); // inache tuk shte viknem (new Evt());
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonEvent();
            }
        });
    }

    //purvi approach za handle-vane na eventa - da suzadadem private class, drugiq e da go napravim s anonimen class napravo gore.
    /*
    private class Evt implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            button.setBackground(Color.PINK);
        }
    }
    */
}
