/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploeventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alumno
 */
public class EjemploEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                     JFrame frm = new JFrame("Ejemplo 1");
                    
                     frm.setLayout(new BorderLayout());
                     frm.setSize(800,600);
                     
                     PanelDibujo pnl = new PanelDibujo(frm);                     
                     pnl.addMouseListener(pnl);
                     pnl.addMouseMotionListener(pnl);
                     
                     frm.add(pnl,BorderLayout.CENTER);
                     
                     JLabel lbl = new JLabel();
                     frm.add(lbl,BorderLayout.SOUTH);
                     
                     frm.addWindowListener(new WindowAdapter(){
                             @Override
                             public void windowClosing(WindowEvent e){
                                     System.exit(0);
                             }
                     });
                     frm.setVisible(true);
                }
        });       
    }
    
}
