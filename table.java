import javax.swing.*;
import java.awt.*;
/*<applet code="table" width="200" height="200"></applet>*/
public class table extends JApplet
{
	public void init()
	{
		Object[] colHeads={"roll","name"};
		Object[][] data={
			{"1","ram"},
			{"2","sham"},
		};
		JTable jt=new JTable(data,colHeads);
		JScrollPane jsp = new JScrollPane(jt);
		Container c = getContentPane();
		c.add(jsp);
	}
}