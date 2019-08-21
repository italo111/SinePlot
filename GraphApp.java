/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class GraphApp extends JFrame {
	
	int x,y; 
	public GraphApp(){
            setTitle("Graph App");
            setSize(700,700);
            setResizable(true);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            x = 30;
            y = 300;
        } 
        public void paint(Graphics g){
            g.drawLine(300,30, 300, 600);
            g.drawLine(30, 300, 600, 300);
            g.setColor(Color.blue);
            g.fillOval(x, y, 3, 3);
            
            run();
            repaint();
        }
        public void run(){
            try{
                Thread.sleep(1);
                int ax,by;
                ax = (x - 300);
                by =(int)( 50*Math.sin(0.3*ax/3.14));
                x = ax + 300;
                y = 300-by;
                x++;
               
            }catch(Exception e){
                System.out.println("error");
            }
        }
           
		

	public static void main(String[] args){
		new GraphApp();
		
		
	}
}
    