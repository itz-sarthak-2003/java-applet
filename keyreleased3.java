import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="keyreleased3" width="200" height="200"></applet>*/
public class keyreleased3 extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent e)
	{

	}
	public void keyPressed(KeyEvent e)
	{
		msg="Key Pressed";
		repaint();
	}
	public void keyReleased(KeyEvent e)
	{

	}
	public void paint(Graphics g)
	{
		g.drawString(msg,200,200);
	}
}
