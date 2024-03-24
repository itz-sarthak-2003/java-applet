import javax.swing.*;
public class scroll
{
scroll()
{
	JFrame f=new JFrame();
JTextArea jt =new JTextArea(200,200);
JScrollPane jp=new JScrollPane(jt);
jt.setSize(100,100);
f.add(jp);
f.setSize(100,100);
f.setVisible(true);
}
public static void main(String[] args) {
	new scroll();
}
}