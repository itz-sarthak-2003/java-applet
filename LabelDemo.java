import java.awt.*;
import java.applet.*;
/*<applet code="LabelDemo" width=300 height=200></applet>*/
public class LabelDemo extends Applet 
{
public void init()
{
Label one = new Label();
one.setText("ONE");
Label two = new Label("TWO");
Label three = new Label("THREE",Label.LEFT);
add(one);
add(two);
add(three);}}
