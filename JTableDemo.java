import java.awt.*;
import javax.swing.*;
/*<applet code="JTableDemo" width=400 height=200></applet>*/
public class JTableDemo extends JApplet
 {
public void init() 
{
Object[] colHeads={"roll","name"};
Object[][] data={
            {"1","ram"},
            {"2","sham"},
        };
JTable table = new JTable(data, colHeads);
JScrollPane jsp = new JScrollPane(table);
Container c = getContentPane();
c.add(jsp);
}}
