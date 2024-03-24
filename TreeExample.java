import javax.swing.*;  
import javax.swing.tree.*;  
public class TreeExample
{    
TreeExample()
{  
   JFrame f=new JFrame();   
    DefaultMutableTreeNode india=new DefaultMutableTreeNode("india");  
    DefaultMutableTreeNode maharashtra=new DefaultMutableTreeNode("maharashtra");  
    DefaultMutableTreeNode gujrat=new DefaultMutableTreeNode("gujrat");  
    india.add(maharashtra);  
    india.add(gujrat);  
    DefaultMutableTreeNode mumbai=new DefaultMutableTreeNode("mumbai");  
    DefaultMutableTreeNode pune=new DefaultMutableTreeNode("pune");  
    DefaultMutableTreeNode nashik=new DefaultMutableTreeNode("nashik");  
    DefaultMutableTreeNode nagpur=new DefaultMutableTreeNode("nagpur");  
    maharashtra.add(mumbai); 
    maharashtra.add(pune);
    maharashtra.add(nashik);
    maharashtra.add(nagpur);      
    JTree jt=new JTree(india);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args)
 {  
    new TreeExample();  
}
}  