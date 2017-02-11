/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploeventos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class PanelDibujo extends JPanel implements MouseListener, MouseMotionListener {
    JFrame frmPadre;
    public PanelDibujo(JFrame frm){
        frmPadre = frm;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics2D g = (Graphics2D) this.getGraphics();
        
        g.setColor(Color.blue);
        g.setStroke(new BasicStroke(5));
        g.drawLine(e.getX(),e.getY(),e.getX(),e.getY()); 
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //JLabel lbl = (JLabel) frmPadre.getComponent(0);
        //lbl.setText("Movimiento del mouse en x = "+e.getX()+" , y="+e.getY());
        System.out.println("Movimiento del mouse en x = "+e.getX()+" , y="+e.getY());
    }    
}
