import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;  
public class ajp_project extends JFrame implements ActionListener{  
TextArea ta;  
JButton b1,b2,b3,b4;
int count=0,countw=0,countx=0;  
ajp_project(){  

    ta=new TextArea();  

    ta.setBounds(50,50,300,200); 

    b1=new JButton("Word");  
    b1.setBounds(50,300,100,30);  
      
    b2=new JButton("Vowel");  
    b2.setBounds(180,300,100,30); 

    b3=new JButton("Whispace");  
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
    setTitle("count no. of words,vowels,tabspaces,whispaces of text area on clicking on respective button");
}  
public void actionPerformed(ActionEvent e){  
    String text=ta.getText(); 

    // code for counting the words
    if(e.getSource()==b1){  
    String s=ta.getText();
        for(int i=0;i<=text.length()-1;i++) {
            if(text.charAt(i)==' ')
                countx++;
            } 
         JOptionPane.showMessageDialog(this,"Total words: "+countx);  
         countx=0;
    }  

    // code for counting the vowels
    if(e.getSource()==b2){  
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
                {
                    count++;
            }
        }
        JOptionPane.showMessageDialog(this,"Total vowels: "+count);
        count=0;  
    }   

    // code for counting the spaces

     if(e.getSource()==b3){  
        String s=ta.getText();
        for(int i=0;i<=text.length()-1;i++) {
            if(text.charAt(i)==' ')
                countw++;
         }  
     JOptionPane.showMessageDialog(this,"Total whispaces: "+countw);
     countw=0;
}

    // code for counting tabspaces
    if(e.getSource()==b4){  
        String s=ta.getText();
        for(int i=0;i<=text.length()-1;i++) {
            if(text.charAt(i)=='\t')
                count++;
        } 
              JOptionPane.showMessageDialog(this,"Total tabspace: "+count);
        count=0;
    }  

}  
public static void main(String[] args) {  
    new ajp_project();  
}  
}