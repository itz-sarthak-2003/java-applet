import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class add2 extends JFrame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b;
	add2()
	{
		setLayout(new FlowLayout());
		setSize(200,200);
		setVisible(true);
		l1=new Label("number 1");
		l2=new Label("number 2");
		l3=new Label("Result");
		t1=new TextField(3);
		t2=new TextField(3);
		b=new Button("add");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		b.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{

    int num1=Integer.parseInt(t1.getText());
    int num2=Integer.parseInt(t2.getText());
    int a=Integer.parseInt(t1.)
    int value=num1+num2;
    l3.setText(""+value);
	}
	public static void main(String[] args) {
		new add2();
	}
}