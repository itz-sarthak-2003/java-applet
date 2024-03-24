import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class authenticate extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JPasswordField jf;
	JTextField jt;
	JButton b;
	authenticate()
	{
		setLayout(new FlowLayout());
		setSize(200,200);
		setVisible(true);
		 l1=new JLabel("Email");
		l2=new JLabel("Password");
		jf=new JPasswordField(7);
		jt=new JTextField(15);
		b=new JButton("submit");
		add(l1);
		add(jt);
		add(l2);
		add(jf);
		add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=jt.getText();
		String s2=jf.getText();
		if((s1.equals("sagar"))&&(s2.equals("123")))
		{
			JOptionPane.showMessageDialog(this,"authenticate");
		}
		else
		{
			JOptionPane.showMessageDialog(this,"not authenticate");
		}
		}
		public static void main(String[] args) {
			new authenticate();
		}
	}
