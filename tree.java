import javax.swing.*;
import javax.swing.tree.*;
public class tree
{
	tree()
	{
		JFrame f=new JFrame();
		DefaultMutableTreeNode india=new DefaultMutableTreeNode("India");
		DefaultMutableTreeNode gujrat=new DefaultMutableTreeNode("Gujrat");
		india.add(gujrat);
		JTree jt=new JTree(india);
		f.add(jt);
		f.setSize(200,200);
		f.setVisible(true);
}
public static void main(String args[])
{
	new tree();
}
}