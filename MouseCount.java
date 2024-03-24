import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 public class MouseCount extends Applet implements MouseListener
{
    int count = 0;
    public void init()
    {
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        count++;
        showStatus("Number of time Clicked:"+count);
    }
    public void mouseEntered(MouseEvent me)
    {
    }
    public void mouseExited(MouseEvent me)
    {
    }
    public void mousePressed(MouseEvent me)
    {
    }
    public void mouseReleased(MouseEvent me)
    {
    }
}
/*
    <applet code="MouseCount" width=300 height=300>
    </applet>
*/
