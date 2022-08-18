/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action_btn_change_color;


import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author UAS
 */
public class Action_Color extends Frame implements ActionListener{
    Button b1,b2;
     TextField t1;
      Label l1;    
    
    public Action_Color(){
       this.setVisible(true);
        this.setTitle("Action");
        this.setResizable(false);
        this.setSize(400,400);
        setLayout(null);
        b1=new Button("OK");
        b1.setBounds(50,50,70,30);
        add(b1);
        b1.addActionListener(this);
        b2=new Button("Cancel");
        b2.setBounds(150,50,70,30);
        add(b2);
       b2.addActionListener(this);
        t1=new TextField();
        t1.setBounds(100,100,100,30);
        add(t1);
        l1=new Label();
        l1.setBounds(100,140,100,30);
        add(l1);
        this.setBackground(Color.yellow);
        this.enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    } 
    public void processWindowEvent(WindowEvent e){
        switch(e.getID()){
            case WindowEvent.WINDOW_CLOSING:
                System.exit(0);
            
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b1){
    setBackground(Color.red);
    String msg=t1.getText();
    double s=Double.valueOf(msg)+5;
    l1.setText(""+s);
     
}
if(ae.getSource()==b2){
    setBackground(Color.green);
    

}
    }
}
