import java.applet.*;
import java.awt.*;
/*<applet code="checkgroup" width="200" height="200"></applet>*/
public class checkgroup extends Applet
{
CheckboxGroup cbg;
Checkbox c1,c2,c3,c4;
	public void init()
	{
		c1= new Checkbox("java");
		c2=new Checkbox("C");
		add(c1);
		add(c2);
	c3=new Checkbox("python",cbg,false);
	c4=new Checkbox("shell",cbg,false);
	add(c3);
	add(c4);
	}
}