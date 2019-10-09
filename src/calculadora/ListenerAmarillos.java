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
public class ListenerAmarillos implements ActionListener{
    JTextField aux = new JTextField();
    JButtonC aux2 = new JButtonC();
    
    public ListenerAmarillos(JTextField a) {
        this.aux = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        aux2 = (JButtonC) e.getSource();
        
        if("C".equals(aux2.getText())){
            aux.setText(null);
        }
        
        if("CE".equals(aux2.getText())){
            aux.setText(aux.getText().substring(0, aux.getText().length()-1));
        }
        
        if(".".equals(aux2.getText())){
            int i,j,k=0;
            i = aux.getText().length();
            char aux3;
            
            for(j=0; j<i; j++){
                
                aux3 = aux.getText().charAt(j);
                
                if(aux3 == '.'){
                    k= 1;
                }
                
                if(aux3 == 'x' || aux3 == '/' || aux3 == '+' || aux3 == '−'){
                    k= 0;
                }
            }
            if(k==0){
                aux.setText(aux.getText() + aux2.getText());
            }
        }
        
        if("?".equals(aux2.getText())){
            aux.setText(null);
            aux.setText("Bienvenidos a mi calculadora...");
        }
    }
}