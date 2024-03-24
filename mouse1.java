import java.awt.*;  
import java.awt.event.*;  
public class mouse1 extends Frame implements MouseMotionListener{  
    mouse1(){  
        addMouseMotionListener(this);  
        setSize(300,300);  
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();  
    g.setColor(Color.RED);  
    g.fillOval(e.getX(),e.getY(),2,2);  
}   
public void mouseMoved(MouseEvent e) {   
}  
public static void main(String[] args) {  
    new MouseMotionListenerExample();  
}    
}
