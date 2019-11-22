/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author TOSHIBA
 */
public class calculadora extends JFrame {
    JTextField entrasalida;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,igual,mas,menos,por,div,punto;
    double n1,n2;
    boolean flagmas=false,flagmenos=false,flagpor=false,flagdiv=false;
    public calculadora(){
        super("CALCULADORA");
        entrasalida = new JTextField (50);
        b0 = new JButton ("0");
        b1 = new JButton ("1");
        b2 = new JButton ("2");
        b3 = new JButton ("3");
        b4 = new JButton ("4");
        b5 = new JButton ("5");
        b6 = new JButton ("6");
        b7 = new JButton ("7");
        b8 = new JButton ("8");
        b9 = new JButton ("9");
        igual= new JButton ("=");
        mas= new JButton ("+");
        menos= new JButton ("-");
        por= new JButton ("*");
        div= new JButton ("/");
        punto= new JButton (".");
        entrasalida.setBounds(18,20,260,30);
        entrasalida.setEditable(false);
        b7.setBounds(18, 70, 50, 30);
        b8.setBounds(88, 70, 50, 30);
        b9.setBounds(158, 70, 50, 30);
        b4.setBounds(18, 120, 50, 30);
        b5.setBounds(88, 120, 50, 30);
        b6.setBounds(158, 120, 50, 30);
        b1.setBounds(18, 170, 50, 30);
        b2.setBounds(88, 170, 50, 30);
        b3.setBounds(158, 170, 50, 30);
        b0.setBounds(88, 220, 50, 30);
        igual.setBounds(158, 220, 50, 30);
        mas.setBounds(228,70,50,30);
        menos.setBounds(228, 120, 50, 30);
        por.setBounds(228, 170, 50, 30);
        div.setBounds(228, 220, 50, 30);
        punto.setBounds(18, 220, 50, 30);
        add(entrasalida);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(igual);
        add(mas);
        add(menos);
        add(por);
        add(div);
        add(punto);
        
        setSize(320,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        punto.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
              if(entrasalida.getText().indexOf(".")<0){
                   if(!entrasalida.getText().equals("")){
                        String temp = entrasalida.getText();
                        temp = temp + ".";
                        entrasalida.setText(temp);
                   }
                   else{
                       String temp = entrasalida.getText();
                       temp = temp + "0.";
                       entrasalida.setText(temp);
                   }
               }
                  

            }
            
        });
        b0.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(!entrasalida.getText().equals("0")){
                    String temp = entrasalida.getText();
                    temp = temp+0;
                    entrasalida.setText(temp);
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        b1.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"1");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
         b2.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"2");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
          b3.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"3");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
           b4.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"4");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
            b5.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"5");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
             b6.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"6");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
         b7.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"7");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
         b8.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"8");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
         b9.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(entrasalida.getText().equals("0")){
                    entrasalida.setText(null);
                }
                entrasalida.setText(entrasalida.getText()+"9");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        mas.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
               n1 = Double.parseDouble(entrasalida.getText());
               entrasalida.setText(null);
               
               flagmas=true;
               if(flagmenos){
                   flagmenos=false;
               }
               if(flagpor){
                   flagpor=false;
               }
               if(flagdiv){
                   flagdiv=false;
               }
            }
            
        });
        menos.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
               n1 = Double.parseDouble(entrasalida.getText());
               entrasalida.setText(null);
               flagmenos=true;
               if(flagmas){
                   flagmas=false;
               }
               if(flagpor){
                   flagpor=false;
               }
               if(flagdiv){
                   flagdiv=false;
               }
            }
            
        });
        por.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
               n1 = Double.parseDouble(entrasalida.getText());
               entrasalida.setText(null);
               
               flagpor=true;
               if(flagmenos){
                   flagmenos=false;
               }
               if(flagmas){
                   flagmas=false;
               }
               if(flagdiv){
                   flagdiv=false;
               }
            }
            
        });
        div.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
               n1 = Double.parseDouble(entrasalida.getText());
               entrasalida.setText(null);
               flagdiv=true;
               if(flagmenos){
                   flagmenos=false;
               }
               if(flagpor){
                   flagpor=false;
               }
               if(flagmas){
                   flagmas=false;
               }
            }
            
        });
        igual.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                n2= Double.parseDouble(entrasalida.getText());
                if(flagmas){
                   entrasalida.setText(String.valueOf(n1+n2)); 
                }
                if(flagmenos){
                   entrasalida.setText(String.valueOf(n1-n2)); 
                }
                if(flagpor){
                   entrasalida.setText(String.valueOf(n1*n2)); 
                }
                if(flagdiv){
                   entrasalida.setText(String.valueOf(n1/n2)); 
                }
                    
               
            }
            
        });
    }
    public static void main(String[] args) {
        calculadora c1 = new calculadora();
    }
}
