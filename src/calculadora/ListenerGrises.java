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
public class ListenerGrises implements ActionListener {
    JTextField aux = new JTextField();
    JButtonC aux2 = new JButtonC();
    FuncionesCalculadora c1 = new FuncionesCalculadora();
    
    public ListenerGrises(JTextField a) {
        this.aux = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        aux2 = (JButtonC) e.getSource();
        
        if("=".equals(aux2.getText())){
            int i, j, k;
            i = aux.getText().length();
            
            String cadena1 = null, cadena2 = null, cadena;
            
            char a1, a2, a3;
            
            for(j=0; j<i; j++){
                a1 = aux.getText().charAt(j);
                if(a1 == 'x' || a1 == '/' || a1 == '−' || a1 == '+' ){
                    c1.setNum1(Double.parseDouble(cadena1));
                    j=i;
                }
                else{
                    if(cadena1 == null){
                        cadena1 = String.valueOf(a1);
                    }
                    else{
                        cadena1 = (cadena1 + a1);
                    }
                    System.out.println("Numero 1:" + cadena1);
                }
            }
            
            for(k=i-1; k>=0; k--){
                a2 = aux.getText().charAt(k);
                if(a2 == 'x' || a2 == '/' || a2 == '−' || a2 == '+' ){
                    c1.setNum2(Double.parseDouble(cadena2));
                    k=0;
                }
                else{
                    if(cadena2 == null){
                        cadena2 = String.valueOf(a2);
                    }
                    else{
                        cadena2 = (a2 + cadena2);
                    }
                    System.out.println("Numero 2: " + cadena2);
                }
            }
            
            for(j=0; j<i; j++){
                a3 = aux.getText().charAt(j);
                
                if(a3 == 'x'){
                    cadena = String.valueOf(c1.multi());
                    
                    aux.setText(cadena);
                    j = i;
                }
                
                if(a3 == '/'){
                    cadena = String.valueOf(c1.division());
                    
                    if(c1.getNum2() == 0){
                        aux.setText("MATH-ERROR");
                    }
                    
                    else{
                        
                        aux.setText(cadena);
                    }
                    
                    j = i;
                }
                
                if(a3 == '−'){
                    cadena = String.valueOf(c1.resta());
                     
                    aux.setText(cadena);
                    j = i;
                }
                
                if(a3 == '+'){
                    cadena = String.valueOf(c1.suma());
                    
                    aux.setText(cadena);
                    j = i;
                }
            }
        }
        
        else{
            aux.setText(aux.getText() + aux2.getText());
        }
    }
}