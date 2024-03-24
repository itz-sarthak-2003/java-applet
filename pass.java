import javax.swing.*;
import java.awt.*;
class pass extends JFrame
{
	pass()
	{
		JPanel jp=new JPanel();
		Label l=new Label("password");
		JPasswordField jf=new JPasswordField(7);
		jf.setEchoChar('#');
		jp.add(l);
		jp.add(jf);
        add(jp);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pass();
	}
}