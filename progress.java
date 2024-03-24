import java.awt.*; 
import javax.swing.*; 
public class progress 
{
JProgressBar b;
progress()
{
    JFrame f=new JFrame();
    JPanel jp=new JPanel();
    f.setSize(100,100);
    f.setVisible(true);
    b=new JProgressBar();
    // b.setSize(10,50);
    b.setValue(10);
    b.setStringPainted(true);
    f.add(jp);
    jp.add(b);
}
public static void main(String[] args) {
   new progress();
}
    }

