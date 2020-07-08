package ��ͼ;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class ui1 extends JFrame{
	private map m;                 //��ǰ��ͼ
	private int width;             //����ϸ������
	private int height;            //����ϸ������
	private ceil[][] ceils;        //�ܵ�ϸ������
	private int w;                 //ϸ����
	private int h;                 //ϸ����
	private Graphics2D g;            //����
	private Container con;         //ȫ������
	private Color rectColor = new Color(0xf5f5f5); //������ɫ
	private Color liveColor = new Color(138,54,15); //������ɫ
	private Color deathColor=Color.white;          //������ɫ
	
	public Graphics2D getPaint() {           //��ȡ����
		return this.g;
	}
	
   /*
    * ui1���췽��
    */
   public ui1(map tempMap){        
	   this.m=tempMap;
	   con=getContentPane();             //��ʼ������      
	   width=m.getWidthNum();          //������ϸ����
	   height=m.getHeightNum();        //������ϸ����
	   ceils=m.getMap();                 //�������
	   w=ceil.w;         //����ϸ����
	   h=ceil.h;         //����ϸ����  
	   setBounds(100, 100, 600, 600);   
	   setVisible(true);
	   g=(Graphics2D)getGraphics();
	   con.setBackground(rectColor);
       setLayout(null);
	   setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       tpaint(g);                //��ʼ����������
       update(g);                //��ɫ
   }
   /*
    * ���������ͼ
    */
     public void tpaint(Graphics2D g) {
    	 g.setStroke(new BasicStroke(2.0f));   //���û��ʴ�ϸ
    	 g.setColor(Color.BLACK);
         g.drawRect(50, 50, 500, 500);
    	 for(int i=1;i<=width-1;i++) {      //������
  		   g.drawLine(50+i*w,50,50+i*w,50+height*h);
  	   }
    	 for(int j=1;j<=height-1;j++){      //������
  		   g.drawLine(50,50+j*h,50+w*width,50+j*h);
  	   }
     }
   /*
    * Ϊ��ͼ��ɫ
    */
   public void update(Graphics2D g) {                        //��������ϸ��״̬
	   g.setStroke(new BasicStroke(1.0f));
	    for(int i=0;i<width;i++) {
	    	for(int j=0;j<height;j++) {
	    		if(ceils[i][j].isFlag()) {     //�����ǰϸ��״̬Ϊ�Ⱦ��ɫ
	    			g.setColor(liveColor);
	    			g.fillRect(50+i*w+1, 50+j*h+1, w-2, h-2);
	    		}
	    		else {
	    			g.setColor(deathColor);
	    			g.fillRect(50+i*w+1, 50+j*h+1, w-2, h-2);
	    		}
	    	}
	    }
   }
   

}
