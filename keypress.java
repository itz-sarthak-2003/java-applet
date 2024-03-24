import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="keypress" width="200" height="200"></applet>*/
public class keypress extends Applet implements KeyListener
{
	String msg="";
	
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		msg="key is pressed";
		repaint();
	}
	public void keyTyped(KeyEvent e)
	{
	}
	public void keyReleased(KeyEvent e)
	{
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,200,200);
	}
}