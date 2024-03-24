import java.awt.*;
public class menu
{
menu()
{
Frame f=new Frame();
MenuBar mb=new MenuBar();
f.setMenuBar(mb);
Menu m1=new Menu("Colors");
MenuItem mn1=new MenuItem("red");
MenuItem mn2=new MenuItem("green");
MenuItem mn3=new MenuItem("black");
mn3.setEnabled(false);
MenuItem mn4=new MenuItem("orange");
mb.add(m1);
m1.add(mn1);m1.add(mn2);m1.add(mn3);m1.add(mn4);
f.setVisible(true);
f.setSize(200,200);
}
	public static void main(String[] args) {
		new menu();
	}
}