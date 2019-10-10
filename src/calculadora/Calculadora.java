/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
//Aranza Miranda Montellano 
//Construcción de una calculadora básica gráfica
/**
 *
 * @author chiky
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrameCalculadora calcu = new JFrameCalculadora();
         calcu.setSize(600, 600);
        calcu.setVisible(true);
    }
    
}
