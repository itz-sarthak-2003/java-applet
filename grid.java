import java.applet.*;
import java.awt.*;
/*<applet code="grid" width="200" height="200"></applet>*/
public class grid extends Applet
{
	Button b;
	public void init()
	{
		setLayout(new GridLayout(5,5));
		for(int i=1;i<=25;i++)
		{
			add(new Button(" "+i));
		}
		
	}
}