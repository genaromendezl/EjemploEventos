/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploeventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

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
        JFrame frm = new JFrame("Ejemplo 1");
        frm.setSize(800,600);
        
        frm.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                        System.exit(0);
                }
        });
        
        frm.setVisible(true);
    }
    
}
