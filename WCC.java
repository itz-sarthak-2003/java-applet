import java.awt.event.*;  
import javax.swing.*;  
public class WCC extends JFrame implements ActionListener{  
JTextArea ta;  
JButton b1,b2,b3,b4;
int count=0;  
WCC(){  
     
    ta=new JTextArea();  
    ta.setBounds(50,50,300,200); 

    b1=new JButton("Word");  
    b1.setBounds(50,300,100,30);  
      
    b2=new JButton("Vowel");  
    b2.setBounds(180,300,100,30); 

    b3=new JButton("Space");  
    b3.setBounds(310,300,100,30);

    b4=new JButton("Tabspace");  
    b4.setBounds(440,300,100,30); 
      
    b1.addActionListener(this);  
    b2.addActionListener(this); 
    b3.addActionListener(this);  
    b4.addActionListener(this);

    add(b1);add(b2);add(b3);add(b4);add(ta);  
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=ta.getText();  
    if(e.getSource()==b1){  
        String words[]=text.split("\\s");  
        JOptionPane.showMessageDialog(this,"Total words: "+words.length);  
    }  
    if(e.getSource()==b2){  
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
                {count++;}
        }
        JOptionPane.showMessageDialog(this,"Total vowels: "+count);  
    }  
    if(e.getSource()==b3){  
        String words[]=text.split(" ");  
        JOptionPane.showMessageDialog(this,"Total space: "+words.length);  
    }  
    if(e.getSource()==b4){  
        String words[]=text.split("  ");  
        JOptionPane.showMessageDialog(this,"Total space: "+words.length);  
    }  

}  
public static void main(String[] args) {  
    new WCC();  
}  
}