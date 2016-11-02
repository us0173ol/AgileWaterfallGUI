package com.miked;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

/**
 * Created by miked on 10/25/2016.
 */
public class AgileWaterfallGUIform extends JFrame{
    //components for GUI form
    private JCheckBox CB1;
    private JCheckBox CB2;
    private JCheckBox CB3;
    private JCheckBox CB4;
    private JCheckBox CB5;
    private JCheckBox CB6;
    private JButton recommendButton;
    private JLabel resultsLabel;
    private JPanel rootPanel;


   //counters for point system to determine which method is better
    private int agile = 0;
    private int waterfall = 0;
    // GUI form
    private AgileWaterfallGUIform(){
        super("Agile waterfall GUI");
        setContentPane(rootPanel);
        pack();
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



        //when the recommend button is clicked reset the results and display the new ones
        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetResults();
                displayResults();

            }
        });

    }
    //reset results method, resets counters
    private void resetResults() {
        agile = 0;
        waterfall = 0;
    }
    //this is ugly but I lost my component tree when I had it like this and dont want
    //to mess anything up.
    private void displayResults() {
        if (CB1.isSelected()) {
            waterfall += 2;
        }
        if (!CB1.isSelected()) {
            agile += 2;
        }
        if (CB2.isSelected()) {
            waterfall++;
        }
        if (!CB2.isSelected()) {
            agile++;
        }
        if (CB3.isSelected()) {
            agile++;
        }
        if (!CB3.isSelected()) {
            waterfall++;
        }
        if (CB4.isSelected()) {
            waterfall++;
        }
        if (!CB4.isSelected()) {
            agile++;
        }
        if (CB5.isSelected()) {
            agile++;
        }
        if (!CB5.isSelected()) {
            waterfall++;
        }
        if (CB6.isSelected()) {
            agile++;
        }
        if (!CB6.isSelected()) {
            waterfall++;
        }
        if (agile > waterfall) {
            resultsLabel.setText("Agile is suggested based on your answers"
                    + "                 Agile-"+ agile + "     Waterfall-" + waterfall);
        }
        if (waterfall > agile){
            resultsLabel.setText("Waterfall is suggested based on your answers"
                    + "                 Agile-"+ agile + "     Waterfall-" + waterfall);
        }
    }
}
