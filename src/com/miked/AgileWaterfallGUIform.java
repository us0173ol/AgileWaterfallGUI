package com.miked;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

/**
 * Created by miked on 10/25/2016.
 */
public class AgileWaterfallGUIform extends JFrame{
    private JCheckBox CB1;
    private JCheckBox CB2;
    private JCheckBox CB3;
    private JCheckBox CB4;
    private JCheckBox CB5;
    private JCheckBox CB6;
    private JButton recommendButton;
    private JLabel resultsLabel;
    private JPanel rootPanel;


    private boolean A1, A2, A3, A4, A5, A6;
    int agile = 0;
    int waterfall = 0;

    public AgileWaterfallGUIform(){
        super("Agile waterfall GUI");
        setContentPane(rootPanel);
        pack();
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);




        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetResults();
                displayResults();

            }
        });

    }

    private void resetResults() {
        agile = 0;
        waterfall = 0;
    }
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
