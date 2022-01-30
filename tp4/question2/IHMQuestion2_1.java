package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_1 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_1() {
        super("IHM Question2_1");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        enHaut.setBackground(Color.blue);
        setLocation(100,100);
        pack();show();

        TextArea txt1 = new TextArea("clic du button A");
        TextArea txt2 = new TextArea("clic du button B");
        TextArea txt3 = new TextArea("clic du button C");
      


        


        boutonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonObserver jbo1 = new question2.JButtonObserver("jbo1",txt1);
                JButtonObserver jbo2 = new question2.JButtonObserver("jbo2",txt1);
                JButtonObserver jbo3 = new question2.JButtonObserver("jbo3",txt1);
                jbo1.actionPerformed123(evt);
                jbo2.actionPerformed123(evt);
                jbo3.actionPerformed123(evt);
            }
        });
        boutonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonObserver jbo1 = new question2.JButtonObserver("jbo1",txt2);
                JButtonObserver jbo2 = new question2.JButtonObserver("jbo2",txt2);
                jbo1.actionPerformed123(evt);
                jbo2.actionPerformed123(evt);
                
            }
        });
         boutonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonObserver jbo1 = new question2.JButtonObserver("jbo1",txt3);
                
                jbo1.actionPerformed123(evt);
            
                
            }
        });
    }
    
    public static void main(String[] args){
        new IHMQuestion2_1();
    }

}
