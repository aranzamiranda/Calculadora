/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author chiky
 */
public class ListenerVerdes implements ActionListener{
    JTextField aux = new JTextField();
    JButtonC aux2 = new JButtonC();
    
    public ListenerVerdes(JTextField a) {
        this.aux = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        aux2 = (JButtonC) e.getSource();
        if("+/-".equals(aux2.getText())){
            int i,j, w=0;
            char a, b='#';
            String c=null,d=null;
            
            i = aux.getText().length();
            
            
            for(j=0; j<i; j++){
                a = aux.getText().charAt(j);
                if(a == 'x' || a == '/' || a == '−' || a == '+'){
                    w = 1;
                    b = a;
                }
            }
            
            if(w==1){
                for(j=i-1; j>=0; j--){
                a = aux.getText().charAt(j);
                if(a == 'x' || a == '/' || a == '−' || a == '+'){
                   if(c.charAt(0)=='-'){
                      c = c.substring(1, c.length());
                    }
                     else{
                       c = ("-" + c);
                        }
                        
                        b = a;
                        j=-1;
                    }
                    else{
                        if(c==null){
                            c = String.valueOf(a);
                        }
                        else{
                            c = (a + c);
                        }
                    }
                }
                
                for(j=0; j<i; j++){
                    
                    a = aux.getText().charAt(j);
                    if(a == 'x' || a == '/' || a == '−' || a == '+'){
                        j=i;
                    }
                    
                    else{
                        if(d==null){
                            d = String.valueOf(a);
                        }
                        
                        else{
                            d = (d + a);
                        }
                    }
                }
                aux.setText(d + b + c);
            }
            else{
                
                for(j=0; j<i; j++){
                    
                    a = aux.getText().charAt(j);
                    if(a == 'x' || a == '/' || a == '−' || a == '+'){
                        j=i;
                    }
                    else{
                        
                    if(c == null){
                            
                            c = String.valueOf(a);
                    }
                    else{
                            c = (c + a);
                        }
                    }
                }
                if(c.charAt(0)=='-'){
                    c = c.substring(1, c.length());
                }
                else{
                    c = ("-" + c);
                }
                
                aux.setText(c);
            }
        }
        else{
            aux.setText(aux.getText() + aux2.getText());
        }
    }
}