/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author chiky
 */
public class JFrameCalculadora extends JFrame{
   public JFrameCalculadora() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        JButtonC btnC = new JButtonC("C", dim, Color.yellow);
        JButtonC btnCE = new JButtonC("CE", dim, Color.yellow);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.green);
        JButtonC btnMulti = new JButtonC("x", dim, Color.gray);
        JButtonC btn7 = new JButtonC("7", dim, Color.green);
        JButtonC btn8 = new JButtonC("8", dim, Color.green);
        JButtonC btn9 = new JButtonC("9", dim, Color.green);
        JButtonC btnDiv = new JButtonC("/", dim, Color.gray);
        JButtonC btn4 = new JButtonC("4", dim, Color.green);
        JButtonC btn5 = new JButtonC("5", dim, Color.green);
        JButtonC btn6 = new JButtonC("6", dim, Color.green);
        JButtonC btnMenos = new JButtonC("−", dim, Color.gray);
        JButtonC btn1 = new JButtonC("1", dim, Color.green);
        JButtonC btn2 = new JButtonC("2", dim, Color.green);
        JButtonC btn3 = new JButtonC("3", dim, Color.green);
        JButtonC btnPlus = new JButtonC("+", dim, Color.gray);
        JButtonC btn0 = new JButtonC("0", dim, Color.green);
        JButtonC btnPunto = new JButtonC(".", dim, Color.yellow);
        JButtonC btnIgual = new JButtonC("=", dim, Color.gray);
        JButtonC btnAcerca = new JButtonC("?", dim, Color.yellow);
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        panelCentral.add(btn0);
        panelCentral.add(btnPunto);
        panelCentral.add(btnIgual);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        JTextField display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 50);
        display.setFont(nueva);
        
        
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ListenerVerdes esc = new ListenerVerdes(display);
        ListenerAmarillos esc2 = new ListenerAmarillos(display);
        ListenerGrises esc3 = new ListenerGrises(display);
        
        btn1.addActionListener(esc);
        btn2.addActionListener(esc);
        btn3.addActionListener(esc);
        btn4.addActionListener(esc);
        btn5.addActionListener(esc);
        btn6.addActionListener(esc);
        btn7.addActionListener(esc);
        btn8.addActionListener(esc);
        btn9.addActionListener(esc);
        btn0.addActionListener(esc);
        btnMM.addActionListener(esc);
        
        btnC.addActionListener(esc2);
        btnCE.addActionListener(esc2);
        btnAcerca.addActionListener(esc2);
        btnPunto.addActionListener(esc2);
        
        btnIgual.addActionListener(esc3);
        btnDiv.addActionListener(esc3);
        btnMulti.addActionListener(esc3);
        btnPlus.addActionListener(esc3);
        btnMenos.addActionListener(esc3);
    }
}
